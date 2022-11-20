package calc.calcapi;

import org.junit.After;
import org.junit.Test;

import calc.calcapi.repository.CalculadoraRepoitory;

import org.junit.Before;
import static org.junit.Assert.*;

public class SomarTests {
    
    @Before
    public void setUp() {
        System.out.println(" === Inicio do teste ===");
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
        Float result = CalculadoraRepoitory.Somar(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }
    
    @Test
    public void SomaValoresNegativos() {
        int num1 = -2;
        int num2 = -5;
        int expResult = -7;
        Float result = CalculadoraRepoitory.Somar(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }
    
    @Test
    public void SomaValoresParaSaidaNegativa() {
        int num1 = 2;
        int num2 = -5;
        int expResult = -3;
        Float result = CalculadoraRepoitory.Somar(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }
}
