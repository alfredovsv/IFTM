import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App{

    public static void exibe(FichaPessoal f){
        System.out.println("-----FICHA PESSOA-----");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Idade: " + f.getIdade());
        System.out.println("Qte: " + f.quantidade);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp;

        List<FichaPessoal> lista = new ArrayList<>();

        do{

       
            System.out.print("Digine o nome: ");
            String nome = s.nextLine();

            System.out.print("Digite a idade: ");
            int idade = s.nextInt();

            FichaPessoal p = new FichaPessoal(nome, idade);

            lista.add(p);

            System.out.print("Deseja continuar 1 - Sim | 2 - Não: ");
            resp = s.nextInt();
            s.nextLine();
        } while(resp == 1);

        for (FichaPessoal c : lista){
             exibe(c);
        }
       
        
    }


}