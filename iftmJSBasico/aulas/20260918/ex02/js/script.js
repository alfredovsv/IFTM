//VETOR
vet = [10,20,30];
vet[3] = 40;
vet.push(50); // Colocar ou "empurrar o número no final"

// usr1 = { usuario: "Wilton", senha: "123"};//Aqui é um objeto
// usr2 = { usuario: "ana", senha: "654"};

// usuarios = [usr1,usr2];//Aqui é um vetor


//Vetor de objetos
usuarios = [
    {nome: "Alfredo", senha: "123"} ,
    {nome: "Ana", senha: "321"}
];

usuarios.push({nome: "teste", senha: "111"});

//localStorage.setItem("usuarios", usuarios); //assim imputa objetc
localStorage.setItem("usuarios", JSON.stringify(usuarios));


//COMO CONVERTER UM OBJETO JAVASCRIPT EM STRING
//<string> = JSON.stringif(<obj>)
//localStorage só permitir armazenar valores do tipo string
//JSON - Java Script Objteto Notação
usr1 = {nome: "Wilton", senha: "123"}
localStorage.setItem("usr1", JSON.stringify(usr1));


usrs =  {info : [
    {nome: "Alfredo", senha: "123"} ,
    {nome: "Ana", senha: "321"}
]};

console.log(usrs.info[0]);

localStorage.setItem("usrs", JSON.stringify(usrs));






