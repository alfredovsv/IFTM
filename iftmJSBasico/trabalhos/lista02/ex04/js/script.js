
/**4. Construa uma página web capaz de solicitar o nome completo do usuário e, em seguida,
exibir através de uma mensagem de alerta o primeiro nome dele contendo letras maiúsculas
e o restante composto apenas por letras minúsculas. */

let nomeCompleto = prompt('Digite seu nome completo').trim();

if(nomeCompleto != null){//se não clicou em cancel
    if(nomeCompleto != ""){
        nomeCompleto = nomeCompleto.toLowerCase().split(" ");//Quebra string em array e já deixa em minunucs
        nomeCompleto[0] = nomeCompleto[0].toUpperCase(); //Altera o primeiro nome para Maisculo
        // //Vamos
        // let restanteNome = "";
        // for (let i = 1 ;i < arrNomes.length; i++ ){
        //     restanteNome += arrNomes[i] + " ";
        // }

        // alert(`${primeiroNome} ${restanteNome}`);

        nomeCompleto = nomeCompleto.join(" "); //Melhoria, exite o join que já faz acima
        alert(nomeCompleto);
    }else
        alert("Nome Inválido. Tente novamente");
}else{
    alert('Operação cancelada!');
}
