import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        
        String frase = s.nextLine();
        String loc = s.nextLine();
        
        int posicao = frase.indexOf(loc) + 1;
        
        if (posicao > 0)
            System.out.println("A palavra encontrada na posição " + posicao  + ".");
        else
            System.out.println("Palavra nao encontrada.");
    }
}