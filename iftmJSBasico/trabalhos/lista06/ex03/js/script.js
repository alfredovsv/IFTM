/**3. Crie uma página web para solicitar o nome completo do usuário e, em seguida, exibi-lo no
corpo do documento com o tamanho de fonte igual a 14 pixels. O tamanho do texto irá
aumentar gradativamente e automaticamente até chegar o tamanho de 40 pixels. O incremento
deverá ser de 2 em 2 pixels a cada intervalo de 0,5 segundo (meio segundo). */


document.getElementById("btnSalvar").addEventListener("click", exibirNome);

let temporizadorNome;
let exibeNome = document.getElementById("exibeNome");
let fontSizeNome = 14;

function exibirNome(){
    exibeNome.innerHTML = document.getElementById("nomeCompleto").value;
    fontSizeNome = 14;
    exibeNome.style = `font-size: ${fontSizeNome}px;`;
    play();

}

function play(){
    temporizadorNome = setInterval(function () {
        if (fontSizeNome <= 40)
            exibeNome.style = exibeNome.style = `font-size: ${fontSizeNome +=2}px;`
        else
            pause();
    }, 500);

}

function pause (){
    clearInterval(temporizadorNome); //Acho que poderia colocar dentro da função, mas achei mais facil de entender assim.
}