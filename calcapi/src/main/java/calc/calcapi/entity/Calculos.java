package calc.calcapi.entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private Float input1;
    @Column(nullable = false)
    private Float input2;
    @Column(nullable = false)
    private CalcTypeEnum tipoCalculo;

    public CalcTypeEnum getTipoCalculo() {
        return tipoCalculo;
    }

    public void setTipoCalculo(CalcTypeEnum tipo){
        this.tipoCalculo = tipo;
    }

    public Float getInput1() {
        return input1;
    }

    public void setInput1(Float input1) {
        this.input1 = input1;
    }

    public Float getInput2() {
        return input2;
    }

    public void setInput2(Float input2) {
        this.input2 = input2;

    }

}
