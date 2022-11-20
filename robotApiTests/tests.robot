*** Settings ***
Library           RequestsLibrary
Library           Collections

Resource          keywords.resource

Test Setup        Inicia Conexao
Test Teardown     Finaliza Conexao

*** Variable ***
${saida_erro}=    {timestamp: '2022-11-20T20:18:39.758+00:00', 'status': 400, 'error': 'Bad Request', 'path': '/calcular' }


*** Test Cases ***
Testar SOMA correta
    [Documentation]    Valida resposta correta
    @{saida}=       Realizar requisição de CALCULO    15    22    Soma
    Confere o status code    200    ${saida}[1]

    ${valor}=    Convert To Number    37.0
    ${respDesejada}=    create dictionary       resultadoErro={Null}    resultadoCal=${valor}
    Conferir corpo da resposta    ${saida}[0]    ${respDesejada}
    

Testar resposta de Erro
    [Documentation]    Valida resposta de erro
    ${resposta}=     Realizar requisição de CALCULO    10    0    Divisao
    Conferir corpo da resposta    ${resposta}    ""
