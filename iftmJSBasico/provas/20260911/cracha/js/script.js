//Variavaies


//Modicador de enventos
document.getElementById("btnHTML").addEventListener("click" , function (){gerarCracha("HTML")});
document.getElementById("btnCSS").addEventListener("click" , function (){gerarCracha("CSS")});
document.getElementById("btnJS").addEventListener("click" , function (){gerarCracha("JS")});

//Funcoes
function gerarCracha(curso){

    let nome = document.getElementById("txtNome").value.trim();
    let restoNome = document.getElementById("txtRestoNome").value.trim();
    let cargo  = document.getElementById("txtCargo").value.trim().toLowerCase();

    //Validacaoes (Optei em fazer valicoes mesmo não solicitando)
    if (nome == null || nome == ""){
        alert("Digite um nome valido");
        return;
    }
        
    if (restoNome == null || restoNome == ""){
         alert("Digite o restante do nome valido");
         return;
    }

    if (cargo == null || cargo == ""){
         alert("Digite o cargo valido.");
         return;
    }

    //Vou fazer o cargo primeiro para fazer a valicação junto
    if (cargo == "professor" || cargo == "desenvolvedor"){
        //crachaCargo = cargo.charAt(0).toUpperCase() + cargo.toLowerCase().slice(1);
        if(cargo == "professor"){
            document.getElementById("crachaCargo").innerHTML = "<span style='color: green;  font-weight: bold;'>Professor</span>";
        }else if (cargo == "desenvolvedor")
            document.getElementById("crachaCargo").innerHTML = "<span style='color: red;  font-weight: bold;'>Desenvolvedor</span>";
    }else{
        alert("O cargo deve ser desenvolvedor ou professor.");
        return;
    }
       
    
    //Trata nome joga no html
    let crachaNome =`${nome} ${restoNome}`.toUpperCase();
    //document.getElementById("crachaNome").innerText = crachaNome;
    document.getElementById("crachaNome").innerHTML = `<span style='font-weight: bold;'>${crachaNome}</span>`;

    //Coleta inciais
    let arrNome = crachaNome.split(" ");
    let crachaInicias = "";
    for (i = 0; i < arrNome.length; i++){
        crachaInicias += arrNome[i].charAt(0);
    }
    document.getElementById("crachaInicias").innerText = crachaInicias;

    //Valida o curgo
    if(curso == "HTML")
        document.getElementById("crachaCurso").innerHTML= "<img src='img/logoHTML.webp'>";
    else if(curso == "CSS")
        document.getElementById("crachaCurso").innerHTML = "<img src='img/logoCSS.webp'>";
    else if(curso == "JS")
        document.getElementById("crachaCurso").innerHTML = "<img src='img/logoJS.webp'>";


    //Gera sala
    document.getElementById("crachaSala").innerHTML = `Sala ${Math.floor(Math.random() * 10) + 1}`;
     

    


    
}