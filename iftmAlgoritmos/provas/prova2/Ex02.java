import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        //Coletando os dados
        String ent1 = s.nextLine();
        String ent2 = s.nextLine();
        
        //Separando as palavras
        String[] arrEnt1 = ent1.split(" ");
        String[] arrEnt2 = ent2.split(" ");
        int contador = 0;
        
        //Correndo os array para procura
        for (int i = 0; i < arrEnt1.length-1; i++){
            
            //Prepara a os 3 primeiros caracates a serem buscados
            String proc = arrEnt1[i].substring(0,2);
            
            //Correr o array da segunda entrada e procua o proc, caso ache sai, pois deve ser contato uma vez
            for (int y = 0; y < arrEnt2.length-1; y++){
                if (arrEnt2[y].contains(proc)){
                    contador ++;
                    break;
                }
                
            }
            
        }
        
        //Imprimi o contador
        System.out.println(contador);
    }
    
}