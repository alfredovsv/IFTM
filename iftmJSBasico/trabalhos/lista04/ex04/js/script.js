/*4) Refaça o exercício anterior, porém as informações (usuário e senha) deverão ser informadas a
partir de um formulário na interface.*/

document.getElementById("btnSalvar").addEventListener("click",salvar);


//funcões
function salvar(){
    //Coleta os dados
    let usuario = document.getElementById("usuario");
    let senha = document.getElementById("senha");


    //prepra ojeto
    let usr =  {
        "usuario": usuario.value
        ,"senha": senha.value
    };

    //seta o usuário 
    localStorage.setItem("usr", JSON.stringify(usr));
}