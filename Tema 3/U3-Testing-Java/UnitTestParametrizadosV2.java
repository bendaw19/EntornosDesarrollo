/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
//     import org.junit.runners.JUnit4; //--> suma
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jmsa
 */
//@RunWith(JUnit4.class) para suma, sin Enclosed.class
//@RunWith(Enclosed.class)
public class CalculadoraTest
{
    //NOTE, los métods de esta clase son estáticos. Si no lo fuera habría que instanciar
    // un objeto de la clase calculadora en @Before y hacerlo null en @After  

    
//
//    /**
//     * Test of raiz method, of class Calculadora.
//     */
//    @RunWith(Parameterized.class)
//    public static class RaizTest
//    {
//        @Parameters
//        public static Collection<Object[]> data()
//        {
//            return Arrays.asList(new Object[][]
//            {
//                {  9.0, 3.0   }, { 16.0,4.0}
//            });
//        }
//
//        private double a,  expected;
//
//        public RaizTest(double a,  double expected)
//        {
//            this.a = a;
//            this.expected = expected;
//        }    
//        @Test
//        public void testRaiz()
//        {
//            System.out.println("raiz");
//            double result = Calculadora.raiz(a);
//            assertEquals(expected, result, 0.0); //third parameter is delta for floats
//            // TODO review the generated test code and remove the default call to fail.
//        //    fail("The test case is a prototype.");
//        }
//    }
//    /**
//     * Test of cuadrado method, of class Calculadora.
//     */
//    @RunWith(Parameterized.class)
//    public static class CuadradoTest
//    {
//
//        @Parameters
//        public static Collection<Object[]> data()
//        {
//            return Arrays.asList(new Object[][]
//            {  { 3.0,9.0 }, { 4.0,16.0 }      });
//        }
//
//        private double a, expected;
//        public CuadradoTest(double a,  double expected)
//        {
//            this.a = a;
//            this.expected = expected;
//        }
//        
//        @Test
//        public void testCuadrado()
//        {
//            System.out.println("cuadrado");
//            double result = Calculadora.cuadrado(a);
//            assertEquals(expected, result, 0.0);
//            // TODO review the generated test code and remove the default call to fail.
//            // fail("The test case is a prototype.");
//        }
//    }

    /**
     * Test of suma method, of class Calculadora.
     */
    
    @Test
    public void testSuma()
    {
        System.out.println("suma");
        int a = 0;
        int b = 0;
        int expResult = 0;
        double[] operator1 = {5., 8., 7.};
        double[] operator2 = {1., 2., 10.};
        double[] expectedResults = {6., 10., 17.};

        for (int i = 0; i < operator1.length; i++) 
        {
            double actualResult = Calculadora.suma(operator1[i], operator2[i]);
            assertEquals(expectedResults[i], actualResult,0.0);
        }
    
    
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculadora.
     */
    @Ignore
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    public CalculadoraTest()
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
        //calculadora = new Calculadora();
    }
    
    @After
    public void tearDown()
    {
        //calculadora=null;
    }    
}
