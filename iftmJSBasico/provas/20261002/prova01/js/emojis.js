const img = document.getElementById("impImage");

document.getElementById("btnAmor").addEventListener("click", function (){
    img.src = "imagens/amor.jpg";
});

document.getElementById("btnAlegre").addEventListener("click", function (){
    img.src = "imagens/alegre.jpg";
});

document.getElementById("btnCoco").addEventListener("click", function (){
    img.src = "imagens/coco.jpg";
});

document.getElementById("impImage").addEventListener("click", function (){
    //Prof Dr Wilton, simpliquei, se não me engano mostrou em aula.
    document.getElementById("contador").value ++;
});