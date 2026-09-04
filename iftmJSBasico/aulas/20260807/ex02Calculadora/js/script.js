/**
 * Calculadora
 */

//Coleta os dados
// let num1 =  parseFloat(prompt('Digite um número:'));
// let num2 = parseFloat(prompt('Digite outro número'));
// let operador = prompt ('Digite um operador + ou - ou * ou / ');

//Validar operador
// if(operador == "+"){
//     alert (`${num1} + ${num2} = ${num1 + num2}`);
// }else if (operador == "-"){
//     alert (`${num1} - ${num2} = ${num1 - num2}`);
// }else if (operador == "/"){
//     alert (`${num1} / ${num2} = ${num1 / num2}`);
// }else if (operador == "*"){
//     alert (`${num1} * ${num2} = ${num1 * num2}`);
// }

/**
 * Exemplo 1 professor
 */
//Coleta os dados
// operando1 =  parseFloat(prompt('Digite o primeiro valor:'));
// operando2 = parseFloat(prompt('Digite o segundo valor'));

// operador = prompt(
//     "Digite um operador: \n \n"
//     + "[ + ] Soma \n"
//     + "[ - ] Subtração \n"
//     + "[ * ] Multiplicação \n"
//     + "[ \/ ] Divisão \n"
// );

// if(operador == "+")
//     alert (`${operando1} + ${operando2} = ${operando1 + operando2}`);
// else if (operador == "-")
//     alert (`${operando1} - ${operando2} = ${operando1 - operando2}`);
// else if (operador == "/") {
//     if (operando2 == 0)
//         alert('Divisão invalida!');
//     else
//         alert (`${operando1} / ${operando2} = ${operando1 / operando2}`);
// }
// else if (operador == "*")
//     alert (`${operando1} * ${operando2} = ${operando1 * operando2}`);
// else
//     alert ('Operador invalido!');


/**
 * Exemplo 2 professor com switch
 */
//Coleta os dados

// operando1 =  parseFloat(prompt('Digite o primeiro valor:'));
// operando2 = parseFloat(prompt('Digite o segundo valor'));

// operador = prompt(
//     "Digite um operador: \n \n"
//     + "[ + ] Soma \n"
//     + "[ - ] Subtração \n"
//     + "[ * ] Multiplicação \n"
//     + "[ \/ ] Divisão \n"
// );

// switch (operador){
//     case "+":
//         alert (`${operando1} + ${operando2} = ${operando1 + operando2}`);
//         break;
//     case "-":
//         alert (`${operando1} -  ${operando2} = ${operando1 - operando2}`);
//         break;
//     case "*":
//         alert (`${operando1} *  ${operando2} = ${operando1 * operando2}`);
//         break;
//     case "/":
//         if (operando2 == 0)
//             alert('Divisão invalida!');
//         else
//             alert (`${operando1} / ${operando2} = ${operando1 / operando2}`);
//     default:
//         alert ('Operador invalido!');
// }

/**
 * Exemplo 3 professor com expressão
 */
//Coleta os dados

operando1 =  parseFloat(prompt('Digite o primeiro valor:'));
operando2 = parseFloat(prompt('Digite o segundo valor'));

operador = prompt(
    "Digite um operador: \n \n"
    + "[ + ] Soma \n"
    + "[ - ] Subtração \n"
    + "[ * ] Multiplicação \n"
    + "[ \/ ] Divisão \n"
);

alert(eval(operando1 + operador + operando2));