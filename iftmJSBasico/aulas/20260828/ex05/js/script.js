btnResultado = document.getElementById("btnResultado");
btnResultado.addEventListener("click",calculaNota);

function calculaNota(){
    nota1 = parseFloat(document.getElementById("txtNota1").value);
    nota2 = parseFloat(document.getElementById("txtNota2").value);

    notaTotal = nota1 + nota2;

    resultado = document.getElementById("resultado");
    if(notaTotal >= 60)
        //resultado.innerText = "APROVADO";
        alert("APROVADO");
    else
        // resultado.innerText = `REPROVADO, faltaram ${60 - notaTotal} ponto(s)`;
        alert(`REPROVADO, faltaram ${60 - notaTotal} ponto(s)`);
}