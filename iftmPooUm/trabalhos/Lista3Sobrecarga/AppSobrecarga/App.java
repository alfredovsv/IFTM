package AppSobrecarga;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.print("\nFIGURAS GEOMÉTRICAS\n"
                    + "1 - Círculo\n"
                    + "2 - Triângulo\n"
                    + "3 - Quadrado\n"
                    + "4 - SAIR\n"
                    + "DIGITE A OPÇÃO: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = entrada.nextDouble();
                    System.out.print("Digite a coordenada x do centro: ");
                    double xcentro = entrada.nextDouble();
                    System.out.print("Digite a coordenada y do centro: ");
                    double ycentro = entrada.nextDouble();
                    Circulo circulo = new Circulo(raio, xcentro, ycentro);
                    circulo.exibe();
                    break;
                case 2:
                    System.out.print("Digite a base do triângulo: ");
                    double base = entrada.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double altura = entrada.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);
                    triangulo.exibe();
                    break;
                case 3:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = entrada.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    quadrado.exibe();
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção de 1 a 4.");
            }
        }

        entrada.close();
    }
}