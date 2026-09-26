/**3) Crie um objeto composto pelos seguintes atributos: nome de usuário e senha. Em seguida,
armazene esse objeto localmente no navegador da máquina do usuário. Esse objeto deverá ser
armazenado via código, ou seja, sem uso de um formulário na interface. */

//Objeto
user = {nomeUsuario : "Alfredo" ,  sennha : "12345678"}

localStorage.setItem("user", JSON.stringify(user));