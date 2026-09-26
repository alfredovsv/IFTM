/**
 * 7) Refatore o exercício 05, porém as informações do usuário e senha a serem armazenadas
localmente no navegador deverão ser provenientes de um formulário na interface.
 */

//Monta o objeto
// usrs = {info : [
//     {usuario: "alfredo" , senha: "123"}
//     ,{usuario: "Joao" , senha: "1010"}
//     ,{usuario: "mateus" , senha: "636000"}
// ]};
//Na aula sugeriu criar um vetor dentro do objeto

document.getElementById("btnSalvar").addEventListener("click", salvar);

function salvar(){
    //Coleta dados
    let txtUsuario = document.getElementById("txtUsuario").value;
    let txtSenha = document.getElementById("txtSenha").value;

    //Pega a variável no localStorage/
    //LEMBRANDO QUE O USUÁRIO JÁ ESTA NO LOCALSTORGE NOS EXERCICIOS ANTERIORS
    let usuarios = JSON.parse(localStorage.getItem("usrs"));


    //seta o novo usuaŕio
    usuarios.info.push({usuario : txtUsuario, senha : txtSenha});



    localStorage.setItem("usrs", JSON.stringify(usuarios));

}
