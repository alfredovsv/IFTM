// “Gato01.gif” (primeira imagem da esquerda para a direita): ao clicar sobre essa
// imagem deverá ser exibida a seguinte mensagem ao usuário, através de uma caixa de
// diálogo, “Oi <USUÁRIO>, tudo bem com você?", onde <USUÁRIO> corresponde ao
// primeiro nome da pessoa informado na página index.html;

document.getElementById("gato01").addEventListener("click", function (){
    let nome = localStorage.getItem("nome");
    alert(`Oi ${nome}, tudo bem com você?`);
});

// “Gato02.gif” (segunda imagem da esquerda para a direita): ao clicar sobre essa
// imagem o valor “0” localizado no texto “Carinhos: 0” deverá ser incrementado em uma
// unidade (a cada novo clique um novo incremento de uma unidade em relação ao valor
// anterior);
document.getElementById("gato02").addEventListener("click", function (){
    let contador = document.getElementById("contador");
    contador.innerText = parseInt(contador.innerText) + 1;
    
});


// “Gato03.gif” (terceira imagem da esquerda para a direita): ao posicionar o cursor do
// mouse sobre essa imagem ela deverá ser substituída pela imagem “Gato06.gif”, e ao retirar
// o cursor do mouse sobre a imagem “Gato06.gif” ela deverá ser restaurada para
// “Gato03.gif”;
document.getElementById("gato03").addEventListener("mouseenter", function (){
    let img = document.getElementById("gato03").src = "img/gato06.gif";
});
document.getElementById("gato03").addEventListener("mouseleave", function (){
    let img = document.getElementById("gato03").src = "img/gato03.gif";
});

// “Gato04.gif” (quarta imagem da esquerda para a direita): ao movimentar o cursor do
// mouse sobre essa imagem o texto abaixo dela deverá ser substituído por esse “Ai, pare de
// fazer cócegas!”, e ao retirar o cursor do mouse sobre a imagem o texto deverá ser restaurado
// para o texto inicial (lá lá ...);
document.getElementById("gato04").addEventListener("mousemove", function (){
    document.getElementById("cocegas").innerHTML = "Ai, pare de fazer cócegas!"
});
document.getElementById("gato04").addEventListener("mouseout", function (){
    document.getElementById("cocegas").innerHTML = "lá lá lá lá lá"
});

// “Gato05.gif” (quinta imagem da esquerda para a direita): ao clicar sobre o botão
// “Gerar número da sorte”, localizado abaixo da imagem “Gato05.gif”, deverá ser exibido
// um número aleatório entre 1 e 100 dentro da caixa de texto localizada abaixo do botão.
document.getElementById("btnSortear").addEventListener("click", function (){
    document.getElementById("numeroSorteado").value = parseInt(Math.random() * 100 + 1);
});
