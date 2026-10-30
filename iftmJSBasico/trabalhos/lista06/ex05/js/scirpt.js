/**5. Crie uma página web que solicite N nomes ao usuário, armazene-os em um vetor e, em seguida,
exiba-os no corpo do documento (um embaixo do outro). Cada nome deverá ser exibido
automaticamente um após o outro após o intervalo de 1 segundo. */

let nome = document.getElementById("txtNome");
let vetNomes = [];
let resultado = document.getElementById("resultado");
let indiceExibicao = 0;
let intervalo;

document.getElementById("btnAdicionar").addEventListener("click", function(){

    vetNomes.push(nome.value);

    //limpa nome
    nome.value = "";

});

document.getElementById("btnExibir").addEventListener("click", function () {
    
    // //Function Wilton estou fazendo com forach apenas para praticar estudas extras,
    // //mas poderia fazer com for normal, i e lenght
    // vetNomes.forEach((nome) => { resultado.appendChild();

    // });

   intervalo =  setInterval(function (){
        if (indiceExibicao < vetNomes.length){
            resultado.innerHTML +=`<p>${vetNomes[indiceExibicao]}</p>`;
            indiceExibicao++;
        }else
            clearInterval(intervalo);
        
    }, 1000);
})