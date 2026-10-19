// sempre utilizar ponta barra ./ 
import { verificarLogin, exibirMsg, validarUsuario, validarUsuario2 } from "./login.js";
import calc from "./calculadora.js";
// verificarLogin();
// exibirMsg();

// //Ideal é sempre passar a variável, pois fica desmarrado
// document.getElementById("btnValidar").addEventListener("click", function () {
//     validarUsuario(document.getElementById("txtNome").value);
// });

// //Testando document dentro do validar
// document.getElementById("btnValidar").addEventListener("click", validarUsuario2);

document.getElementById("btnValidar").addEventListener("click", function () {
    verificarLogin(document.getElementById("txtNome").value);
});

alert (calc.somar(10,20));





