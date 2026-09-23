import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        
        String nomeCompleto = s.nextLine();
        
        int ultimoEspaco = nomeCompleto.lastIndexOf(" ");
        
        String ultimoNome = nomeCompleto.substring(ultimoEspaco + 1);
        
        //System.out.println("Seu útlimo nome é " + ultimoNome +".");
        
        //Apesar do enunciado ser último nome, no teste é o primeiro nome, segui o test.
        System.out.println("Seu primeiro nome é " + ultimoNome + ".");
    }
}