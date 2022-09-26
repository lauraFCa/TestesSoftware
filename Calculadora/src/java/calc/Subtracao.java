package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "Subtracao")
public class Subtracao {
    /**
     * Web service operation: Subtracting of two numbers
     * @param num1
     * @param num2
     * @return subtracting
     */
    @WebMethod(operationName = "Subtrair")
    public int Subtrair(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1-num2;
    }
}
