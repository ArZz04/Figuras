public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super(0, 0);
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }
}