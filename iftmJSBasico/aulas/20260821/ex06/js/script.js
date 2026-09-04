let nomeCompleto = prompt("Digite seu nome: ").trim();

if(nomeCompleto != "" ){//Trata se clicou ok e não digiou nada
    let vetNomes = nomeCompleto.split(" ");
    document.write(`${vetNomes[0]} ${vetNomes.length > 1 ? vetNomes[vetNomes.length-1] : ""}` );
}else
    document.write("Nome Inválido. Tente novamente.");


//Mostre as inicias do nome
let nomeCompletoNovo = prompt("Digite o nome completo:");

nomeCompletoNovo = nomeCompletoNovo.split(" "); //Separa em Vetor
let inicias = "";
for(let i = 0; i < nomeCompletoNovo.length; i++){
    if(nomeCompletoNovo[i].length > 2)//Trata artigos e preposições a, o, de, do
        inicias += nomeCompletoNovo[i].charAt(0);
}

alert(inicias.toUpperCase());

