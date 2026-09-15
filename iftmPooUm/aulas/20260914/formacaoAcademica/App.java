//package aulas.20260914.formacaoAcademica;
import  java.util.Scanner;

public class App {

    public static void main (String args[]){
        //Declara variáveis
         Scanner s = new Scanner(System.in);
         int op = 0;
        //  Pessoa p = new Pessoa();
        //  Formacao f = new Formacao();
        Pessoa p = null;
        Formacao f = null;
        

         do {
            //Exibe menu
            System.out.println("---MENU------");
            System.out.println("1 - Ler dados Pessoa");
            System.out.println("2 - Ler dados Formcao");
            System.out.println("3 - Exite Pessoa");
            System.out.println("4 - Exite Formacao");
            System.out.println("5 - SAIR");

            //Coleta a 
            System.out.print("Digite uma opção: ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    p = lePessoa();
                    break;
                case 2:
                    f = leFormacao();
                    break;
                case 3:
                    System.out.println(exibePessoa(p));
                    break;
                
                case 4:
                    System.out.println(exibeFormacao(f));
                    break;
                case 5:
                     //Exibe mensagem
                    System.out.println("Saindo...");

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            s.nextLine();
            s.nextLine();

        }while (op != 5); //sai do while se digirar 5

        System.out.println("Sistema finalizado com sucesso.");
        
        s.close();
        
       

    }

    public static Pessoa lePessoa(){
        //Coleta os dados
        Scanner s = new Scanner(System.in);
        System.out.print("Digite Nome: ");
        String nome = s.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = s.nextLine().charAt(0);

        System.out.print("Digite a idade: ");
        int idade = s.nextInt();
        
        Pessoa p = new Pessoa(nome, sexo, idade);

        return p;

    }

    public static  Formacao leFormacao(){
         //Coleta os dados
        Scanner s = new Scanner(System.in);
        System.out.print("Digite Nível: ");
        String nivel = s.nextLine();

        System.out.print("Concluido (True / False): ");
        //char concluido = s.nextLine().charAt(0);
        boolean concluido = s.nextBoolean();
        s.nextLine(); //Devido o enter

        System.out.print("Digite a instituição: ");
        String instituicao = s.nextLine();

        System.out.print("Digite o ano: ");
        int ano = s.nextInt();
        
        Formacao f = new Formacao(nivel, concluido, instituicao, ano);

        return f;

    }

    public static  String exibePessoa(Pessoa p ){
        if (p == null)
            return "Não foram digitados os dados;";

        String retorno = "----PESSOA-----";
        retorno += "\nNome: " + p.nome;
        retorno += "\nSexo: " + p.sexo;
        retorno += "\nIdade: " + p.idade;
        
        return retorno;
    }

    public static String exibeFormacao (Formacao f ){
        if (f == null)
            return "Não foram digitados os dados;";


        String retorno = "----FORMCACAO-----";
        retorno += "\nNível: " + f.nivel;
        retorno += "\nConcluido: " + f.concluido;
        retorno += "\nInstiuticao: " + f.instituicao;
        retorno += "\nAno: " + f.ano;

        return retorno;


    }

    
    
}
