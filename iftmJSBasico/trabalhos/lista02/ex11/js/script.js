/**11. Construa uma página web capaz de solicitar ao usuário um texto qualquer e, em seguida,
duas palavras (uma de cada vez). Por último, mostre através de uma caixa de diálogo o texto
inicial alterado, substituindo a ocorrência da primeira palavra informada pelo usuário pela
segunda. */

let texto = prompt("Digite um texto:", "O carro quebrou na estrada de São Paulo. O carro foi levado para a oficina.");
let palavraLocalizar = prompt ("Digite a palavra que iremos localizar:", "carro");
let palabraSubstituir = prompt ("Por qual palavra iremos substituir:","caminhão");

alert(texto.replaceAll(palavraLocalizar , palabraSubstituir ));


