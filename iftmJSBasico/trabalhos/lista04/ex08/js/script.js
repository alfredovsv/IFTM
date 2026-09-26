/**
 * 8) Refatore o exercício 07 impedindo o cadastro de usuários iguais.
 */

document.getElementById("btnSalvar").addEventListener("click", salvar);

function salvar(){
    //Coleta dados
    let txtUsuario = document.getElementById("txtUsuario").value;
    let txtSenha = document.getElementById("txtSenha").value;

    //Pega a variável no localStorage/
    //LEMBRANDO QUE O USUÁRIO JÁ ESTA NO LOCALSTORGE NOS EXERCICIOS ANTERIORS
    let usuarios = JSON.parse(localStorage.getItem("usrs"));
    let usuarioExiste = false;

    //VAlidar se existe usuarios
    if(usuarios == null)
        usuarios = {info : []}; //Seta o objeto

    //Valdiar se o usuário já existe
    for (i = 0 ; i < usuarios.info.length; i++){
        if(usuarios.info[i].usuario == txtUsuario){
            usuarios.info[i].senha = txtSenha; //Apenas atualiza a senha
            usuarioExiste = true;
        }
    }

    //seta o NOVO usuário
    if (!usuarioExiste)
        usuarios.info.push({usuario : txtUsuario, senha : txtSenha});



    localStorage.setItem("usrs", JSON.stringify(usuarios));

}

