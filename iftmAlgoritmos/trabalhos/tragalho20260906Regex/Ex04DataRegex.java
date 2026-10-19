import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner s = new Scanner(System.in);
        
        String data = s.nextLine();
        
        // String regex = "[1-31]{2}[/][1-2]{2}[/]\\d{4}"; //primeira tentativa
        //String regex = "[1-31]{2}"; //não funciona
        String regex = "(0[1-9]|[12][1-9]|[3][01])"; //precisei do auxilio de ia nessa aqui
        regex += "/(0[1-9]|1[0-2])";
        regex += "/\\d{4}";
        
        //System.out.println(data.matches(regex));
        
        if (data.matches(regex))
            System.out.println("Data válida");
        else
            System.out.println("Data inválida");
    }
}