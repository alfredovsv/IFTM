import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        sc.close();
    }

    public static void menu() {
        int opcao;
        do {
            System.out.println("\nFIGURA");
            System.out.println("1- Círculo");
            System.out.println("2- Triângulo");
            System.out.println("3- Quadrado");
            System.out.println("4- SAIR");
            System.out.print("DIGITE A OPÇÃO: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                FigurasGeometricas figura = le(opcao);
                submenu(opcao, figura);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        System.out.println("Programa encerrado.");
    }

    public static FigurasGeometricas le(int opcao) {
        switch (opcao) {
            case 1:
                System.out.print("Coordenada xc: ");
                double xc = sc.nextDouble();
                System.out.print("Coordenada yc: ");
                double yc = sc.nextDouble();
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                return new FigurasGeometricas(xc, yc, raio);
            case 2:
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                return new FigurasGeometricas(base, altura);
            case 3:
                System.out.print("Lado: ");
                double lado = sc.nextDouble();
                return new FigurasGeometricas(lado);
            default:
                return null;
        }
    }

    private static void submenu(int tipo, FigurasGeometricas figura) {
        int opcao;
        do {
            System.out.println("\nAÇÕES");
            System.out.println("1 – Exibir Dados");
            System.out.println("2 – Área");
            System.out.println("3 – Voltar");
            System.out.print("DIGITE A OPÇÃO: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (tipo == 1) System.out.println(figura.exibeCirculo());
                    else if (tipo == 2) System.out.println(figura.exibeTriangulo());
                    else System.out.println(figura.exibeQuadrado());
                    break;
                case 2:
                    double area;
                    if (tipo == 1) area = figura.areaCirculo();
                    else if (tipo == 2) area = figura.areaTriangulo();
                    else area = figura.areaQuadrado();
                    System.out.printf("Área: %.2f%n", area);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }
}
