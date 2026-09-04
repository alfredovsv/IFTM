//ts-check
/**9. Construa uma página web capaz de solicitar um texto e informar através de uma mensagem
de alerta se o texto informado é um palíndromo. 
exemplos
-osso
-Roma e amor
-ovo
*/


let texto = prompt("Diegite um texto: ","Roma e amor").toLowerCase(); //Para garantir a comparação
let arrTexto = texto.split("");
let arrReverso = arrTexto.reverse();
let textoReverso = arrReverso.join("");

if (texto == textoReverso)
    alert("O texto é um palíndromo")
else
    alert("O texto Não é um palíndromo");

//alert(textoReverso);

//Roma e amor


