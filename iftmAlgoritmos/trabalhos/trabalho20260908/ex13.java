import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        s.nextLine(); // leitura do Enter
        //String novo = "";
        
        //Faz leitura
        for (int i = 0; i < n; i++){
            String novo = "";
            String l1 = s.nextLine();
            String l2 = s.nextLine();
            
            //define o tam do for, sendo o menor
            int tamL1 = l1.length();
            int tamL2 = l2.length();
            int tam = 0;
            int tamMenor = 0;
            if(tamL1 > tamL2){
                 tam = tamL1;
                 tamMenor = tamL2;
            }
            else{
                tam = tamL2;
                tamMenor = tamL1;
                
            }
            
            //faz combincao
            for (int y = 0; y < tam; y++){
                
                //só contetana se for meno que tamMenor
                if (y < tamMenor)
                    novo +=  (char)l1.charAt(y) +""+ (char)l2.charAt(y);
                else{
                    if (tamL1 > tamMenor)
                        novo += (char)l1.charAt(y) + "";
                    else
                        novo += (char)l2.charAt(y) + "";
                }
            }
            
            //Pega o restante e concatena
            
            System.out.println(novo);
        }
    }
    
}