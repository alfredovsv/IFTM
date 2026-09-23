import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int numEntradas = s.nextInt();
        s.nextLine();// para ler o Enter
        
        String[] vetEntrada = new String[numEntradas];
        
        //Coleta os dados
        for (int i = 0 ; i < numEntradas; i++){
            vetEntrada[i] = s.nextLine();
        }
        
        //Calcula e exibe
        for (int i = 0; i < numEntradas; i++){
            char operador = vetEntrada[i].charAt(1);
            int resul = 0;
            int n1 = vetEntrada[i].charAt(0) - '0';
            int n2 = vetEntrada[i].charAt(2) - '0';
            
            //Se os digitos forem iguais, deve desconsiderar a letra e mostra o produto entre os dois digitos
            if (n1 == n2)
                resul = n1 * n2;
                
            //Se letra for maisucla, deve subtrar o primeiro dido do segundo
            else if (operador >= 'A' && operador <= 'Z')
                resul = n2 - n1;
            
            //Se a letra for minucula, deve somar ambos os dígitos
            else if (operador >= 'a' && operador <= 'z')
                resul = n1 + n2;
            
           System.out.println(resul);
        }
        
    }
    
}