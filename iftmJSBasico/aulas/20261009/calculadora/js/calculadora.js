function somar (a, b){
    return parseFloat(a) + parseFloat(b);
}

function subtrair (a, b){
    return parseFloat(a) - parseFloat(b);
}

function multiplicar (a, b){
    return parseFloat(a) * parseFloat(b);
}

function dividir (a, b){
    return parseFloat(a) / parseFloat(b);
}

export default{
    somar,
    subtrair,
    multiplicar,
    dividir
}