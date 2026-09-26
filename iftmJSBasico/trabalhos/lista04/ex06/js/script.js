/*6) Em relação ao exercício anterior, incremente ele listando no corpo da página todos os usuários
e senhas armazenados localmente.*/

//Lebrando que os usuário já estão no localStore no exércicio anterior
let usuarios = JSON.parse(localStorage.getItem("usrs")); //Guardei na estrutura de objeto
let listaUsuarios = usuarios.info;
let impLista = "";
for (i = 0; i < listaUsuarios.length; i++){
    impLista += `<p>usuario: ${listaUsuarios[i].usuario} senha: ${listaUsuarios[i].senha} </p>`;
}

document.getElementById("usuarios").innerHTML = impLista;