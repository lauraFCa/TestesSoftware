package calc.calcapi.entity;

public class CalcResult {
    private String resultadoCalc;
    private String resultadoErro;

    public CalcResult(){}

    public String getResultadoCal() {
        return resultadoCalc;
    }

    public void setResultadoCalc(String resultadoCalc){
        this.resultadoCalc = resultadoCalc;
    }

    public String getResultadoErro() {
        return resultadoErro;
    }

    public void setResultadoErro(String resultadoErro){
        this.resultadoErro = resultadoErro;
    }
}
