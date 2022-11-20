package calc.calcapi;

import org.junit.After;
import org.junit.Test;

import calc.calcapi.repository.CalculadoraRepoitory;

import org.junit.Before;
import static org.junit.Assert.*;

public class MultiplicarTests {
    
    @Before
    public void setUp() {
        System.out.println(" === Inicio do teste ===");
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
        Float result = CalculadoraRepoitory.Multiplicar(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }
    
    @Test
    public void MultiplicacaoDeNumerosNegativos() {
        int num1 = -5;
        int num2 = -2;
        int expResult = 10;
        Float result = CalculadoraRepoitory.Multiplicar(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }
    
    @Test
    public void MultiplicacaoDeNumerosSaindoNegativos() {
        int num1 = -5;
        int num2 = 2;
        int expResult = -10;
        Float result = CalculadoraRepoitory.Multiplicar(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
        //assertNotEquals(expResult, 0);
    }
    
    @Test
    public void MultiplicacaoDeNumerosSaindoZero() {
        int num1 = 0;
        int num2 = 2;
        int expResult = 0;
        Float result = CalculadoraRepoitory.Multiplicar(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }
}
