import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String p1 = s.nextLine();
        String p2 = s.nextLine();
        
        char cP = p1.charAt(0);
        int contP = 0;
        
        char cU = p1.charAt(p1.length()-1);
        int contU = 0;
        
        int primeiraPart = p2.length() / 2;
        
        for (int i = 0; i < p2.length()-1; i++){
            
            //Primeira parte
            if (i < primeiraPart){
                if (p2.charAt(i) == cP)
                    contP ++;
            }else{
                if (p2.charAt(i)== cU)
                    contU ++;
            }
        }
        
        System.out.println(cP + " = " + contP);
        System.out.println(cU + " = " + contU);
        
        int posicaoP = p2.indexOf(cP);
        
        if (posicaoP > -1)
            System.out.println(cP + " aparece na posição " + posicaoP + " de " + p2.substring(0,primeiraPart));
    }
}