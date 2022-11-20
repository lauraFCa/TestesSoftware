package calc.calcapi;

import org.junit.After;
import org.junit.Test;

import calc.calcapi.repository.CalculadoraRepoitory;

import org.junit.Before;
import static org.junit.Assert.*;


public class SubtrairTests {
    
    public SubtrairTests() {
        System.out.println("Classe = SubtracaoTests");
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
    public void SubtracaoDeNumerosNaturais() {
        int num1 = 5;
        int num2 = 1;
        int expResult = 4;
        Float result = CalculadoraRepoitory.Subtrair(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void SubtracaoComNegativoEPositivo() {
        int num1 = -5;
        int num2 = 2;
        int expResult = -7;
        Float result = CalculadoraRepoitory.Subtrair(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }
    
    @Test
    public void SubtracaoResultandoPositivo() {
        int num1 = -2;
        int num2 = -5;
        int expResult = 3;
        Float result = CalculadoraRepoitory.Subtrair(Float.valueOf(num1), Float.valueOf(num2));
        assertEquals(Float.valueOf(expResult), result);
    }

}
