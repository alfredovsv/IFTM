document.getElementById("btnMostrar").addEventListener("click", function(){
    let txt01 = localStorage.getItem("txt01");
    let txt02 = localStorage.getItem("txt02");

    //Ex01 - texto 01 informado
    document.getElementById("ex01").innerHTML = txt01;

    //Ex02 - texto 02 informado
    document.getElementById("ex02").innerHTML = txt02;

    //Ex03 - texto concatenado
    let txtConcatenado = `${txt01} ${txt02}`;
    document.getElementById("ex03").innerHTML = txtConcatenado;

    //Ex04 - primeira palavra
    let arrTxt = txtConcatenado.split(" ");
    document.getElementById("ex04").innerHTML = arrTxt[0];

    //Ex05 - última palavra
    document.getElementById("ex05").innerHTML = arrTxt[arrTxt.length-1];
    
    //Ex06 - txt01 minusculo txt02 MAISCULO
    document.getElementById("ex06").innerHTML = `${txt01.toLowerCase()} ${txt02.toUpperCase()}`;

    //EX07 - palavra 1 txt01 com palavra 02 txt02 MAICUULA
    let arrTxt2 = txt02.split(" ");
    document.getElementById("ex07").innerHTML = `${arrTxt[0]} ${arrTxt2[1].toUpperCase()}`;

    //EX08 - Total de palavras concatenadas
    document.getElementById("ex08").innerHTML = `${arrTxt.length}`;



});