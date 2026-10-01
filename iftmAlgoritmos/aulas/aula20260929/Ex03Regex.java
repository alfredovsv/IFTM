package aulas.aula20260929;

import java.util.Scanner;

public class Ex03Regex {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String texto = s.nextLine();

        //string formatada 
        if (texto.matches("IFTM")){
            //acima vai funciona igual o equals
            //ou compareTo = 0
            System.out.println("São iguais");
        }

        //Quero verificar se tem 4 caractesres
        //Se precisar validar . utiliza \.
        //.representa qualquer caracter
        if(texto.matches("...."))
            System.out.println("Tem 4 caracteres");

        //Valida ano
        if(texto.matches("\\d\\d\\d\\d"))
            System.out.println("Tem 4 numeros");

        //CPF
        if(texto.matches("\\d\\d\\d\\.\\d\\d\\d\\.\\d\\d\\d-\\d\\d"))
            System.out.println("é um CPF validacao simples");

        if(texto.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}"))
            System.out.println("é um CPF validacao otimizada");

        //CPF melhorado
        //valida com ponto ou não
        if(texto.matches("\\d{3}.\\d{3}.\\d{3}.\\d{2}"))
            System.out.println("é um CPF validacao melhorada");

        //Tem palavra Java no texto
        if(texto.matches(".*Java.*"))
            System.out.println("Tem Java no texto");
        
        //Tem palavra Java no MEIO do texto
        if(texto.matches(".+Java.+"))
            System.out.println("Tem Java no MEIO texto");

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
    

        s.close();;
    }

}
