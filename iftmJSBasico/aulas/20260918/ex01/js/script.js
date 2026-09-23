// localStorage.setItem("usuario","alfredovsv");
// localStorage.setItem("senha","12345678");   


usuario = document.getElementById("txtUsername");
senha = document.getElementById("txtPwd");
btnCadastrar = document.getElementById("btnCadastrar");

btnCadastrar.addEventListener("click", salvarUsuario);

function salvarUsuario(){
    //verificar se já existe o usuário
    usuarios = localStorage.getItem("usuarios");

    if(usuarios != null){
        
    }
    console.log(usuarios);
    localStorage.setItem("usuario", usuario.value);
    localStorage.setItem("senha",senha.value)
}