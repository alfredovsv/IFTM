import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        //Declara variáveis
        Scanner s = new Scanner(System.in);
        
        //Coleta dados
        System.out.print("Digite o CPF sem pontos: "); 
        String cpf = s.nextLine();
        
        if(cpf.length() == 11)
            System.out.println("Válido");
        else
            System.out.println("Inválido");
    }
    
}