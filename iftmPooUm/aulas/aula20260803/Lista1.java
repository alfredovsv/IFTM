import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lista1 {
    /**
     * 1. Leia dois números inteiros e exiba se o primeiro número é menor, igual ou maior que o segundo número
     */
    public static void numMaiorMenor(){
        int num1, num2;

        num1 = leitor();
        num2 = leitor();

        JOptionPane.showMessageDialog(null, num1 + " e " + num2);


    }

    public static int leitor(){

        return Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));


    }
    public static void main(String[] args) {

        //Scanner opcao = new Scanner(System.in); 
        int op;
        
        //Exibe e lê a opção do menu
        op = Integer.parseInt (JOptionPane.showInputDialog("Digite uma opção Valida"+
        "\n 1 - Maior ou Menor"));

        JOptionPane.showMessageDialog(null, op);

        switch (op) {
            case 1:
                
                break;
        
            default:
                break;
        }

        // System.out.println("Lista de exercicio 1");

        // //1. Leia dois números inteiros e exiba se o primeiro número é menor, igual ou maior que o segundo número
        // System.out.println("1 - Maior ou Menor");

        
        // //System opcao
        // int op = opcao.nextInt();
    }

}