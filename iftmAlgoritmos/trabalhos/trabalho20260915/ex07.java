import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        double result = 0;
        Scanner s = new Scanner(System.in);
        String exp = s.nextLine();
        
        String[] operadores = exp.split(" ");
        
        //Validar como tratar exececoes depois
        
        double op1 = Double.parseDouble(operadores[0]);
        double op2 = Double.parseDouble(operadores[2]);
        String op = operadores[1];
        
        switch(op){
            case "+":
                result = op1 + op2;
                System.out.println(result);
                break;
            case "-":
                result = op1 - op2;
                System.out.println(result);
                break;
            case "*":
                result = op1 * op2;
                System.out.println(result);
                break;
            case "/":
                result = op1 / op2;
                System.out.println(result);
                break;
            default:
                System.out.println("Formula invalida.");
        }
    }
}