import carros from "./carro.js";

let CARRO_ATUAL = 2;

function exibirCarro(){
    document.getElementById("imgCarro").src = `img/${carros[CARRO_ATUAL].src}`;
    document.getElementById("nome").innerHTML = carros[CARRO_ATUAL].nome;
    document.getElementById("potencia").innerHTML = carros[CARRO_ATUAL].potencia;
}

function main(){
    exibirCarro();
}



main();