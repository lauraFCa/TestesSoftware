package calc.calcapi;

import org.junit.After;
import org.junit.Test;

import calc.calcapi.repository.CalculadoraRepoitory;

import org.junit.Before;
import static org.junit.Assert.*;


public class DividirTests {
    
    public DividirTests() {
        System.out.println("Classe = RestoTests");
    }

    @Before
    public void setUp() {
        System.out.println(" === Inicio do teste ===");
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
        Float result = CalculadoraRepoitory.Dividir(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }

    @Test
    public void DivisaoComNegativo() {
        int num1 = -10;
        int num2 = 3;
        int expResult = -1;
        Float result = CalculadoraRepoitory.Dividir(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }

    @Test
    public void DivisaoPorZero() {
        int num1 = 10;
        int num2 = 0;
        assertThrows(ArithmeticException.class, () -> {
            CalculadoraRepoitory.Dividir(Float.valueOf(num1), Float.valueOf(num2));
        });
    }
}
