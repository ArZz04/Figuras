public class Pentagono extends Figura {
    private double lado;

    public Pentagono(double lado) {
        super(0, 0);
        this.lado = lado;
    }

    public double area() {
        return (lado * lado * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
    }
}