
// O texto contido no corpo dessa página (menu.html) deverá ser composto pelo
// primeiro nome + último nome da pessoa informado na página inicial (index.html) + o seguinte
// texto: “, seja bem-vindo ao jogo dos Felinos!”, conforme mostrado na imagem acima.

let nome = localStorage.getItem("nome");
let arrNome = nome.split(" ");
let nomeUsuario = `${arrNome[0]} ${arrNome[1]}`;
document.getElementById("nomeUsuario").innerHTML = nomeUsuario;
//Prof Dr Wilton, não revalidei se o nome esta setado, foquei apenas no exercício simulado, mas em outro momento melhoro se achar necessário, e não simpliciquei em uma só linha, mas por uma questão academica


// Ao clicar
// sobre o botão “Entrar como convidado” da página menu.html a página abaixo (felino.html)
// deverá ser aberta.
document.getElementById("btnJogar").addEventListener("click", function () {
    window.location.href = "felino.html"
});
