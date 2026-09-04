/**
 * 6. Crie uma página web capaz de solicitar ao usuário o nome completo dele. Em seguida, mostre
o nome digitado no corpo da página, contendo a seguinte formatação:
• Cor: vermelho
• Tamanho da fonte: 20px
• Alinhamento: centralizado
 */

//Coleta os dados
let nCompleto = prompt('Digie o nome completo');

//Insere e formata o texto no document
let resul = document.querySelector('div#resultado');

//imputa o nome
resul.innerHTML = nCompleto;

//altera cor
resul.style.color = "red";

//altera tamanho
resul.style.fontSize = "24px";

//Centraliza
resul.style.textAlign = "center";

//Validar com Prof Dr Wilton se tem alguma maneira mais resumida e entender o contexto abaixo
// document.querySelector('div#resultado')
//     .textContent = nCompleto
//     .style.color = "red"
//     .style.fontSize = "24px";
//  //   .style.textAling = "center";

