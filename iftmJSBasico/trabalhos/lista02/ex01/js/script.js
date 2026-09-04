/**1. Interprete o código abaixo (não use o navegador) e descubra o que ele faz.

Em seguida, você deverá executar o código acima no navegador e conferir a resposta produzida
com a sua resposta. Agora, altere o código-fonte acima de tal forma a atender os seguintes
requisitos:
• Ao invés de solicitar o nome completo da pessoa, a página deverá solicitar: o primeiro
nome e, em seguida, o sobrenome, em caixas de diálogo diferentes. Em seguida exibir o
nome completo da pessoa (nome + sobrenome) N vezes no corpo da página, um em cada
linha diferente, conforme mostrado no código acima. OBS: A quantidade N deverá ser
informada pelo usuário, através de uma caixa de diálogo.
• A página deverá solicitar também do usuário a cor que ele deseja ver no nome dele. A
aplicação da cor no nome completo deverá obedecer a seguinte sequência: 1o nome –
PRETO, 2o nome – COR INFORMADA PELO USUÁRIO, 3o nome – PRETO, 4o nome
- COR INFORMADA PELO USUÁRIO, e assim sucessivamente. */

let primeiroNome = prompt("Digite o primeiro Nome" , "Alfredo Vicente".trim());
let sobrenome = prompt("Digite o sobrenome" , "Soares Vieira").trim();
let repeticao = prompt("Digite quantas vezes quer repetir o nome","3").trim();
let cor = prompt("Digite a cor ex(red, blue, green): ","green");

//Primeiro vou juntar e separar em vetor
let nomeCompleto = `${primeiroNome} ${sobrenome}`;
let arrNome = nomeCompleto.split(" ");
let retorno = "";
for(let y = 1 ; y <= repeticao; y++){
    retorno += "<p>";
    for (let i = 0;i < arrNome.length; i++ ){
        if( (i+1)%2 != 0)
            retorno += `<span style='color: black;'>${arrNome[i]} </span>`;
        else
            retorno += `<span style='color: ${cor};'>${arrNome[i]} </span>`;
    }
    retorno += "</p>";
}

document.write(retorno);