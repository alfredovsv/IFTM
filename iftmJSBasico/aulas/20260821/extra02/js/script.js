let texto = prompt("Digite um texto: ", "Caminhão quebrou na companhia. Caminhão quebrado da prejuizo porque fica caro.");
//Caminhão quebrou na companhia. Caminhão quebrado da prejuizo porque fica caro.

let letraLocalizar = prompt("Digite a lebra da busca: ","c");
let letraSubstituir = prompt("Digite a letra que irá substituir: ","t");

let vetTexto = texto.split(" ");

for (let i = 0; i < vetTexto.length ; i++){
    
    
    if (vetTexto[i].charAt(0).toLowerCase() == letraLocalizar.toLowerCase() )//Tratei aqui, pois vou manter o formato que o usuário digitou
     vetTexto[i] = letraSubstituir + vetTexto[i].slice(1);

}

alert(vetTexto.join(" "));