public class Pentagono extends Figura {
    private double lado;

    public Pentagono(double lado) {
        super(0, 0);
        this.lado = lado;
    }

    @Override
    public double area() {
        int nlados = 5;
        double perimetro = nlados * lado;
        double apotema = lado / (2 * Math.tan(Math.PI / nlados));
        return 0.5 * perimetro * apotema;
    }
}

