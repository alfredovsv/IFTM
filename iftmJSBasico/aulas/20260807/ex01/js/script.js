idade = prompt ("Qual sua idade?");


//Exemplos da aula
valor = prompt("Digite um número inteiro");
alert (`O dobro ${valor} = ${valor *2}`);

//Exemplo erro + faz tanto soma tanto concatenação - Operador sobrecarregado
valor1 = prompt("1 - Digite um número inteiro:");
valor2 = prompt("2 - Digite um número inteiro:");
alert (`O a soma de ${valor1} e + ${valor2} = ${valor1 +valor2}`);
//resul sai concatenado

valor1 = parseInt(prompt("1 - Digite um número inteiro:"));
valor2 = parseFloat(prompt("2 - Digite um número inteiro:"));
alert (`O a soma de ${valor1} e + ${valor2} = ${valor1 +valor2}`);