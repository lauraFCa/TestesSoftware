package calculadora;

import calc.Calculadora;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MultiplicacaoTests {

    public Calculadora calculadora;

    public MultiplicacaoTests() {
        System.out.println("Classe = MultiplicacaoTests");
    }

    @Before
    public void setUp() {
        System.out.println(" === Inicio do teste ===");
        calculadora = new Calculadora();
    }
    
    @After
    public void tearDown() {
        System.out.println(" === Fim do teste ===");
    }

    @Test
    public void MultiplicacaoDeNumerosNaturais() {
        int num1 = 2;
        int num2 = 5;
        int expResult = 10;
        int result = calculadora.Multiplicar(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void MultiplicacaoDeNumerosNegativos() {
        int num1 = -5;
        int num2 = -2;
        int expResult = 10;
        int result = calculadora.Multiplicar(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void MultiplicacaoDeNumerosSaindoNegativos() {
        int num1 = -5;
        int num2 = 2;
        int expResult = -10;
        int result = calculadora.Multiplicar(num1, num2);
        assertEquals(expResult, result);
        //assertNotEquals(expResult, 0);
    }
    
    @Test
    public void MultiplicacaoDeNumerosSaindoZero() {
        int num1 = 0;
        int num2 = 2;
        int expResult = 0;
        int result = calculadora.Multiplicar(num1, num2);
        assertEquals(expResult, result);
    }
}
