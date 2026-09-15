import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op;
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        
        

        do {
            //Exibe menu
            exibeMenu();

            //Coleta a opção
            op = le("Digite uma opção: ");
            switch (op) {
                case 1:
                    //Exibicao e leiura do dados
                    System.out.println("VAMOS ADICAO, siga as instrucacoes");
                    a = le("Digine um número inteiro: ");
                    b = le("Digine um número inteiro: ");

                    //aqui fazemos a adição
                    Adicao s = new Adicao(a, b);
                    exibe(a, b, s.soma(), "adicao");
                    scan.nextLine(); 

                    break;
                case 2:
                    //Exibicao e leiura do dados
                    System.out.println("VAMOS SUBTRACAO, siga as instrucacoes");
                    a = le("Digine um número inteiro: ");
                    b = le("Digine um número inteiro: ");

                    //aqui fazemos a substração
                    Subtracao sub = new Subtracao(a, b);
                    exibe(a, b, sub.subtrai(), "subtracao");
                    scan.nextLine(); 

                    break;
                case 3:
                    //Exibicao e leiura do dados
                    System.out.println("VAMOS MULTIPLICAÇÃO, siga as instrucacoes");
                    a = le("Digine um número inteiro: ");
                    b = le("Digine um número inteiro: ");

                    //aqui fazemos a substração
                    Mutiplicacao mult = new Mutiplicacao(a, b);
                    exibe(a, b, mult.mutiplicar(), "multiplicação");
                    scan.nextLine(); 

                    break;
                
                case 4:
                    //Exibicao e leiura do dados
                    System.out.println("VAMOS DIVISÃO, siga as instrucacoes");
                    a = le("Digine um número inteiro: ");
                    b = le("Digine um número inteiro: ");

                    //aqui fazemos a substração
                    Divisao div = new Divisao(a, b);
                    exibeDouble(a, b, div.dividir(), "divisão");
                    scan.nextLine(); 

                    break;
                case 5:
                     //Exibe mensagem
                    System.out.println("Saindo...");

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }while (op != 5); //sai do while se digirar 5

        System.out.println("Sistema finalizado com sucesso.");
       
    }

    public static void exibeMenu(){
        System.out.println("---CALCULADOR------");
        System.out.println("1 - Adicao");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Mutiplicacao");
        System.out.println("4 - Divisão");
        System.out.println("5 - SAIR");
    }
    /**
     * Imprimir a mensagem e coleta um número inteiro
     * @return int
     */
    public static int le(String msg){
        Scanner s = new Scanner(System.in);
        System.out.print(msg);

        return s.nextInt();
    }

    public static void exibe(int a, int b, int result, String operador){
        System.out.println("Resultado " + operador + "entre " + a +" e " + b + " = " + result) ;

    }

    public static void exibeDouble(int a, int b, double result, String operador){
        System.out.println("Resultado " + operador + "entre " + a +" e " + b + " = " + result) ;

    }
}
