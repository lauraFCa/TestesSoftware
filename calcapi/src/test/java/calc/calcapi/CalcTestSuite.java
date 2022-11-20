package calc.calcapi;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            SomarTests.class, 
            SubtrairTests.class, 
            MultiplicarTests.class, 
            DividirTests.class
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
