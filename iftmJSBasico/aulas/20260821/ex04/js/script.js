let nomeCompleto = prompt("Digite o nome completo: ").trim();

//Validações
if(nomeCompleto != null){ //SE não clicou em cancelar
    if(nomeCompleto != ""){//Se clicou em ok e digitou vazio
        //1 Passo: Transformar a string -> vetor Ex: "Wilton de paula filho" -> [wilton|de|paula|filho]
        nomeCompleto = nomeCompleto.toLowerCase().split(" ");

        //2 Passo: Converter a primeira palavra do vetor para letras maiusculas
        nomeCompleto[0] = nomeCompleto[0].toUpperCase();

        //Junta os nomes
        nomeCompleto = nomeCompleto.join(" ");

        alert(nomeCompleto);
    }else{
        alert("Nome inválido. Tente novamente!")
    }

}