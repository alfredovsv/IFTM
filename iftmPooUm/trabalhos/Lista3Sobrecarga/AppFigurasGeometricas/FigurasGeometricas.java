public class FigurasGeometricas {

    private double lado;
    private double base;
    private double altura;
    private double xc;
    private double yc;
    private double raio;

    // Quadrado
    public FigurasGeometricas(double lado) {
        this.lado = lado;
    }

    // Triângulo
    public FigurasGeometricas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Círculo
    public FigurasGeometricas(double xc, double yc, double raio) {
        this.xc = xc;
        this.yc = yc;
        this.raio = raio;
    }

    public double areaQuadrado() {
        return lado * lado;
    }

    public double areaTriangulo() {
        return (base * altura) / 2;
    }

    public double areaCirculo() {
        return Math.PI * raio * raio;
    }

    public String exibeQuadrado() {
        return "Quadrado -> Lado: " + lado;
    }

    public String exibeTriangulo() {
        return "Triângulo -> Base: " + base + " | Altura: " + altura;
    }

    public String exibeCirculo() {
        return "Círculo -> Centro: (" + xc + ", " + yc + ") | Raio: " + raio;
    }
}