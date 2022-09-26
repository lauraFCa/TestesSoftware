package calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            calculadora.SomaTests.class, 
            calculadora.SubtracaoTests.class, 
            calculadora.MultiplicacaoTests.class, 
            calculadora.RestoTests.class
        }
)
public class CalcTestSuite {
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println(" ### Inicio da Suite de Testes ###");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("### Fim da Suite de Testes ###");
    }
}
