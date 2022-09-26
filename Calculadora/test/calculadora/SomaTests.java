package calculadora;

import calc.Calculadora;
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
    public void testSomar() {
        int num1 = 0;
        int num2 = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Somar(num1, num2);
        assertEquals(expResult, result);
    }
}
