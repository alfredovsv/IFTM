//package aulas.20260824.ex01SemPoo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //coleta dados
        int a = le();
        int b = le();

        //aqui fazemos a adição
        exibe(a, b, soma(a,b));

        //aqui fazemos a substração
        exibe(a, b, subtrai(a, b));
        
    }

    /**
     * Imprimir a mensagem e coleta um número inteiro
     * @return int
     */
    public static int le(){
        Scanner s = new Scanner(System.in);
        System.out.print("Digine um número inteiro");

        return s.nextInt();
    }

    /**
     * Recebe dois números e efetua a soma
     * @param a
     * @param b
     * @return int
     */
    public static int soma(int a, int b){
        return a + b;
    }

    /**
     * Recebe dois núemro e efetua subtração
     * @param a
     * @param b
     * @return int
     */
    public static int subtrai(int a,int b){
        return a - b;
    }

    public static void exibe(int a, int b, int result){
        System.out.print("Resultado entre " + a +" e " + b + " = " + result) ;

    }
}
