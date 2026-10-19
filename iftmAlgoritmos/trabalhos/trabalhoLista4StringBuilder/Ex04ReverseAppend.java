import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        StringBuilder p = new StringBuilder(s.nextLine());
        
        int n = Integer.parseInt(s.nextLine());
        //s.nextLine(); // para ler enter
        
        //Antes guarda a palavra original
        String original = p.toString();
        
        //primeiro da reverse
        p.reverse();
        
        for (int i = 0; i < n; i++){
            p.append(original);
        }
        
        System.out.println(p);
    }
    
}