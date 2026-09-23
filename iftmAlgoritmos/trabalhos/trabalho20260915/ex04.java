import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        String t = s.nextLine();
        
        String[] arrT = t.split(" ");
        
        for (String palavra : arrT){
            if(palavra.length() > 3)
                System.out.println(palavra.substring(0,3));
        }
    }
} 