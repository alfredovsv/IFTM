// document.getElementById("btnBotao").addEventListener("click", function (){
//     setTimeout(function (){alert("Olá")}, 3000);
// });


document.getElementById("btnPlay").addEventListener("click", play);
document.getElementById("btnPause").addEventListener("click", pause);

let cronometro;

function play(){
    // setTimeout(exibirMsg, 1000); //Chama função após 1s
    cronometro = setInterval(exibirMsg, 1000); //Chama a função infinitamente, a cada 1s
}

function pause(){
    clearInterval(cronometro);
}

function exibirMsg(){
    document.getElementById("numAleatorio").innerHTML = parseInt (Math.random() * 10);
}
