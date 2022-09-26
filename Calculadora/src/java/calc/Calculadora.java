package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "NewWebService")
public class Calculadora {

    /**
     * Web service operation: Sum of two numbers
     * @param num1
     * @param num2
     * @return sum
     */
    @WebMethod(operationName = "Somar")
    public int Somar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1+num2;
    }
    
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
    
    /**
     * Web service operation: Multiplication of two numbers
     * @param num1
     * @param num2
     * @return multiplication
     */
    @WebMethod(operationName = "Multiplicar")
    public int Multiplicar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1*num2;
    }
    
    /**
     * Web service operation
     * @param num1
     * @param num2
     * @return left
     */
    @WebMethod(operationName = "RestoDaDivisao")
    public int RestoDaDivisao(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1%num2;
    }
}
