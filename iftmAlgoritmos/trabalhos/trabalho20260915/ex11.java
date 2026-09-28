import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        String p1 = s.nextLine();
        String p2 = s.nextLine();
        
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();
        
        if(p1.equals(p2))
            System.out.println("As palavras sao iguais.");
        else
            System.out.println("As palavras sao diferentes.");
    }
}