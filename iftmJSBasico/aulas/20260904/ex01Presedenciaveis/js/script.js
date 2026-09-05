//inicialização do programa
//Abaixo vetor para armazenar a quantidade de votos dos candidatos
vetVotos = [0,0,0,0,0,0]; //0 voto para o primeiro canditado, 0 votos para segundo caditado

document.getElementById("qteVotos1").innerHTML = vetVotos[0];
document.getElementById("qteVotos2").innerHTML = vetVotos[1];
document.getElementById("qteVotos3").innerHTML = vetVotos[2];
document.getElementById("qteVotos4").innerHTML = vetVotos[3];
document.getElementById("qteVotos5").innerHTML = vetVotos[4];
document.getElementById("qteVotos6").innerHTML = vetVotos[5];


//Manipuladores de eventos
document.getElementById("btnIncrementar1").addEventListener("click",function () {incrementarVoto(1);});
document.getElementById("btnIncrementar2").addEventListener("click",function () {incrementarVoto(2);});
document.getElementById("btnIncrementar3").addEventListener("click",function () {incrementarVoto(3);});
document.getElementById("btnIncrementar4").addEventListener("click",function () {incrementarVoto(4);});
document.getElementById("btnIncrementar5").addEventListener("click",function () {incrementarVoto(5);});
document.getElementById("btnIncrementar6").addEventListener("click",function () {incrementarVoto(6);});

//funções
function incrementarVoto(nroCanditato){
    vetVotos[nroCanditato - 1]++;
   
    document.getElementById("qteVotos" + nroCanditato).innerHTML = vetVotos[nroCanditato - 1];

}


function gerarNumeroAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

// Gera um número inteiro entre 1 e 10 (inclusive)
let meuNumero = gerarNumeroAleatorio(1, 10);
console.log(meuNumero);

//parseInt( Math.random() *60) + 1