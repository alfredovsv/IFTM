//ts-check
/**
 * Como entrada, confirmação e exibição de informações ao usuário utilize apenas um destes
métodos em JavaScript: document.write, alert, confirm e prompt.
 * 6. Construa uma página web capaz de solicitar um texto e informar no corpo do documento a
concatenação da primeira com a última palavra do texto (deve haver um espaço entre as
palavras). */

let texto = prompt("Digite o texto:");
let arrTexto = texto.split(" ");
let primeiraPalavra = arrTexto[0];
let ultimaPalavra = arrTexto[arrTexto.length-1];

//Escreve na página, usei o write devido ao enunciado
document.write(`${primeiraPalavra} ${ultimaPalavra}`);
