/**
 * 4. Solicite ao usuário as notas do 1o e 2o bimestres e, em seguida, informe se ele foi
aprovado/reprovado na disciplina. Um aluno será aprovado se a soma das notas for maior ou
igual a 60,0 pontos. Caso ele tenha sido reprovado informe a quantidade de pontos faltantes
para ele ter sido aprovado.
 */

//Coleta os dados
var pNota = parseFloat(prompt("Digite a nota do 1º bimestre:"));
var sNota = parseFloat(prompt("Digite a nota do 2º bimestre:"));

//Valida se transmite mensagem
let nFinal = sNota + pNota;
if (nFinal >= 60)
    alert("APROVADO");
else
    alert(`REPROVADO, faltam ${60 - nFinal} pontos`)