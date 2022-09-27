package calculadora;

import calc.Calculadora;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class RestoTests {
    
    public Calculadora calculadora;

    public RestoTests() {
        System.out.println("Classe = RestoTests");
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
    public void DivisaoNumerosReais() {
        int num1 = 10;
        int num2 = 3;
        int expResult = 1;
        int result = calculadora.RestoDaDivisao(num1, num2);
        assertEquals(expResult, result);
    }

    @Test
    public void DivisaoComNegativo() {
        int num1 = -10;
        int num2 = 3;
        int expResult = -1;
        int result = calculadora.RestoDaDivisao(num1, num2);
        assertEquals(expResult, result);
    }

    @Test
    public void DivisaoPorZero() {
        int num1 = 10;
        int num2 = 0;
        assertThrows(ArithmeticException.class, () -> {
            calculadora.RestoDaDivisao(num1, num2);
        });
    }
}
