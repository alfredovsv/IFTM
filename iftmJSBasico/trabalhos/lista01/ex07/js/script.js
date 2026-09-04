/**
 * 7. Construa uma página web capaz de solicitar ao usuário três valores numéricos diferentes,
correspondentes aos valores RGB, nesta ordem. Informe na caixa de diálogo que cada valor
deverá estar dentro do intervalo [0,255]. Após a leitura dos três valores, o texto “Fundamentos
de Web Design II” deverá ser exibido ao usuário no corpo do documento da página com a cor
informado pela usuário.
 */

//coleta os dados
let rgb1 = prompt("RGB-1. Digite um númeo no intervaldo de 0 a 255:");
let rgb2 = prompt("RGB-2. Digite um númeo no intervaldo de 0 a 255:");
let rgb3 = prompt("RGB-3. Digite um númeo no intervaldo de 0 a 255:");

//Altera a cor do texto
document.querySelector("div#resultado").style.color = `rgb(${rgb1 },${rgb2}, ${rgb3} )`;
