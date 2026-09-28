import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.nextLine(); // ler o enter
        
        String []  e =  new String[n]; //entradas
        
        for (int i = 0;  i < n; i++)
            e[i] = s.nextLine();
        
        //VAlidar se encaixa
        for (int i = 0; i < n; i++){
            String[] entradas = e[i].split(" ");
            String a = entradas[0];
            String b = entradas[1];
            
            // tam = b.length();
            
            if (a.endsWith(b))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }
    
}