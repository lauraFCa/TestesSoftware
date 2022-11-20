# Testes de Software

Programa básico para criar testes unitários

WebService "Calculadora"

## Métodos

```
@WebMethod(operationName = "Somar")
public int Somar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    return num1+num2;
}


@WebMethod(operationName = "Subtrair")
public int Subtrair(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    return num1-num2;
}


@WebMethod(operationName = "Multiplicar")
public int Multiplicar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    return num1*num2;
}


@WebMethod(operationName = "RestoDaDivisao")
public int RestoDaDivisao(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
    return num1%num2;
}

```

## Cenários

| Método             | Num | Cenário              | Entrada          | Saída            |
| ------------------ | --- | -------------------- | ---------------- | ---------------- |
| **Somar**          | --  | -------------------- | ---------------- | ---------------- |
| .                  | 1   | Comum                | 2 e 5            | 7                |
| .                  | 2   | Números negativos    | -2 e 5           | 3                |
| .                  | 3   | Nulos                | 0 e 0            | 0                |
| **Subtrair**       | --  | -------------------- | ---------------- | ---------------- |
| .                  | 1   | Comum                | 5 e 2            | 3                |
| .                  | 2   | Entrada negativa     | 2 e -5           | 7                |
| .                  | 3   | Saída negativa       | 2 e 5            | -3               |
| .                  | 4   | Nulos                | 0 e 0            | 0                |
| **Multiplicar**    | --  | -------------------- | ---------------- | ---------------- |
| .                  | 1   | Comum                | 5 e 2            | 10               |
| .                  | 2   | Entrada negativa     | -2 e -5          | 10               |
| .                  | 3   | Saída negativa       | 2 e -5           | -10              |
| .                  | 4   | Nulos                | 0 e 0            | 0                |
| **RestoDaDivisao** | --  | -------------------- | ---------------- | ---------------- |
| .                  | 1   | Comum                | 5 e 2            | 1                |
| .                  | 2   | Entrada negativa     | 10 e -5          | 0                |
| .                  | 3   | Entrada negativa     | -5 e 10          | 0                |
| .                  | 4   | Nulos                | 0 e 0            | NaN              |
