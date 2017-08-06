/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.beans.PropertyChangeListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafi
 */
public class DealerinfoTest {
    
    public DealerinfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDealerid method, of class Dealerinfo.
     */
    @Test
    public void testGetDealerid() {
        System.out.println("getDealerid");
        Dealerinfo instance = new Dealerinfo();
        Integer expResult = null;
        Integer result = instance.getDealerid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDealerid method, of class Dealerinfo.
     */
    @Test
    public void testSetDealerid() {
        System.out.println("setDealerid");
        Integer dealerid = null;
        Dealerinfo instance = new Dealerinfo();
        instance.setDealerid(dealerid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDealername method, of class Dealerinfo.
     */
    @Test
    public void testGetDealername() {
        System.out.println("getDealername");
        Dealerinfo instance = new Dealerinfo();
        String expResult = "";
        String result = instance.getDealername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDealername method, of class Dealerinfo.
     */
    @Test
    public void testSetDealername() {
        System.out.println("setDealername");
        String dealername = "";
        Dealerinfo instance = new Dealerinfo();
        instance.setDealername(dealername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDealeraddress method, of class Dealerinfo.
     */
    @Test
    public void testGetDealeraddress() {
        System.out.println("getDealeraddress");
        Dealerinfo instance = new Dealerinfo();
        String expResult = "";
        String result = instance.getDealeraddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDealeraddress method, of class Dealerinfo.
     */
    @Test
    public void testSetDealeraddress() {
        System.out.println("setDealeraddress");
        String dealeraddress = "";
        Dealerinfo instance = new Dealerinfo();
        instance.setDealeraddress(dealeraddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDealerphoneno method, of class Dealerinfo.
     */
    @Test
    public void testGetDealerphoneno() {
        System.out.println("getDealerphoneno");
        Dealerinfo instance = new Dealerinfo();
        String expResult = "";
        String result = instance.getDealerphoneno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDealerphoneno method, of class Dealerinfo.
     */
    @Test
    public void testSetDealerphoneno() {
        System.out.println("setDealerphoneno");
        String dealerphoneno = "";
        Dealerinfo instance = new Dealerinfo();
        instance.setDealerphoneno(dealerphoneno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Dealerinfo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Dealerinfo instance = new Dealerinfo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Dealerinfo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Dealerinfo instance = new Dealerinfo();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Dealerinfo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dealerinfo instance = new Dealerinfo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPropertyChangeListener method, of class Dealerinfo.
     */
    @Test
    public void testAddPropertyChangeListener() {
        System.out.println("addPropertyChangeListener");
        PropertyChangeListener listener = null;
        Dealerinfo instance = new Dealerinfo();
        instance.addPropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePropertyChangeListener method, of class Dealerinfo.
     */
    @Test
    public void testRemovePropertyChangeListener() {
        System.out.println("removePropertyChangeListener");
        PropertyChangeListener listener = null;
        Dealerinfo instance = new Dealerinfo();
        instance.removePropertyChangeListener(listener);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
