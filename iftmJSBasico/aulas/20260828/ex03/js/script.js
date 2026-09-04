paragrafo = document.getElementById("paragrafo");

paragrafo.addEventListener("click",function () {
    mudarCor("red","yellow"); 
    alert("clicou");
} );
paragrafo.addEventListener("mouseout",function (){ mudarCor("black", "white");});
console.log(paragrafo);

function mudarCor(cor, backgronud){
    //paragrafo.style = `color: ${cor}; backgronud\-color: Black;`;
    paragrafo.style.color = cor;
    paragrafo.style.backgroundColor = backgronud;

}
