import java.util.Scanner;

class Main{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        String mail = s.nextLine();
        
        //boolean valido = mail.matches("\\S+@");
        //String regex = "[^\\s@]+@[^\\s]+[.]"
        
        //Vamos testar por etapa
        String regex = "^[a-z0-9_-[.]]+@[a-z0-9[.]]+[.][a-z]{2,6}$";
        
        //String regex = "^[a-z0-9.-_]+@[a-z0-9.]+[.][a-z0-9.]{2,6}";
        
        if (mail.matches(regex))
            System.out.println("Email válido");
        else
            System.out.println("Email inválido");
    }
}