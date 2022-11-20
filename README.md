# Testes de Software

Repositório com programas para teste de software.

# calcapi - API em Java com Springboot

Possui um endpoint **POST** para realizar as contas.

Endpoint: ``` http://localhost:8080/calcular ```  
Recebe:  
```
{
    "input1": valor1,
    "input2": valor2,
    "tipoCalculo": "Soma"
}
```

Onde *tipoCalculo* pode ser: Soma, Subtracao, Divisao ou Multiplicacao.  

## Testes Unitarios em JUnit

Os mesmos implementados no trabalho anterior.  


# robotApiTests - Projeto de Teste de API com Robot Framework

*tests.robot*: Classe com os testes  
*keywords.resource*: Classe com os métodos de teste
