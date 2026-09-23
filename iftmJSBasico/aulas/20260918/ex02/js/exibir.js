//JSON.parse > converte uma string num objeto
usuarios = JSON.parse(localStorage.getItem("usuarios"));

for(i = 0; i < usuarios.info.length; i++){
    console.log(usuarios.info[i].nome);
}
