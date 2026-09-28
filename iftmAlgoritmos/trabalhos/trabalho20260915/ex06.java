import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        
        String f = s.nextLine();
        
        
        //1. subtitua todas as letra 'a' e 'A' pela letra '@';
        f = f.replace("a","@");
        f = f.replace("A","@");
        
        
        //3. cpare a primeire e última palavra
        String[] arrF = f.split(" ");
        String p1 = arrF[0];
        String p2 = arrF[arrF.length - 1];
        
        int compara = p1.compareTo(p2);
        
        //4. caso a frase menos que 3 palavras
        if(arrF.length >= 3){
            //2. imprima a fase modificada
            System.out.println(f);
            if (compara > 0)
                System.out.println("palavra1 > palabra2");
            else if (compara < 0)
                System.out.println("palavra1 < palavra2");
            else
                System.out.println("palavra1 == palavra2");
        }else{
            System.out.println("Frase invalida.");
        }
    }
}