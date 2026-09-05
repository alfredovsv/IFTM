// 7. Crie uma página HTML capaz de validar o acesso de determinado usuário. A interface a ser
// implementada deverá ser composta pelos mesmos elementos mostrados na figura a seguir:
// As descrições de cada um dos elementos desta página bem como suas funcionalidades são
// detalhadas a seguir:


//Coletada e declara variáveis
let login = document.getElementById("login");
let senha = document.getElementById("senha");
let confirmarSenha = document.getElementById("confirmarSenha");


//Manipula evetentos
document.getElementById("btnEntrar").addEventListener("click",entrar);
document.getElementById("btnLimpar").addEventListener("click",limpar);


// VI. Botão “Limpar”: Ao pressionar este botão as informações dos seguintes campos
// deverão ser limpos: Login, Senha e Confirmar senha.
function limpar(){
    login.value = "";
    senha.value = "";
    confirmarSenha.value = "";
}


// V. Botão “Entrar”: Ao pressionar este botão a página deverá realizar as seguintes
// validações:
function entrar(){
    // a) Primeira validação: Verifica se o Login foi digitado corretamente, ou seja, se o
    // valor deste campo é diferente de vazio. Caso o usuário não tenha digitado
    // nenhuma informação, uma mensagem deverá aparecerá informando-o sobre o
    if (login.value == null || login.value == ""){
        alert("Digite um login valido");
        return;
    }

     if (senha.value == null || senha.value == "" || confirmarSenha.value == null || confirmarSenha.value == ""){
        alert("Digite um senha valido");
        return;
    }


    // b) Segunda validação: Só será realizada após a primeira validação e consistirá em
    // verificar se os dados dos campos “Senha” e “Confirmar senha” são iguais. Caso
    // os valores destes dois campos forem diferentes, a página deverá limpar os dados
    // dos campos “Senha” e “Confirmar senha” e informar ao usuário, através de uma
    // mensagem de erro, que as informações destes campos não são iguais.
    if (senha.value != confirmarSenha.value){
        alert("ERRO, senhas diferentes");
        limpar();
        return;
    }


    // Caso contrário, o usuário será informado que todos os campos foram digitados
    // corretamente.
    alert("Sucesso. Todos os campos foram digitados corretamente.");

}



