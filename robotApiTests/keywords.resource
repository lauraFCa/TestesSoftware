*** Settings ***
Library     RequestsLibrary
Library     DateTime
Library     JSONLibrary
Library     Collections

*** Variable ***
${HOST}         http://localhost:8080
${PATH}         calcular


*** Keywords ***

Inicia Conexao
    Create Session    secao    ${HOST}


Finaliza Conexao
    Delete All Sessions


Realizar requisição de CALCULO
    [Arguments]         ${VALOR1}     ${VALOR2}     ${TIPO}
    ${corpo}=     create dictionary    input1=${VALOR1}    input2=${VALOR2}    tipoCalculo=${TIPO}
    ${head}=      create dictionary    Content-Typ=application/json

    ${RESPOSTA}=        POST On Session     secao   /${PATH}     headers=${head}    json=${corpo}
    ${stCode}=    Convert To String    ${RESPOSTA.status_code}
    @{saida}=      Create List     ${RESPOSTA.text}    ${stCode}
    [Return]            @{saida}


Confere o status code
    [Arguments]     ${STATUS_ESPERADO}    ${STATUS_RECEBIDO}
    Should Be Equal As Strings   ${STATUS_RECEBIDO}     ${STATUS_ESPERADO}
    Log    Status Code Retornado: ${STATUS_RECEBIDO} -- Status Code Esperado: ${STATUS_ESPERADO}


Conferir corpo da resposta
    [Arguments]         ${RESPOSTA}    ${RESP_DESEJADA}
    ${resp}=      Convert String To Json    ${RESPOSTA}
    Dictionaries Should Be Equal    ${resp}    ${RESP_DESEJADA}

