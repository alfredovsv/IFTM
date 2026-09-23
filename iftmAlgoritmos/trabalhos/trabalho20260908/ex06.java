import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        //Declara variávies
        Scanner s = new Scanner(System.in);
        
        //Coleta dados
        System.out.print("Digite uma frase: ");
        String frase = s.nextLine();
        
        //Solução
        for (int i = 0; i < frase.length() ; i++)
            System.out.println(i + " - " + frase.charAt(i));
        
    }
}