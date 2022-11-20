*** Settings ***
Library           RequestsLibrary
Library           Collections
Library           DateTime

Resource          keywords.resource

Test Setup        Inicia Conexao
Test Teardown     Finaliza Conexao



*** Test Cases ***
Testar SOMA correta
    [Documentation]    Valida resposta correta
    @{saida}=       Realizar requisição de CALCULO    15    22    Soma
    Confere o status code    200    ${saida}[1]

    ${respDesejada}=    create dictionary       resultadoErro=     resultadoCal=37.0
    Conferir corpo da resposta    ${saida}[0]    ${respDesejada}
    

Testar resposta de Erro
    [Documentation]    Valida resposta de erro
    @{saida}=     Realizar requisição de CALCULO    10    0    Divisao

    Confere o status code    400    ${saida}[1]

    ${saida_erro}=    create dictionary    status=400    error=Bad request    path=/calcular
    #Conferir corpo da resposta    ${saida}[0]    ${saida_erro}
