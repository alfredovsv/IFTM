
/**5. Construa uma página web capaz de solicitar do usuário um texto qualquer e, em seguida,
informar através de uma mensagem de alerta a quantidade de palavras contidas no texto. */

let texto = prompt("Digite um texto: ");
let arrTexto = texto.split(" ");

alert(`A quantidade de palavras do seu texto é: ${arrTexto.length}`);