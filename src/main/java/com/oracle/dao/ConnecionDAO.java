package com.oracle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Frederick
 */

public class ConnecionDAO {
    
    private Connection con;

    // Para acceder a la variable con desde otras clases
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void Conectar() {
        String url = "jdbc:derby://localhost:1527/BaseTest";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String username = "root";
        String password = "root";
        
        try {
            Class.forName( driver ).newInstance();
            con = DriverManager.getConnection( url, username, password );
            System.out.println( "¡Conexión establecida!." );
        } catch (Exception ex) {
            Logger.getLogger(ConnecionDAO.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
        }
    }
    
    public void CerrarConeccion() {
        try {
            if( con != null && !con.isClosed() ) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnecionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
