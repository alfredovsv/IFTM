
import java.util.Scanner;


public class App {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int resp;
        do{
            double[] arrCoord = new double[4];

            for (int i = 0; i < 4; i++){
                arrCoord[i] = leCoordenada(i+1);
            }

            if (valida(arrCoord[0],arrCoord[1], arrCoord[2], arrCoord[3] )){
                Retas r = new Retas(arrCoord[0],arrCoord[1], arrCoord[2], arrCoord[3]  );
                System.out.println(r.exibe() + r.comprimento());
            }else
                System.out.println("Coordenadas inválidas");
            
            
            System.out.print("Deseja continuar 1 - Sim | 2 - Não: ");
            resp = s.nextInt();
            s.nextLine();
        } while(resp == 1);

    }

    public static boolean valida(double x1, double y1, double x2, double y2 ){
        //Não pode ser negativo e não pode ser o mesmo ponto
        if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && x1 != x2 && y1 != y2)
            return true;
        return false;
    }

    public static double leCoordenada(int n){
        Scanner s = new Scanner(System.in);
        System.out.println("Cordenada " + n +": ");
        return s.nextDouble();
    }

}
