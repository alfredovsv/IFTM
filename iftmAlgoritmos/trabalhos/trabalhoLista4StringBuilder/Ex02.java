package trabalhos.trabalhoLista4StringBuilder;

import java.util.Scanner;

public class Ex02{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        while (s.hasNextInt()){
            //Entradas
            String ent = s.nextLine();
            String[] arrEnt = ent.split(" ");
            
            int n1 = Integer.parseInt(arrEnt[0]);
            int n2 = Integer.parseInt(arrEnt[1]);
            
            int soma = n1 + n2;
            
            String somaText = Integer.toString(soma);
            
            //StringBuilder resultado = new StringBuilder(somaText);
            somaText = somaText.replace("0","");
            
            System.out.println(somaText);
        }
        
        s.close();
    }
}