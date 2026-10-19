package academia;

public class Utilitaria {
    // 1. Contém 1 método que gera o código do aluno a ser cadastrado. O código deve
    // obedecer a seguinte regra: conter 5 caracteres sendo os 3 primeiros letras e os dois
    // últimos dígitos de 0 a 9.
    public static String gerarCodigo(){
        return "MAT" + (int)(Math.random() * 100 + 1);
    }

    // 2. Contém 1 método que valida o telefone do aluno a ser cadastrado. O formato do
    // telefone deve ter o formato: (xx) xxxxx-xxxx. Além disso, ele deve obedecer a seguinte
    // regra da esquerda para a direita:
    // - O primeiro dígito deve ser 3.
    // - O segundo dígito deve ser os dígitos de 1 a 9, exceto o dígito 6.
    // - O terceiro dígito deve ser 9.
    // - O quarto dígito deve ser 8 ou 9.
    // - Os demais dígitos são de 0 a 9.
    // Se durante o cadastro, o telefone obedecer ao formato e às regras, o método retorna
    // true. Caso contrário, retorna false.
    public static boolean validaTel(String telefone){

         if (telefone == null) {
            return false;
        }

        //. qualquer caracter
        //\d qualquer número
        //\D quer não número
        //\w qualquer letra e número
        //\W qualquer NÃO letra e não numero
        //\s qualquer espaço ou trabulação
        //\S qualquer caracter sem espaço em branco

        //x{n} o carecter n vezes
        //x{n,} pelo menos n vezes
        //x{n,m} pelo menos n vezes não maior que m
        //x? 0 ou 1 vez
        //x* 0 ou mais vezes
        //x+ 1 ou mais vezes

        //[.] para representar o ponto ou \\.
        //[@] para representar o @

        // | é ou

        // ^Texto  O texto obrigatoriamente começa com "Texto".
        //[^Texto] Qualquer caractere que não seja 'T', 'e', 'x', 't' ou 'o'.

        //Aprendemos semana passada expressão regular com Bruno
        //String regex = "^\\(\\3[1-57-9]\\) [1-57-9]9[89]\\d{1}-\\d{4}$";
        String regex = "^\\(3[1-57-9]\\) 9[89]\\d{3}-\\d{4}$";
        return telefone.matches(regex);
        //return true;
    }



}
