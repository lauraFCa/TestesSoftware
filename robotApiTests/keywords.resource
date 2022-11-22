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


json_property_should_equal
    [Arguments]    ${json}    ${property}    ${value_expected}
    ${value_found} =      Get From Dictionary    ${json}    ${property}
    ${error_message} =    Catenate    SEPARATOR=    A propriedade "${property}" deveria ser "${value_expected}" mas fio encontrado "${value_found}"
    Should Be Equal As Strings    ${value_found}    ${value_expected}    ${error_message}    values=false

Confere o status code
    [Arguments]     ${STATUS_ESPERADO}    ${STATUS_RECEBIDO}
    Should Be Equal As Strings   ${STATUS_RECEBIDO}     ${STATUS_ESPERADO}
    Log    Status Code Retornado: ${STATUS_RECEBIDO} -- Status Code Esperado: ${STATUS_ESPERADO}


Realizar requisição de Falha
    [Arguments]         ${FALHA}    ${VALOR1}     ${VALOR2}     ${TIPO}
    ${corpo}=     create dictionary    input1=${VALOR1}    input2=${VALOR2}    tipoCalculo=${TIPO}
    ${head}=      create dictionary    Content-Type=application/json
    ${RESPOSTA}=         Run Keyword And Continue On Failure    Post On Session     secao   /${PATH}     headers=${head}    json=${corpo}
    [Return]    ${RESPOSTA.json()}


Realizar requisição de CALCULO
    [Arguments]         ${VALOR1}     ${VALOR2}     ${TIPO}
    ${corpo}=     create dictionary    input1=${VALOR1}    input2=${VALOR2}    tipoCalculo=${TIPO}
    ${head}=      create dictionary    Content-Type=application/json
    ${RESPOSTA}=         POST On Session     secao   /${PATH}     headers=${head}    json=${corpo}
    Confere o status code    200    ${RESPOSTA.status_code}
    [Return]    ${RESPOSTA.json()}



Conferir corpo da resposta
    [Arguments]         ${RESPOSTA}    ${RESP_DESEJADA}
    Dictionaries Should Be Equal    ${RESPOSTA}    ${RESP_DESEJADA}


Comparar propriedade Json
    [Arguments]  ${json}  ${property}  ${value_expected}
    json_property_should_equal    ${json}    ${property}    ${value_expected}