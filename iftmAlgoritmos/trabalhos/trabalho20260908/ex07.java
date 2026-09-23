import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        
        //Declara várivaeis
        Scanner s = new Scanner(System.in);
        int qte = 0;
        
        //Coletada dados
        System.out.print("Digite o caracterer a ser contado: ");
        char c = s.nextLine().charAt(0);
        
        System.out.print("Digite a Frase: ");
        String f = s.nextLine();
        
        //Solução - Obs maisculo diferente de minusculo
        for (int i = 0 ; i < f.length(); i++){
            if(f.charAt(i) == c)
                qte++;
            
        }
        
        System.out.println(qte);
    }
    
}