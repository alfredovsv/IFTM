/**4. Crie uma página web para exibir a seguinte mensagem no corpo do documento “Por favor,
aguarde X segundos para carregar a página do Google”. O valor de X deverá ser informado
primeiro pelo usuário. O texto deverá ser exibido no corpo do documento e atualizado a cada
1 segundo, onde o valor de X deverá ser decrementado em 1 unidade a cada segundo até chegar
ao valor zero. Após esse critério ter sido cumprido a página do Google (www.google.com) será
aberta na mesma aba. */

let tempoAbertura = prompt("Digite o tempo:");

let mensagem  = document.getElementById("mensagem");

espera();


function espera(){
    setInterval(function ()  {
        if (tempoAbertura > 0){
            mensagem.innerHTML = `Por favor,aguarde ${tempoAbertura} segundos para carregar a página do Google`;
            tempoAbertura--;
        }else{
            window.location.assign("https://www.google.com");
        }
        
       
    }, 1000);
}