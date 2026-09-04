/**
 * 3. Crie uma página web capaz de solicitar ao usuário o nome completo dele. Em seguida, peça a
ele para informar a idade. Por último, informe-o, através de uma mensagem de diálogo, se ele
já possui idade suficiente para tirar carteira de motorista. Utilize o formato para exibir a
mensagem final: FULANO, você já POSSUI idade para tirar carteira ou FULANO, você ainda
NÃO POSSUI idade para tirar carteira, ainda falta(m) X anos.
 */

//Coleta dados
var nCompleto = prompt("Digite seu nome completo:");
var idade = parseInt( prompt("Digite sua idade")); //Já converti para inteiro. Prof Dr Wilton, não fiz nenhuma validação,ok?!

//valida se tem idade para carteira e exibe mensagens. OBS não fiz validação se é numero, apenas segui o objtivo no exercicio
if (idade >= 18)
    alert(`${nCompleto}, você já possui idade para tirar carteira`);
else
    alert(`${nCompleto}, você ainda NÃO POSSUI idade para tirar carteira, ainda falta(m) ${18-idade} ano(s)`);