import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner (System.in);
        
        String cpf = s.nextLine();
        
        String regex = "(\\d{11}|\\d{3}.\\d{3}.\\d{3}-\\d{2})";
        
        if (cpf.matches(regex))
            System.out.println("CPF válido");
        else
            System.out.println("CPF inválido");
    }
}