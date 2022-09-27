package calculadora;

import calc.Calculadora;
import static java.lang.Integer.MAX_VALUE;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class SomaTests {
    
    public Calculadora instance;

    public SomaTests() {
        System.out.println("Classe = SomaTests");
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
    public void SomaValoresReais() {
        int num1 = 2;
        int num2 = 5;
        int expResult = 7;
        int result = instance.Somar(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void SomaValoresNegativos() {
        int num1 = -2;
        int num2 = -5;
        int expResult = -7;
        int result = instance.Somar(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void SomaValoresParaSaidaNegativa() {
        int num1 = 2;
        int num2 = -5;
        int expResult = -3;
        int result = instance.Somar(num1, num2);
        assertEquals(expResult, result);
    }
}
