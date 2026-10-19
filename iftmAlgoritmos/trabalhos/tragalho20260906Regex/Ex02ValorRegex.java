import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        String p = s.nextLine();
        
        //Testes
        String regex = "^R\\$\\s[0-9]{3,5}\\.[0-9]{2}"; //para R$espaço
        
        //String regex = "^'R\\$ '[0-9]{0,5}[.][0-9]{2}";
        
    
        
        if (p.matches(regex))
            System.out.println("Valor válido");
        else
            System.out.println("Valor inválido");
        
    }
}