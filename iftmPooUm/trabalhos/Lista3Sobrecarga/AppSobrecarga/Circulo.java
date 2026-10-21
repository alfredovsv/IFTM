package AppSobrecarga;

public class Circulo {
    private double raio;
    private double xcentro;
    private double ycentro;

    public Circulo(double raio, double xcentro, double ycentro) {
        this.raio = raio;
        this.xcentro = xcentro;
        this.ycentro = ycentro;
    }

    public Circulo(double xcentro, double ycentro) {
        this(0, xcentro, ycentro);
    }

    
    public double area() {
        return area(raio);
    }

    public double area(double raio) {
        return Math.PI * raio * raio;
    }

    public void exibe() {
        exibe(raio);
    }

    public void exibe(double raio) {
        System.out.printf(
                "A área do círculo de centro ( %.2f , %.2f ) e de raio = %.2f vale %.2f%n",
                xcentro, ycentro, raio, area(raio));
    }
}
