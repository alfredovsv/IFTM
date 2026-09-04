/**Como entrada, confirmação e exibição de informações ao usuário utilize apenas um destes
métodos em JavaScript: document.write, alert, confirm e prompt.

2. Construa uma página web capaz de solicitar o nome completo do usuário e, em seguida,
escrever no corpo do documento o nome informado e a quantidade de caracteres presentes no
texto.

 */

nomeCompleto = prompt("Digite seu nome completo:").trim(); //Vou trabar os espaços em branco

if (nomeCompleto != null) { //Se clicou em cancelar  ele não faz nada
    if (nomeCompleto != '') { //Trata, Se clicou em ok e não digitou o nome
        document.write(`<p> ${nomeCompleto} </p>`);
        document.write(`<p>O ${nomeCompleto} tem ${nomeCompleto.length} caracteres</p>`);
    } else
        document.write(`<p>Nome inválido. Tente novamente</p>`);
}