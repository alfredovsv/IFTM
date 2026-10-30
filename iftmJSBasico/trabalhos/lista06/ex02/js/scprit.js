/**2. Crie uma página web contendo um formulário composto por duas caixas de texto, uma caixa
de seleção (<select>) composta pelos seguintes valores (1, 2, ... 10) e um botão. Ao clicar sobre
o botão a página irá aguardar o tempo correspondente aos segundos selecionado pelo usuário
na caixa de seleção para remover o texto da primeira caixa e inseri-lo na segunda caixa. */

//Coeleta os input
const txt1 = document.getElementById("txt1");
const txt2 = document.getElementById("txt2");

document.getElementById("btnTrocar").addEventListener("click",function (){
    //coleta o tempo e transforma em millissegundos
    let tempo = document.getElementById("tempo").value * 1000;

    //troca os camppos em 2000 milisegundos
    setTimeout(function(){
       txt2.value = txt1.value;
       txt1.value = "";
    }, tempo);
});