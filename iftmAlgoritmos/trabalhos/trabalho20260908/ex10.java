import java.util.Scanner;

public class Main{
    public static void main (String args[]){
        
        Scanner s = new Scanner(System.in);
        
        //System.out.print("Quantidade de entrada(s): ");
        int e = s.nextInt();
        s.nextLine();
        //int[] vet = new int[e];
        String[] vet = new String[e];
        
        //Coletando os dados
        for (int i = 0; i <= e -1; i++){
            //System.out.print("Digite o primeiro valor: ");
            //vet[i] = s.nextInt();
            vet[i] = s.nextLine();
        }
        
        //Prepara array de leds
        int[] leds = new int[10];
        leds[0] = 6;
        leds[1] = 2;
        leds[2] = 5;
        leds[3] = 5;
        leds[4] = 4;
        leds[5] = 5;
        leds[6] = 6;
        leds[7] = 3;
        leds[8] = 7;
        leds[9] = 6;
        
        //Soma os leds e imprimi resultado por requisição
        for (int i = 0; i < e; i++){
            
            //Corre o número
            //String numeroAtual = Integer.toString(vet[i]);
            String numeroAtual = vet[i];
            int qteLeds = 0;
            for (int y = 0; y < numeroAtual.length(); y++){
                int posicao = numeroAtual.charAt(y) - '0';
                qteLeds += leds[posicao];
            }
            
            System.out.println(qteLeds + " leds");
            
        }
    }
    
}