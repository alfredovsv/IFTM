import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        
        String t = a.nextLine();
        String s = a.nextLine();
        
        String[] arrT = t.split(" ");
        int qte = 0;
        
        for (String palavra : arrT){
            if (palavra.contains(s))
                qte++;
        }
        
        System.out.println(qte);
    }
    
}