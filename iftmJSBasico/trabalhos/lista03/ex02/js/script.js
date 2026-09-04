/**2. Refatore (atualize) o exercício anterior, porém exiba na caixa de diálogo o texto contido na caixa de texto convertido para letras maiúsculas. */

btnExibir = document.getElementById("btnExibir")
                    .addEventListener("click",exibirNomeMaiusculo);

function exibirNomeMaiusculo(){
    //Coleta nome
    txtName = document.getElementById("txtName").value;

    //Validação
    if(txtName == ''){
        alert("Nome em branco. Digite o nome no campo.");
        return;
    }
    
    //Executa a tarefa após as validações
    alert(txtName.toUpperCase());
   
}
