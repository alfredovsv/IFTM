/**  1- Construa uma página HTML contendo o mesmo layout mostrado na figura a seguir:
            Ao clicar sobre o botão “Exibir” do formulário a informação dentro da caixa de texto deverá ser
            exibida dentro de uma caixa de diálogo. */

bntExibir = document.getElementById("bntExibir");


bntExibir.addEventListener("click",exibirNome);

function exibirNome(){
    //Coleta dadospara exibir
    txtName = document.getElementById("txtName").value; 

    //Valida se nome foi devimente preenchido
    if (txtName != '')
        alert(txtName);
    else
        alert("Nome em branco, gentileza preencha o campo.");
}

