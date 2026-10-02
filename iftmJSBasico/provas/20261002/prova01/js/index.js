alert("Seja bem-vindo!");

document.getElementById("txt01").value = "Instituto Federal do Trigângulo Mineiro";
document.getElementById("txt02").value = "Sistemas para Internet";

document.getElementById("btnProcessar").addEventListener("click", function (){

    //Coleta dados
    let txt01 = document.getElementById("txt01").value;
    let txt02 = document.getElementById("txt02").value;



    //Validação de campos vazios
    if(txt01 == null || txt02 == null || txt01 == "" || txt02 == ""){
        alert("Todos os campos devem ser preenchidos!");
        return; //Finalizo aqui
    }

    //Optei armazenar um por vez, me sito mais seguro no momento
    localStorage.setItem("txt01",txt01);
    localStorage.setItem("txt02",txt02);

    window.location.href  = "dashboard.html";

});

document.getElementById("btnEmotion").addEventListener("click", function(){
    window.location.href  = "emojis.html";
});