
/**8. Construa uma página web capaz de solicitar um texto e exibir no corpo do documento todas
as palavras iniciadas com a letra ‘a’, seguidas das palavras iniciadas com a letra ‘b’, e assim
sucessivamente. Veja o exemplo abaixo: */
//amor carro bola bexiga caminhão aranha pastel

let texto = prompt("Digite um texto");
let arrTexto = texto.toLowerCase().split(" ").sort();//Ordei com Sort, não tratei letras com acentos já coloquei todos em minusculo para não precisar ficar revalidando

let letra = arrTexto[0].charAt(0)
let retorno = `<p>Palavra incidas com a letra ${letra}</p>`;
retorno += "<ul>"; //inica lista
for (let i = 0; i < arrTexto.length; i++){
    if(arrTexto[i].charAt(0) == letra)
        retorno += `<li>${arrTexto[i]}</li>`;
    else{
        retorno += "</ul>"; //Finaliza lista
        letra = arrTexto[i].charAt(0); //seta nova letra
        retorno += `<p>Palavra incidas com a letra ${letra}</p>`; // preva novo texto
        retorno += "<ul>"; //inica  nova lista
        retorno += `<li>${arrTexto[i]}</li>`; //já coloca a palavra na li
    }

}
retorno += "</ul>"; //Fecha lista

//Escreve via write
document.write(retorno);


