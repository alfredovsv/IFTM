package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import academia.Academia;
import academia.Utilitaria;

public class App {

    // 1. Contém o método main( ) que irá chamar o método menu( ) para exibir o
    // seguinte
    // menu:
    public static void main(String[] args) {

        //precisei criar aqui, para acesar depois
        List<Aluno> listaAlunos = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);
        int op = 0;
        do {
            // Exibe o menu
            exibeMenu();
            op = s.nextInt();
            s.nextLine(); // ler o enter

            //MENU OP 1
            if (op == 1){
                if (validaUsuario()){
                    //exibeSubMenu();
                    int opSub = 0;
                    do {
                        // Exibe o Sub menu
                        System.out.println("S u b M E N U");
                        System.out.println("1- CADASTRO");
                        System.out.println("2- RELATÓRIO");
                        System.out.println("3- VOLTAR");
                        System.out.println("DIGITE A OPÇÃO: ");

                        opSub = s.nextInt();
                        s.nextLine(); // ler o enter
                        //SUBMENU OP 1
                        if(opSub == 1){
                            System.out.println("Nome do Aluno: ");
                            String nome = s.nextLine();

                            System.out.println("Digite o telefone com mascara (3x) 9xxx-xxxx");
                            String telefone = s.nextLine();

                            System.out.println("Digite a categoria entre 1 a 3");
                            int categoria = s.nextInt();
                            s.nextLine(); // ler o enter

                            //Se durante o cadastro o telefone
                            if (Utilitaria.validaTel(telefone)){
                                System.out.println("Teleofne inválido.");

                            //categoria não for 1,2 ou 3, avise a violação ao usuário e volte ao
                            }else if (categoria < 1 || categoria >3){
                                System.out.println("Categoria inválida");
                            }else{

                        

                                boolean existeDuplicidade = false;

                                // Verifica se o nome já existe na lista de alunos
                                for (Aluno aluno : listaAlunos) {
                                    if (aluno.getNome().equalsIgnoreCase(nome)) {
                                        existeDuplicidade = true;
                                        break;
                                    }
                                }

                                if (!existeDuplicidade){
                                    //Agora vou criar e estanciar o anulno
                                    //A instância da classe Aluno só deve ocorrer se os todos os dados estiverem válidos, assim o objeto criado deve ser inserido na lista de alunos. 
                                    // vou validar como passar int acessos
                                    //vou retronar um aluno, para colocar na lsita que esta no main
                                    Aluno aluno = new Aluno(Utilitaria.gerarCodigo(), nome, telefone, 1, categoria);
                                    listaAlunos.add(aluno);


                                    //Vou passar a lista de Aluno para fazer validação la dentro
                                    //listaAlunos.add(cadastro(listaAlunos));

                                    System.out.println("Aluno Cadastrado com Sucesso");
                                    s.nextLine();
                                }else{
                                    System.out.println("Usuário Duplicado");
                                    s.nextLine();
                                }
                            }
                        }

                        if(opSub == 2){
                            exibeRelatorio(listaAlunos);
                            s.nextLine();
                        }

                    } while (opSub != 3);
                }
                
            }

            //MENU OP 1
            if(op == 2){
                if (validaUsuario()){

                    personal(s, listaAlunos);
                    // System.out.println("Digite o código do aluno");
                    // String codigoAluno = s.nextLine();
                    // Aluno alunoSetado = null;

                    // //pega o a aluno da lista
                    // for (Aluno aluno : listaAlunos) {
                    //     if (aluno.getCodigo().equalsIgnoreCase(codigoAluno)) {
                    //             alunoSetado = aluno;
                    //             break;
                    //     }
                    // }

                    
                    // // Se o aluno já utilizou o limite de acessos permitido na categoria dele, então exiba
                    // // mensagem dizendo que ele não poderá ter mais aula gratuita com o personal.


                    // // Se ainda ele não atingiu o limite máximo permitido, atualize o seu atributo acesso e o atributo acessos.

                    // //Se o aluno não foi cadastrado, exiba mensagem informando que ele não foi cadastrado ainda e volte ao MENU.
                    // if (alunoSetado == null){
                    //     System.out.println("O aluno não foi cadastrado");
                    //     s.nextLine();
                    // }

                    


                    // //Se o número máximo de aulas com personal na academia for atingido, mostre uma mensagem informando a impossibilidade da aula e volte ao MENU.
                }
            }

        } while (op != 3);
    }

    // M E N U
    // 1- ACADEMIA
    // 2- PERSONAL
    // 3- SAIR
    // DIGITE A OPÇÃO: ___
    // Clarimundo não especificou se é public, privado ou default
    public static void exibeMenu() {
        System.out.println("M E N U");
        System.out.println("1- ACADEMIA");
        System.out.println("2- PERSONAL");
        System.out.println("3- SAIR");
        System.out.println("DIGITE A OPÇÃO: ");
    }

    
    // Clarimundo, preferir criar uma classe funcionario
    private static class Funcionario {
        String usuario;
        String senha;

        Funcionario(String usuario, String senha) {
            this.usuario = usuario;
            this.senha = senha;
        }
    }

    // OPÇÃO 1 – ACADEMIA :

    // A academia tem 3 funcionários, portanto, deve-se ter uma lista pré-definida
    // contendo o
    // usuário e senha desses três funcionários. Se não houver validação do usuário
    // e senha,
    // repita a leitura até no máximo 3 vezes. Após isso exiba uma mensagem dizendo
    // que o
    // número de tentativas esgotou e encerre tudo.

    public static boolean validaUsuario(){
        Scanner s = new Scanner(System.in);

        //A academia tem 3 funcionários, portanto, deve-se ter uma lista pré-definida
        // contendo o
        // usuário e senha desses três funcionários.
        List<Funcionario> funcionariosValidos = new ArrayList<>();
        funcionariosValidos.add(new Funcionario("admin", "1234"));
        funcionariosValidos.add(new Funcionario("recepcao", "1234"));
        funcionariosValidos.add(new Funcionario("professor", "1234"));

        int tentativas = 0;
        int maxTetantivas = 3;
        boolean loginSucesso = false;


        while (tentativas < maxTetantivas && !loginSucesso) {
            System.out.print("\nUsuário: ");
            String usuarioDigitado = s.nextLine();

            System.out.print("Senha: ");
            String senhaDigitada = s.nextLine();

            
            //Validar se o usuário e senha existem na lista
            for (Funcionario f : funcionariosValidos) {
                if (f.usuario.equals(usuarioDigitado) && f.senha.equals(senhaDigitada)) {
                    loginSucesso = true;
                    break; // Sai do for se achar o usuário correto
                }
            }

            // Essa opção só é acessível para o funcionário da academia que deve validar o
            // seu usuário
            // e senha para exibir o seguinte sub-menu:
            if (loginSucesso) {
                return loginSucesso;
            } else {
                tentativas++;
                int restantes = maxTetantivas - tentativas;
                if (restantes > 0) {
                    System.out.println("Usuário ou senha incorretos! Você tem mais " + restantes + " tentativa(s).");
                }
            }
        }

        //Se esgotou as tentativas, exibe a mensagem e encerra tudo
        if (!loginSucesso) {
            System.out.println("\no número de tentativas esgotou");
            s.nextLine();//Ler o enter
        }
        return loginSucesso;

    }

 
    // S u b M E N U
    // 1- CADASTRO
    // 2- RELATÓRIO
    // 3- VOLTAR
    // DIGITE A OPÇÃO: ___
    // public static void exibeSubMenu(){
    //      //Declara o scanner
    //     Scanner s = new Scanner(System.in);

       
        
    //     int op = 0;
    //     do {
    //         // Exibe o menu
    //         System.out.println("S u b M E N U");
    //         System.out.println("1- CADASTRO");
    //         System.out.println("2- RELATÓRIO");
    //         System.out.println("3- VOLTAR");
    //         System.out.println("DIGITE A OPÇÃO: ");

    //         op = s.nextInt();
    //         s.nextLine(); // ler o enter

    //         if(op == 1) 
    //             cadastro();

    //     } while (op != 3);


    // }

    // 1 - CADASTRO:
    // Se houver validação do funcionário, deve-se cadastrar um novo aluno. Cada
    // aluno
    // cadastrado deve ser inserido em uma lista de alunos. Se durante o cadastro o
    // telefone
    // estiver inválido e/ou a categoria não for 1,2 ou 3, avise a violação ao
    // usuário e volte ao
    // sub-menu. A instância da classe Aluno só deve ocorrer se os todos os dados
    // estiverem
    // válidos, assim o objeto criado deve ser inserido na lista de alunos. Se o
    // nome do aluno já
    // está cadastrado, não deve haver duplicidade no cadastro, então informe isso
    // ao usuário e
    // repita a leitura.
    // public static Aluno cadastro(List<Aluno> listaAlunos){
    //     //Declara o scanner
    //     Scanner s = new Scanner(System.in);

    //     System.out.println("Nome do Aluno: ");
    //     String nome = s.nextLine();

    //     System.out.println("Digite o telefone com mascara (3x) 9xxxx-xxxx");
    //     String telefone = s.nextLine();

    //     System.out.println("Digite a categoria entre 1 a 3");
    //     int categoria = s.nextInt();
    //     s.nextLine(); // ler o enter

    //     //VALIDACOES

    //     //Se durante o cadastro o telefone
    //     if (Utilitaria.validaTel(telefone)){
    //         System.out.println("Teleofne inválido.");
    //     }
            

    //     //categoria não for 1,2 ou 3, avise a violação ao usuário e volte ao
    //     if (categoria < 1 || categoria >3){
    //         System.out.println("Categoria inválida");
    //     }

    //     //Se chegou aqui, vamos instanciar o objeto conforme enunciado
    //      //Se o nome do aluno já
    //     // está cadastrado, não deve haver duplicidade no cadastro, então informe isso
    //     // ao usuário e
    //     // repita a leitura.
       

    //     boolean existeDuplicidade = false;

    //     // Verifica se o nome já existe na lista de alunos
    //     for (Aluno aluno : listaAlunos) {
    //         if (aluno.getNome().equalsIgnoreCase(nome)) {
    //             existeDuplicidade = true;
    //             break;
    //         }
    //     }

    //     //Agora vou criar e estanciar o anulno
    //      //A instância da classe Aluno só deve ocorrer se os todos os dados estiverem válidos, assim o objeto criado deve ser inserido na lista de alunos. 
    //      // vou validar como passar int acessos
    //      //vou retronar um aluno, para colocar na lsita que esta no main
    //      return new Aluno(Utilitaria.gerarCodigo(), nome, telefone, 1, categoria);
   


    // }

    // 2 - RELATÓRIO:
    // Exibe um relatório com os dados dos alunos da academia, no formato:
    // RELATÓRIO
    // Código: age93
    // Nome: Mariana Shibuya
    // Telefone: (34) 99645-3321
    // Categoria: 2
    // Acessos: 1
    // Código: xdl24
    // Nome: Edson Izack Santos
    // Telefone: (31) 98445-0079
    // Categoria: 1
    // TOTAL DE ALUNOS = 2
    // ACESSOS = 1

    public static void exibeRelatorio(List<Aluno> listaAlunos){
        // Código: xdl24
        // Nome: Edson Izack Santos
        // Telefone: (31) 98445-0079
        // Categoria: 1
        // TOTAL DE ALUNOS = 2
        // ACESSOS = 1

        System.out.println("RELATÓRIO");
        // Verifica se o nome já existe na lista de alunos
        for (Aluno aluno : listaAlunos) {
            //Vou passar um no acesso, pois ainda não entendi
            System.out.println(aluno.exibe2(1));
        }

    }

     public static void personal(Scanner s, List<Aluno>  alunos) {
        System.out.print("Código do aluno: ");
        String codigo = s.nextLine();

        Aluno aluno = null;
        for (Aluno a : alunos) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                aluno = a;
            }
        }

         // //Se o aluno não foi cadastrado, exiba mensagem informando que ele não foi cadastrado ainda e volte ao MENU.
        if (aluno == null) {
            System.out.println("Aluno ainda não cadastrado.");
            return;
        }

         
        // Se a categoria do
        // aluno for 1, então ele não tem direito a ter essas aulas com personal. Se a categoria do
        // aluno for 2, então ele tem direito a ter 1 aula com personal. Se a categoria for 3, então ele
        // tem direito a ter até 2 aulas com personal.
        int limite = aluno.categoria - 1; // cat 1 = 0, cat 2 = 1, cat 3 = 2

        // // Se o aluno já utilizou o limite de acessos permitido na categoria dele, então exiba
        // // mensagem dizendo que ele não poderá ter mais aula gratuita com o personal.
        if (aluno.getAcessos() >= limite) {
            System.out.println("Esse aluno não poderá ter mais aula gratuita com o personal.");
            return;
        }

        

        // // Se ainda ele não atingiu o limite máximo permitido, atualize o seu atributo acesso e o atributo acessos.

        //Pensar comou funciona com acadiemaia
        if (Academia.getAcessos() >= 5) {
            System.out.println("Limite de 5 aulas com personal na academia atingido. Aula impossível.");
            return;
        }

        aluno.setAcessos(aluno.getAcessos() + 1);
        Academia.setAcessos(Academia.getAcessos() + 1);
        System.out.println("Aula com personal registrada!");
    }
}
