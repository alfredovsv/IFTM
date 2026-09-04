/**
 * 5. Construa uma página web capaz de solicitar ao usuário o nome completo dele e, em seguida,
escreva no corpo do documento a quantidade de caracteres contida no nome informado.
 */


//Coleta dos dados
let nCompleto = prompt('Digite seu nome completo:');

//Vou coletar a div e já colocar a quanitdade de caracteres 
document.querySelector('div#resultado').textContent = `A quanidade de caracteres do nome é ${nCompleto.length}`;

//OBS, Prof Dr Wilton, coloque defer na chamada do script, inclusive não tinha conhecimento e te agredeço