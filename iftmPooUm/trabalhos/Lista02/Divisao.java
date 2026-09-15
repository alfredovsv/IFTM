public class Divisao{
    public int a, b;

    public Divisao(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double dividir(){
        double resultado = (double) ((double)a / (double)b);

        return resultado;
    }
}