import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        //Instancia váriáveis
        Scanner s = new Scanner (System.in);
        
        //Coleta dados
        System.out.print("Digite o primeiro texto: ");
        String texto1 = s.nextLine();
        
        System.out.print("Digite o segundo texto: ");
        String texto2 = s.nextLine();
        
        //Validacao, não igonere Case sensitive
        if(texto1.equals(texto2))
            System.out.print("Correto, textos identificos");
        else
            System.out.print("Incorreto, textos diferentes");
        
        
        
        
    }
}