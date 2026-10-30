/**
1. Crie uma página web contendo um formulário composto por duas caixas de texto e um botão.
Ao clicar sobre o botão a página irá aguardar 2 segundos para remover o texto da primeira
caixa e inseri-lo na segunda caixa. */


//Coeleta os input
const txt1 = document.getElementById("txt1");
const txt2 = document.getElementById("txt2");

document.getElementById("btnTrocar").addEventListener("click",function (){
    //troca os camppos em 2000 milisegundos
    setTimeout(function(){
       txt2.value = txt1.value;
       txt1.value = "";
    }, 2000);
});