/**
 *  Construa uma página HTML contendo o mesmo layout mostrado na figura a seguir:
            O objetivo desta página é informar ao usuário, através de uma mensagem de alerta, se ele foi
            aprovado ou não em uma determinada disciplina. Para isso, o aluno deverá informar as notas do
            1º e 2º bimestres e, em seguida, clicar sobre o botão “Resultado”. Cada bimestre vale 50,0 pontos.
            Um aluno será aprovado se a soma das notas for maior ou igual a 60,0 pontos.
            Sugestão: Utilizar o conceito de tabela para organizar os elementos do formulário. A tabela poderá estar centralizada horizontalmente em relação a janela do navegador.
 */

//Manipula eventos
document.getElementById("btnResultado").addEventListener("click" , calculaResultado);

//Funções
function calculaResultado(){
    //Coleta dados 
    let nota1 = parseFloat(document.getElementById("txtNota1").value);
    let nota2 = parseFloat(document.getElementById("txtNota2").value);




}