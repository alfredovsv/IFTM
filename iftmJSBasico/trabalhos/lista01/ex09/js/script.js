/**
 * 9. Construa uma página web capaz de solicitar ao usuário uma expressão matemática, como por
exemplo ((5*8)-9), e, em seguida, informar, através de uma mensagem de alerta, o resultado
da expressão.
 */

//Coletar os dados
let expressao = prompt('Digite uma expressão matemática simples, exemplo "((5*8)-9)"');

//Confesso que não sabia desse tipo de solução
const resultado = new Function(`return ${expressao}`)();

//Exibe a solução
alert(resultado);