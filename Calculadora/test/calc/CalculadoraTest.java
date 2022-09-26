package calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
        System.out.println("Somar");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Somar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("Subtrair");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Subtrair(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Multiplicar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RestoDaDivisao method, of class Calculadora.
     */
    @Test
    public void testRestoDaDivisao() {
        System.out.println("RestoDaDivisao");
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.RestoDaDivisao(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
