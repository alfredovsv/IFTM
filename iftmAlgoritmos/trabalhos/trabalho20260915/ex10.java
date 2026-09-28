import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        String e = s.nextLine();
        
        if (e.startsWith("IMG") && e.endsWith(".png"))
            System.out.println("Arquivo valido.");
        else
            System.out.println("Arquivo invalido.");
        
    }
}