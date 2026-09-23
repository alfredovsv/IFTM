import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        
        Scanner s = new Scanner(System.in);
        
        //Coleta dados
        System.out.print("Digite o custo: ");
        double custo = s.nextDouble();
        
        System.out.print("Digite a cidade: ");
        String cidade = s.next();
        
        //valida dos dados
        if(cidade.equalsIgnoreCase("Uberlandia")){
            custo = custo; //Mantem o custo
        }else if (cidade.equalsIgnoreCase("Brasilia")){
            custo = custo * 2;
        }else{
            custo = custo / 2;
        }
        
        //Imprimi a cidade e custo
        System.out.print("\n O Custo de vida em " + cidade + " é R$ " + String.format("%.2f", custo));
        
    }
}