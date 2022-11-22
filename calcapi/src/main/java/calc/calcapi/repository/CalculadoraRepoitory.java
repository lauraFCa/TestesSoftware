package calc.calcapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import calc.calcapi.entity.Calculos;

@Repository
public interface CalculadoraRepoitory extends JpaRepository<Calculos, Long> {

    public static Float Somar(Float num1, Float num2) {
        return num1 + num2;
    }

    public static Float Subtrair(Float num1, Float num2) {
        return num1 - num2;
    }

    public static Float Multiplicar(Float num1, Float num2) {
        return num1 * num2;
    }

    public static Float Dividir(Float num1, Float num2){
        if(num2 == 0){
            throw new ArithmeticException("Nao e permitido a divisao por 0!");
        }else{
            return num1 % num2;
        }
    }
}
