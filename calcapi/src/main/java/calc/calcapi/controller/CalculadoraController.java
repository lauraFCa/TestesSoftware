package calc.calcapi.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import calc.calcapi.entity.CalcResult;
import calc.calcapi.entity.CalcTypeEnum;
import calc.calcapi.entity.Calculos;
import calc.calcapi.repository.CalculadoraRepoitory;

@RestController
public class CalculadoraController {

    public CalcResult result = new CalcResult();

    @RequestMapping(value = "/calcular", method = RequestMethod.POST)
    public ResponseEntity<Object> Post(@Valid @RequestBody Calculos calc) {
        CalcTypeEnum tipo = calc.getTipoCalculo();
        Float valor1 = calc.getInput1();
        Float valor2 = calc.getInput2();

        if (tipo == CalcTypeEnum.Divisao) {
            try {
                Float res = CalculadoraRepoitory.Dividir(valor1, valor2);
                result.setResultadoCalc(String.valueOf(res));
                result.setResultadoErro("");
                return ResponseEntity.status(HttpStatus.OK).body(result);
            } catch (Exception e) {
                result.setResultadoCalc(null);
                result.setResultadoErro(e.getMessage());
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
            }
        }

        if (tipo == CalcTypeEnum.Multiplicacao)

        {
            try {
                Float res = CalculadoraRepoitory.Multiplicar(valor1, valor2);
                result.setResultadoCalc(String.valueOf(res));
                result.setResultadoErro("");
            } catch (Exception e) {
                result.setResultadoCalc(null);
                result.setResultadoErro(e.getMessage());
            }
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
        if (tipo == CalcTypeEnum.Soma) {
            try {
                Float res = CalculadoraRepoitory.Somar(valor1, valor2);
                result.setResultadoCalc(String.valueOf(res));
                result.setResultadoErro("");
            } catch (Exception e) {
                result.setResultadoCalc(null);
                result.setResultadoErro(e.getMessage());
            }
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }
        if (tipo == CalcTypeEnum.Subtracao) {
            try {
                Float res = CalculadoraRepoitory.Subtrair(valor1, valor2);
                result.setResultadoCalc(String.valueOf(res));
                result.setResultadoErro("");
            } catch (Exception e) {
                result.setResultadoCalc(null);
                result.setResultadoErro(e.getMessage());
            }
            return ResponseEntity.status(HttpStatus.OK).body(result);
        } else {
            result.setResultadoCalc(null);
            result.setResultadoErro("Informe o TIPO de calculo a ser informado!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
        }
    }
}