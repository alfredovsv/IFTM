/**
 * 5) Crie um vetor de objetos para armazenar usuários (usuário e senha) e salve-os localmente no
navegador (via localStorage). O cadastro dessas informações deve ser feito diretamente via código,
sem o uso de formulários na interface.
 */

//Monta o objeto
usrs = {info : [
    {usuario: "alfredo" , senha: "123"}
    ,{usuario: "Joao" , senha: "1010"}
    ,{usuario: "mateus" , senha: "636000"}
]};
//Na aula sugeriu criar um vetor dentro do objeto


localStorage.setItem("usrs", JSON.stringify(usrs));