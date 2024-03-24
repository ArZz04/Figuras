import java.util.Scanner;

public class Main {

    static Scanner rc = new Scanner(System.in);

    public static void main(String[] args) {

        int op = 0;
        do {
            System.out.println("---- FIGURAS -----");
            System.out.println("1.- Circulo");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Triangulo");
            System.out.println("4.- Elipse");
            System.out.println("5.- Pentagono");
            System.out.println("0.- Salir");
            System.out.print("- Selecciona una opcion ->  ");
            op = rc.nextInt();
            switch (op) {
                case 0:
                    System.out.println("---------------------------------------");
                    System.out.println("Programa finalizado con éxito!!...");
                    break;
                case 1:
                    System.out.println("--------------| CIRCULO |--------------");
                    System.out.println("Ingrese el radio del circulo: ");
                    double radC = (rc.nextDouble());
                    Circulo circulo = new Circulo(radC);
                    System.out.println("El área del círculo es: " + circulo.area());
                    System.out.println("---------------------------------------");
                    break;
                case 2:
                    System.out.println("--------------| CUADRADO |--------------");
                    System.out.println("Ingrese un lado del cuadrado: ");
                    double ladC = (rc.nextDouble());
                    Cuadrado cuadrado = new Cuadrado(ladC);
                    System.out.println("El área del cuadrado es: " + cuadrado.area());
                    System.out.println("---------------------------------------");
                    break;
                case 3:
                    System.out.println("--------------| TRIANGULO |--------------");
                    System.out.println("Ingrese la base del triangulo: ");
                    double baseT = (rc.nextDouble());
                    System.out.println("Ingrese la altura del triangulo: ");
                    double altT = (rc.nextDouble());
                    Triangulo triangulo = new Triangulo(baseT, altT);
                    System.out.println("El área del triángulo es: " + triangulo.area());
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    System.out.println("--------------| ELIPSE |--------------");
                    System.out.println("Ingrese el radio mayor de la elipse: ");
                    double radMay = (rc.nextDouble());
                    System.out.println("Ingrese el radio menor de la elipse: ");
                    double radMen = (rc.nextDouble());
                    Elipse elipse = new Elipse(radMay, radMen);
                    System.out.println("El área de la elipse es: " + elipse.area());
                    System.out.println("---------------------------------------");
                    break;
                case 5:
                    System.out.println("--------------| PENTAGONO |--------------");
                    System.out.println("Ingrese la longitud de un lado del pentágono: ");
                    double longP = (rc.nextDouble());
                    Pentagono pentagono = new Pentagono(longP);
                    System.out.println("El área del pentágono es: " + pentagono.area());
                    System.out.println("---------------------------------------");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (op != 0);
        rc.close();
    }
}