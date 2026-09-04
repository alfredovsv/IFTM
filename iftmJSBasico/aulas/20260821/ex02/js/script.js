nomeCompleto = prompt("Digite seu nome completo:").trim(); //Vou trabar os espaços em branco

if (nomeCompleto != null) { //Se clicou em cancelar  ele não faz nada
    if (nomeCompleto != '') { //Trata, Se clicou em ok e não digitou o nome
        document.write(`<p> ${nomeCompleto} </p>`);
        document.write(`<p>O ${nomeCompleto} tem ${nomeCompleto.length} caracteres</p>`);
    } else
        document.write(`<p>Nome inválido. Tente novamente</p>`);
}
