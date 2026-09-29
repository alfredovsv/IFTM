

public class Retas {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public static int cont = 0;

    public Retas (double x1, double y1, double x2, double y2 ){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        cont++;
    }

    public double comprimento(){
        return  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static boolean valida(double x1, double y1, double x2, double y2 ){
        //Não pode ser negativo e não pode ser o mesmo ponto
        if (x1 > 0 && y1 > 0 && x2 > 0 && y2 > 0 && x1 != x2 && y1 != y2)
            return true;
        return false;
    }

    public String exibe(){
        return "O comprimento entre para cordenatas (x1 = " + this.x1 + ",y1= " + this.y2 + ",x2 = " + this.x2 + ",y2 = " + this.y2 + ") é =";
    }

    
}
