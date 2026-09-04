let nomeCompleto = prompt("Digite seu nome completo:").trim();

//validações
if(nomeCompleto != null){//se não clicou no botão cancelar   
    if(nomeCompleto != ""){ //Se clicou ok e não é vazio
        alert(nomeCompleto.toUpperCase());
    }else{
        alert('Nome Inválido. Tente novamente!');
    }
}