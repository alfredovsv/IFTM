import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        //Declara variávies
        Scanner s = new Scanner(System.in);
        String reverso = "";
        
        //Coleta dados
        System.out.print("Digite a palavra: ");
        String palavra = s.nextLine();
        
        //Solução
        for (int i = palavra.length() - 1 ; i >= 0 ; i--)
            reverso +=  palavra.charAt(i);
            
        System.out.println(reverso);
            
    }
}