package com.oracle.dao;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frederick
 */
public class ConexionTest {
    
    @Test
    public void testConexion() {
        ConnecionDAO con = new ConnecionDAO();
        con.Conectar();
        
        Assert.assertNotNull( con.getCon() );
    }
}
