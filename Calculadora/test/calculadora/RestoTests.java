package calculadora;

import calc.Calculadora;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class RestoTests {
    
    public Calculadora instance;

    public RestoTests() {
        System.out.println("Classe = RestoTests");
    }

    @Before
    public void setUp() {
        System.out.println(" === Inicio do teste ===");
        instance = new Calculadora();
    }
    
    @After
    public void tearDown() {
        System.out.println(" === Fim do teste ===");
    }


    /**
     * Test of RestoDaDivisao method, of class Calculadora.
     */
    @Test
    public void testRestoDaDivisao() {
        int num1 = 10;
        int num2 = 3;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.RestoDaDivisao(num1, num2);
        assertEquals(expResult, result);
    }
}
