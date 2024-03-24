public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super(0, 0);
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }
}