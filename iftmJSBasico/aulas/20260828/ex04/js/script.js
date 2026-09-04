btnDobrar = document.getElementById("btnDobrar");
btnDobrar.addEventListener("click",dobrarValor);
txtValor = document.getElementById("txtValor");



function dobrarValor(){
    a = document.getElementById("txtValor").value;
    document.getElementById("txtDobro").value = a * 2;
}
