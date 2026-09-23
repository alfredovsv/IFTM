import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        
        //Declara variáveis
        Scanner s = new Scanner(System.in);
        
        //Coleta dados
        System.out.print("Digite a frase: ");
        String frase = s.nextLine();
        
        //Validacaoes
        //1. Caso a frase tenha menos que 5 caractes, reonar "invalida"
        if(frase.length() < 5) 
            System.out.println("invalida");
        
        //2. Caso os caractes seja iguais, retornar "iguais"
        else if (frase.charAt(0) == frase.charAt(frase.length()-1))
            System.out.println("iguais");
            
        //3. Caso os caractes sejam diferentes, retornar "diferentes"    
        else
            System.out.print("diferentes");
        
    }
    
}