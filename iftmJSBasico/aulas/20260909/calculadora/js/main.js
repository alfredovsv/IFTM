import calc from "./calculadora.js";

//Coleta as valores
let a = document.getElementById("txtValor1");
let b = document.getElementById("txtValor2");
let resul = document.getElementById("txtResultado");


//Cria os eventos
document.getElementById("btnSomar").addEventListener("click", function(){ 
    resul.value = calc.somar(a.value , b.value);
});

document.getElementById("btnSubtrair").addEventListener("click", function(){ 
    resul.value = calc.subtrair(a.value , b.value);
});

document.getElementById("btnMultiplicar").addEventListener("click", function(){ 
    resul.value = calc.multiplicar(a.value , b.value);
});

document.getElementById("btnDividir").addEventListener("click", function(){
    if (parseFloat(b.value) == 0){
        alert("Segundo valor não pode ser 0");
        return;
    }
        
    resul.value = calc.dividir(a.value , b.value);
});

