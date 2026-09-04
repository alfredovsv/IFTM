/**
 * 10. Construa uma página web capaz de solicitar do usuário um valor inteiro positivo (X) maior
            do que zero e, em seguida, o nome completo dele. Exiba no corpo do documento HTML o
            nome da pessoa informado X vezes. Os nomes deverão ser exibidos em linhas diferentes.
 */

//Coleta os dados
let nRepticao = prompt ('Digite um número inteiro maior que 0:');
let nCompleto = prompt ('Digite seu nome completo');

//Imprmi o nome a quantidade de vez da nRepetição
const resul = document.querySelector("div#resultado");
let texto = "";
for (i = 1; i<= nRepticao; i++){
   texto += `<p>${nCompleto}</p>`; //Optei em montar o texto primeiro e coloquei em pagrafamos para quebrar linha
}
resul.innerHTML = texto;
