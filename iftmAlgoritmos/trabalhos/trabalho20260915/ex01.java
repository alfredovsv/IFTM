import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        
        String data = s.nextLine();
        
        String dia = data.split("/")[0];
        
        System.out.println("Estamos no dia " + dia + " do mês.");
    }
}