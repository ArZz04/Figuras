public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(0, 0);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura / 2;
    }
}