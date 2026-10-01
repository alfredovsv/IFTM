

// Ao abrir a página inicial do sistema (index.html), deverá aparecer numa caixa de diálogo para
// exibir a seguinte mensagem “Olá, seja bem-vindo!”.
alert("Olá, seja bem-vindo!");



// Ao clicar sobre o botão “Entrar”
// dessa página a seguinte validação deverá ser feita para o campo “Nome completo”:
//  Diferente de vazio; e
// Deve conter pelo menos duas palavras (Nome + sobrenome). Se a pessoa informar pelo
// menos uma palavra (Ex: “Wilton”) peça a ele para informar pelo menos NOME +
// SOBRENOME (use o comando alert() para essa finalidade).


//Prof Dr Wilton na aula já usuou a funciontion direto, segui o mesmo contexto
document.getElementById("btnEntrar").addEventListener("click", function (){
    let nome = document.getElementById("txtNome").value;

    //Valida se em branco ou null
    if (nome == null || nome == ""){
        alert ("Nome vazio, digite um nome válido.");
        return; // sai para não as outras valições
    }

    //Valida se tem pelo menos NOME e SOBRENOME
    let arrNome = nome.split(" ");
    if (arrNome.length < 2){
        alert ("Informe nome e sobrenome.");
        return;
    }

    //Arramzei o nome para utilizar nas próximas páginas
    localStorage.setItem("nome", nome);

    //Prof Dr Não foi explicando em sala ainda, optei em usar o window.localtion para manter mesma aba
    window.location.href = "menu.html";
});

