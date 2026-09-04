/*
nome = "alfredo vicente soares vieira";
alert(nome);

//Converte letras minúsculas para maiúsculas
nomeMaiscula = nome.toUpperCase();
alert(nomeMaiscula);

//Retorna a primeira letra do nome original
alert(nome.charAt(0));

//Converte letra maiusculas para minusculas
nomeMinuscula = nomeMaiscula.toLowerCase(); 
alert(nomeMaiscula.toLowerCase());

//remoção de caracteres em branco do lado direto e esquerdo
texto = "   Rua Blanche Galassi   ";
alert(texto.trim());

//substitui a primeira ocorrencia da palavra
paragrafo = "o carro parou na rua. Esse carro tá muito ruim. Preciso levar o carro na oficina. Tenho que ganhar mais dinheiro para trocar o meu carro amarelo";
alert(paragrafo);

localizar = "carro";
substituirPor = "automovel";
paragrafoNovo = paragrafo.replace(localizar,substituirPor);
alert(paragrafoNovo);

//Troca todas as ocorrências
paragrafoNovoTodos = paragrafo.replaceAll(localizar, substituirPor);
alert(paragrafoNovoTodos);

//Contagem de caracteres numa string
textoNovo = "Wilton";
alert(`Número de carateres = ${textoNovo.length}`);
console.log(`Número de carateres = ${textoNovo.length}`);

//texto
texto = prompt("Qual a palavra:");
for (i = 0; i < texto.length; i++){
    console.log(texto.charAt(i));
}
*/
texto = prompt("Digite uma palavra:");
//vamos trocar a primeira letra para maisculo
texto[0]= texto.charAt(0).toUpperCase();
alert(texto.charAt(0).toUpperCase());

//Exbie a primiera parte de um nome
nome = "Wilton de Paula Filho";
arrNOme = nome.split(" ");
alert(arrNOme[0].toUpperCase());

//Vamos imprimir o primeiro e o ultimo
nome = prompt("Digite o seu nome:");
arrNome = nome.split(" ");
alert (arrNome[0] + " " + arrNome[arrNome.length-1])

//Substring
//alert (nome.substring(1,4));
