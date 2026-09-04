/**3. Construa uma página HTML contendo o mesmo layout mostrado na figura a seguir:

Ao digitar um valor dentro da primeira caixa de textos, “Digite um valor”, e após clicar sobre o botão
“Mostrar o dobro”, o dobro do valor digitado pelo usuário deverá ser exibido dentro da caixa de texto
“Dobro do valor”. */

// document.getElementById("btnMostrar").addEventListener("click",calcularDobro);

// function calcularDobro(){
//     document.getElementById("txtDobro").value = document.getElementById("txtValor").value * 2;
// }

//A primeira forma fiz acima, mas fui pesquisar boas práticas e fiz da forma abaixo

//Guarda os objetos do DOM
const txtValor = document.getElementById("txtValor");
const txtDobro = document.getElementById("txtDobro");
const btnMostrar = document.getElementById("btnMostrar")

btnMostrar.addEventListener("click",calcularDobro);

function calcularDobro(){
    //Converste explicitamente para float
    const valor = parseFloat(txtValor.value);

    //Valida se não é um núemro
    if (isNaN(valor)){
        alert ("Digite um número válido");
        txtDobro.value = "";
        return;
    }

    //Se feito as validacoes vamos calculcar
    txtDobro.value = valor * 2;
    
}
