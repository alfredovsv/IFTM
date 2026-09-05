/**
 * 6. Construa uma página HTML contendo o mesmo layout mostrado na figura a seguir:

            Esta página consiste em uma calculadora contendo apenas as operações de soma (+), subtração (-),
            multiplicação (*) e divisão (/). Para utilizá-la, o usuário deverá digitar o primeiro e segundo valores
            dentro das caixas “1o Valor” e “2o Valor”, respectivamente, e em seguida clicar sobre o botão
            correspondente a operação desejada. O resultado deverá ser exibido na última caixa “Resultado”.
            OBS: Trate a divisão por zero, além disso, as operações (+, -, * ou /) só poderão ser realizadas se
            houverem números digitados dentro de cada uma das caixas (1o e 2o valor).
 */

//Declara variáveis
let valor1 = parseFloat(document.getElementById("txtValor1"));
let valor2 = parseFloat(document.getElementById("txtValor2"));

//Manipula Evetons
//Pensei em implentar com querySelector e ir por class, mas me ative ao getElementById
document.getElementById("btnMais").addEventListener("click",adicao);
document.getElementById("btnMenos").addEventListener("click",subtracao);
document.getElementById("btnVezes").addEventListener("click",multiplicacao);
document.getElementById("btnDividir").addEventListener("click",divisao);


//Funcoes
//Coleta os dados e atualiza variaveis
function getDadosEValidacao(){
    valor1 = parseFloat(document.getElementById("txtValor1").value);
    valor2 = parseFloat(document.getElementById("txtValor2").value);

    if(isNaN(valor1) || isNaN(valor2)){
        alert("Digite um número válido");
        return false;
    }else
        return true;
}

function adicao(){
    //Coleta e valida os dados
    if(!getDadosEValidacao())
        return;

    //faz operacao e ipunta os dados no resultado
    document.getElementById("txtResultado").value = valor1 + valor2;
}

function subtracao(){
    //Coleta e valida os dados
    if(!getDadosEValidacao())
        return;

    //faz operacao e ipunta os dados no resultado
    document.getElementById("txtResultado").value = valor1 - valor2;
}

function multiplicacao(){
    //Coleta e valida os dados
    if(!getDadosEValidacao())
        return;

    //faz operacao e ipunta os dados no resultado
    document.getElementById("txtResultado").value = valor1 * valor2;
}

function divisao(){
    //Coleta e valida os dados
    if(!getDadosEValidacao())
        return;

    //Valicacao especial, nenhum número se divide por 0
    if (valor2 == 0){
        alert("Nenhum número se divide por 0");
        return;
    }

    //faz operacao e ipunta os dados no resultado
    document.getElementById("txtResultado").value = valor1 / valor2;
}