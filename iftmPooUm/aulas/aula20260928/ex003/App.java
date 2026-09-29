
import java.util.Scanner;


public class App {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int resp;
        do{
            double[] arrCoord = new double[4];

            //Coleta coordenatas
            for (int i = 0; i < 4; i++){
                arrCoord[i] = leCoordenada(i+1);
            }

            Retas r = new Retas(arrCoord[0],arrCoord[1], arrCoord[2], arrCoord[3]  );
            //Validacao v = new Validacao();
            //v.valida(arrCoord[0],arrCoord[1], arrCoord[2], arrCoord[3] 
            //Não precisa instaciar, pois é uma class static, é uma classe utilizavel ou classes utilitárias
            if (Validacao.valida(arrCoord[0],arrCoord[1], arrCoord[2], arrCoord[3] )){
                
                System.out.println(r.exibe() + r.comprimento());
            }else
                System.out.println("Coordenadas inválidas");
            
            //System.out.println("Quantidade de construção do objeto = " + r.cont);
            System.out.println("Quantidade de construção do objeto = " + Retas.cont);
            
            System.out.print("Deseja continuar 1 - Sim | 2 - Não: ");
            resp = s.nextInt();
            s.nextLine();
        } while(resp == 1);

    }

    

    public static double leCoordenada(int n){
        Scanner s = new Scanner(System.in);
        System.out.println("Cordenada " + n +": ");
        return s.nextDouble();
    }

}
