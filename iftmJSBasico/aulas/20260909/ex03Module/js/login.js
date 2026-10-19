
//Exporta a função
export function verificarLogin(nome){
    if (nome=="Alfredo")
        alert("Login válido.");
    else
        alert("Login INVÁLIDO");
}

export function exibirMsg() {
    alert("Usuário inválido.");
}

export function validarUsuario(nome){
    if (nome=="Alfredo")
        alert("Usuário igual Alfredo");
    else
        alert("Usuario não válido, não é igual a Alfredo");
}

export function validarUsuario2(){
    let nome = document.getElementById("txtNome").value;
    if (nome=="Alfredo")
        alert("2 - Usuário igual Alfredo");
    else
        alert("2 - Usuario não válido, não é igual a Alfredo");
}