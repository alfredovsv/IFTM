/**10. Construa uma página web capaz de solicitar ao usuário um valor inteiro positivo maior ou
igual 2 e, em seguida, a partir do número lido, exibir uma tabela no corpo do documento da
página, conforme mostrado no exemplo a seguir, contendo os valores de 0 (zero) até o
número informado pelo usuário nos seguintes sistemas de numeração: decimal, binário e
hexadecimal. */

let numero = prompt("Digite maior que ou igual a 2:").trim();
let retorno = "";

//Algumas vadições
if(numero >= 2 || (numero != null && numero != "" && !isNaN(numero))){ //Valiçoes para garantir que é um número válido

    retorno += "<table border='1'>"; //inica tabela
    retorno += "<tr> <th>Base Decimal</th> <th>Base Binária</th> <th>Base Hexadecimal<th></tr>"; //Cabeceçalho
    for (let i =0; i <= numero; i++){

        retorno += `<tr><td>${i}</td><td>${i.toString(2)}</td><td>${i.toString(16)}</td></tr>`;
    }
    retorno += "</table>"; //Fecha tabela

    document.write(retorno); //escreve a tabela no documento

}else
    document.write("Número Inválido");