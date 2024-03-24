public class Elipse extends Figura {
    private double radioMayor;
    private double radioMenor;

    public Elipse(double radioMayor, double radioMenor) {
        super(0, 0);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double area() {
        return Math.PI * radioMayor * radioMenor;
    }
}