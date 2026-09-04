/**
 * 1. Construa uma página web capaz de solicitar em uma caixa primeiramente o primeiro nome do
usuário e, em seguida, em uma segunda caixa o seu sobrenome. Por último, exiba em uma
nova caixa seu nome completo da pessoa (nome + sobrenome). Deverá haver um espaço em
branco entre o primeiro nome e sobrenome.
 */

var pNome = prompt("Digite o primeiro nome:");
var sNome = prompt("Digite o sobrenome:");

//Concatena com espaçoos nomes e exibe o nome na caixa de alerta
alert(`Nome completo é ${pNome} ${sNome}`);
