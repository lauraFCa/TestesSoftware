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
    public void Given_NaturalNumbers_When_Subtracted_Then_ShouldBeSuccessfull() {
        int num1 = 5;
        int num2 = 1;
        int expResult = 4;
        int result = instance.Subtrair(num1, num2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void Given_NotNaturalNumbers_When_Subtracted_Then_ShouldBeSuccessfull() {
        int num1 = -5;
        int num2 = 1;
        int expResult = -6;
        int result = instance.Subtrair(num1, num2);
        assertEquals(expResult, result);
    }
}
