btn = document.getElementById("btnTestar");
sensibilidade = 0;

//Aistener escutador de evento do navegador
//para não execucar, tem que passar uma função anonima () => exibirMsg("Olá, sou seu robô!"))
// btn.addEventListener("click", () => exibirMsg("Olá, sou seu robô!"));
//Sempre que passar 
btn.addEventListener("click", function () {exibirMsg("Olá, sou seu robô!")});
btn.addEventListener("mouseout", () => exibirMsg("Até logo"));
btn.addEventListener("mousemove", () => exibirMsg("Pare de fazer cócegas"));
//btn.addEventListener("dblclick", exibirMsg4);

function exibirMsg(msg){
    alert(msg);
}

function exibirMsg2(){
    alert("Até logo");
}

// function exibirMsg3(){
//     //alert("Pare de faer cócegas");
//     if (sensibilidade ==75){
//         alert("Pare de faer cócegas");
//         sensibilidade = 0
//     }
//     else
//         sensibilidade++

// }


