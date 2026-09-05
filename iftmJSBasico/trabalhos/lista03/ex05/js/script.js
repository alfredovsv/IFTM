/**
 *   5. Complemente o exercício anterior com as seguintes informações: se o aluno estiver sido
            aprovado, informe a ele, além da situação de APROVADO a nota final obtida na disciplina.
            Caso ele tenha sido reprovado, informe a pontuação que ele precisaria para ter sido aprovado, além da mensagem de REPROVAÇÃO.

            <i>OBS: Tinha feito isso no exercicio anterior, apenas repeti o código aqui</i>
 */

//Manipula eventos
document.getElementById("btnResultado").addEventListener("click" , calculaResultado);

//Funções
function calculaResultado(){
    //Coleta dados 
    let nota1 = parseFloat(document.getElementById("txtNota1").value);
    let nota2 = parseFloat(document.getElementById("txtNota2").value);

    //Valida se vazio
    if(isNaN(nota1) || isNaN(nota2)){
        alert ("Preencha a valor da Nota!");
        return;
    }

    //Regra cada bimestre pode ter no máximo 50 ptos
    if (nota1 > 50 || nota2 > 50){
        alert ("Cada bimestre apenas 50 pontos. Informe a nota correta!");
        return;
    }

    //Valida Resultado
    let totalNotas = nota1 + nota2;
    if (totalNotas >= 60)
        alert ("APROVADO.");
    else
        alert (`REPROVADO. Falta(ram) ${60- totalNotas} ponto(s)`);

}