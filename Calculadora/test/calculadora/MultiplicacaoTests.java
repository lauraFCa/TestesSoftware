package calculadora;

import calc.Calculadora;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MultiplicacaoTests {

    public Calculadora instance;

    public MultiplicacaoTests() {
        System.out.println("Classe = MultiplicacaoTests");
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
    public void Given_SimpleNumbers_When_Multiply_ShouldBeOk() {
        int num1 = 2;
        int num2 = 5;
        int expResult = 10;
        int result = instance.Multiplicar(num1, num2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void Given_NegativeNumbers_When_Multiply_ShouldBePositive() {
        int num1 = -12;
        int num2 = -2;
        int expResult = 24;
        int result = instance.Multiplicar(num1, num2);
        assertEquals(expResult, result);
    }
}
