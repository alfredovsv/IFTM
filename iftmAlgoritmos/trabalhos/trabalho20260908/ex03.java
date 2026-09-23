import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        
        //Declara variáveis
        Scanner s = new Scanner(System.in);
        
        //Coleta dados
        System.out.print("Digite um texto: ");
        String texto = s.nextLine();
        
        //Valdiacao
        if(texto.length() <= 10)
            System.out.println("pequeno");
        else
            System.out.println("grande");
        
    }
}