package calc.calcapi.entity;

public class CalcResult {
    private Float resultadoCalc;
    private String resultadoErro;

    public CalcResult(){}

    public Float getResultadoCal() {
        return resultadoCalc;
    }

    public void setResultadoCalc(Float resultadoCalc){
        this.resultadoCalc = resultadoCalc;
    }

    public String getResultadoErro() {
        return resultadoErro;
    }

    public void setResultadoErro(String resultadoErro){
        this.resultadoErro = resultadoErro;
    }
}
