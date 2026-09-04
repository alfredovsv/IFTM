
/**7. Construa uma página web capaz de solicitar um texto e uma letra e informar no corpo do
documento apenas as palavras iniciadas com a letra informada (deve haver um espaço entre
as palavras). */

let texto = prompt("Digite um texto: ");
let letra = prompt("Digite uma letra:");

let arrTexto = texto.split(" "); //sepra as palavras por espaço
let palavraIncialLetra = "";
//Vou corre as palavras e validar qual incia com a letra selecionada
for(let i = 0; i < arrTexto.length; i++){
    if(arrTexto[i].toLowerCase().charAt(0) == letra.toLowerCase()) //Transformei todas em minuscula
        palavraIncialLetra += arrTexto[i] + " ";
}
if (palavraIncialLetra != "")
    document.write(`As palavras incidas com a letra ${letra} são ${palavraIncialLetra.trim()}`); //Coloquei o trim para tirar o último espaço
else
    document.write(`Nenhum palavra encontrada que inicie com a ${letra}`);
