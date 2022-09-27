package calculadora;

import calc.Calculadora;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SubtracaoTests {

    public Calculadora instance;

    public SubtracaoTests() {
        System.out.println("Classe = SubtracaoTests");
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

    @Test
    public void SubtracaoDeNumerosNaturais() {
        int num1 = 5;
        int num2 = 1;
        int expResult = 4;
        int result = instance.Subtrair(num1, num2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void SubtracaoComNegativoEPositivo() {
        int num1 = -5;
        int num2 = 2;
        int expResult = -7;
        int result = instance.Subtrair(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void SubtracaoResultandoPositivo() {
        int num1 = -2;
        int num2 = -5;
        int expResult = 3;
        int result = instance.Subtrair(num1, num2);
        assertEquals(expResult, result);
    }
}
