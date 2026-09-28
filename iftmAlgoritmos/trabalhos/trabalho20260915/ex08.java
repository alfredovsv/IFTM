import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.nextLine(); //ler o enter
        
        String[] p = new String[n];
        
        // for (int i = 0; i < n; i++){
        //     p[i] = s.nextLine();
        // }
        
        //A forma acima o test falhou, vou ler um linha apenas e da split
        String entrada = s.nextLine();
        p = entrada.split(" ");
        
        //Trata os dados e impimi
        for (int i = 0; i < n; i++){
            if(p[i].length() == 3){
                String palavra = p[i].substring(0,2);
                if(palavra.equals("OB")){
                    p[i] = "OBI";
                }else if (palavra.equals("UR"))
                    p[i] = "URI";
            }
            System.out.println(p[i]);
        }
        
        
    }
    
}