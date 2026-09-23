import java.util.Scanner;

public class Main{
    
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite a entrada: ");
        String p = s.nextLine();
        //String p ="";
        //p = "Texto #3";
        //p = "abcABC1";
        //p = "vxpdylY .ph";
        //p = "vv.xwfxo.fd";
        int tam = p.length();
        
        
        //1 letras minuculas e maiusculas dever deslocar 3 posiao para direita
        //ex a vria d | y vira I.
        String p1 = "";
        for (int i = 0; i < tam ; i++){
            char letra = p.charAt(i);
            
            //Valida se é letra, 
            if((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z'))
                p1 += (char)(letra + 3); 
            else
                p1 += letra;
        }
        
        
        
        //2 - linha inverte
        String p2 = "";
        for (int i = tam - 1; i >=0 ; i--){
            p2 += (char) (p1.charAt(i));
        }
        
        
        //3 todo cactere a partida da metade em diante deve ser deslocados uma posição  para esquerda
        //b vira a | a vira `
        String p3 = "";
        int metade = tam /2;
        for (int i = 0 ; i < tam; i++){
            if(i >= metade)
                p3 += (char) (p2.charAt(i) - 1);
            else
                p3 += (char) (p2.charAt(i));
        }
        
        System.out.print(p3);
        
    }
    
}