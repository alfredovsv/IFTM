/**
 * 9) Implemente uma interface de LOGIN para solicitar o nome e senha de um usuário qualquer e
analisar se essas informações encontram-se cadastradas localmente no navegador do usuário. Se
sim, informe a mensagem “USUÁRIO JÁ EXISTENTE”, caso contrário informe “USUÁRIO
INEXISTENTE”.
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

    //VOU MANTER A CODIFICAÇÃO DO LISTA 07 e apenas escrer na tela se exixte ou não
    let resul = document.getElementById("resul");
    if (usuarioExiste)
        resul.innerText = "USUÁRIO JÁ EXISTENTE";
    else
        resul.innerText = "USUÁRIO INEXISTENTE";

}
