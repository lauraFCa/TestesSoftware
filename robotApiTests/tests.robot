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
    ${saida}=       Realizar requisição de CALCULO    15    22    Soma
    ${respEsperada}=       Create dictionary    resultadoErro=     resultadoCal=37.0
    Conferir corpo da resposta    ${saida}    ${respEsperada}
    

Testar resposta de Erro
    [Documentation]    Valida resposta de erro
    ${RESPOSTA}=     Realizar requisição de Falha    400    10    0    Divisao
    ${respEsperada}=       Create dictionary    resultadoErro=     resultadoCal=37.0
    Conferir Corpo Da Resposta    ${RESPOSTA}    HTTPError: 400 Client Error: for url: http://localhost:8080/calcular
