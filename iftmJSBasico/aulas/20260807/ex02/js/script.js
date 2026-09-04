/**
 * Exemplo da aula
 */

nVezes = prompt('Quantas vezes quer ver seu nome:');//Repare não convertemos para inteiro
cor = prompt("Que cor você quer no seu nome");

//Só funciona se não utilizar o defer e colocar o script no final
for (i = 0 ; i <nVezes ; i++) //conversão implicita
    document.write("<p>Alfredo Vicente</p>");
