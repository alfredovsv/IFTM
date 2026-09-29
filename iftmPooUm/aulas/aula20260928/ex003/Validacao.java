public class Validacao{

     public static boolean valida(double x1, double y1, double x2, double y2 ){
        //Não pode ser negativo e não pode ser o mesmo ponto
        if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && x1 != x2 && y1 != y2)
            return true;
        return false;
    }

    public static boolean isQuadOne(double x1, double y1, double x2, double y2 ){
        return true; // Ainda vamos implementar
    }

}