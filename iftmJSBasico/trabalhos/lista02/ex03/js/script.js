/**3. Construa uma página web capaz de solicitar o nome completo do usuário e, em seguida,
exibir através de uma mensagem de alerta o nome informado contendo apenas letras
maiúsculas. */

let nomeCompleto = prompt("Digite seu nome completo:").trim();

//validações
if(nomeCompleto != null){//se não clicou no botão cancelar   
    if(nomeCompleto != "") //Se clicou ok e não é vazio
        alert(nomeCompleto.toUpperCase());
    else
        alert('Nome Inválido. Tente novamente!');
}
