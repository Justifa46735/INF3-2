/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komplexezahl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class KomplexeZahlTest
{
    
    public KomplexeZahlTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getReal method, of class KomplexeZahl.
     */
    @Test
    public void testGetReal()
    {
        System.out.println("getReal");
        KomplexeZahl instance = new KomplexeZahl();
        double expResult = 0.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImag method, of class KomplexeZahl.
     */
    @Test
    public void testGetImag()
    {
        System.out.println("getImag");
        KomplexeZahl instance = new KomplexeZahl();
        double expResult = 0.0;
        double result = instance.getImag();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addKomplex method, of class KomplexeZahl.
     */
    @Test
    public void testAddKomplex()
    {
        System.out.println("addKomplex");
        double real = 0.0;
        double imag = 0.0;
        KomplexeZahl instance = new KomplexeZahl();
        KomplexeZahl expResult = null;
        KomplexeZahl result = instance.addKomplex(real, imag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subKomplex method, of class KomplexeZahl.
     */
    @Test
    public void testSubKomplex()
    {
        System.out.println("subKomplex");
        double real = 0.0;
        double imag = 0.0;
        KomplexeZahl instance = new KomplexeZahl();
        KomplexeZahl expResult = null;
        KomplexeZahl result = instance.subKomplex(real, imag);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multi method, of class KomplexeZahl.
     */
    @Test
    public void testMulti()
    {
        System.out.println("multi");
        KomplexeZahl a = null;
        KomplexeZahl b = null;
        KomplexeZahl instance = new KomplexeZahl();
        KomplexeZahl expResult = null;
        KomplexeZahl result = instance.multi(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class KomplexeZahl.
     */
    @Test
    public void testDiv()
    {
        System.out.println("div");
        KomplexeZahl a = null;
        KomplexeZahl b = null;
        KomplexeZahl instance = new KomplexeZahl();
        KomplexeZahl expResult = null;
        KomplexeZahl result = instance.div(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReal method, of class KomplexeZahl.
     */
    @Test
    public void testSetReal()
    {
        System.out.println("setReal");
        double re = 0.0;
        KomplexeZahl instance = new KomplexeZahl();
        instance.setReal(re);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImag method, of class KomplexeZahl.
     */
    @Test
    public void testSetImag()
    {
        System.out.println("setImag");
        double im = 0.0;
        KomplexeZahl instance = new KomplexeZahl();
        instance.setImag(im);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abs method, of class KomplexeZahl.
     */
    @Test
    public void testAbs()
    {
        System.out.println("abs");
        KomplexeZahl instance = new KomplexeZahl();
        double expResult = 0.0;
        double result = instance.abs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class KomplexeZahl.
     */
    @Test
    public void testPrint()
    {
        System.out.println("print");
        KomplexeZahl instance = new KomplexeZahl();
        String expResult = "";
        String result = instance.print();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}