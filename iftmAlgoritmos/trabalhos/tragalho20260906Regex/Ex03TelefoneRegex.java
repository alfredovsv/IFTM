import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        String p = s.nextLine();
        
        String regexCelular = "^\\(\\d{2}\\) \\d{5}-\\d{4}$";
        
        String regexFixo = "\\(\\d{2}\\) \\d{4}-\\d{4}";
        
        
        if(p.matches(regexCelular))
            System.out.println("Celular");
        else if(p.matches(regexFixo))
            System.out.println("Fixo");
        else
            System.out.println("inválido");
    }
}