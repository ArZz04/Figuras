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
            System.out.println("4.- Pentagono");
            System.out.println("0.- Salir");
            System.out.print("- Selecciona una opcion ->  ");
            op = rc.nextInt();

            switch (op) {
                case 0:
                    System.out.println("---------------------------------------");
                    System.out.println("¡Programa finalizado con éxito!");
                    break;
                case 1:
                    System.out.println("--------------| CÍRCULO |--------------");
                    System.out.println("Ingrese el radio del círculo: ");
                    if (rc.hasNextDouble()) {
                        double radC = rc.nextDouble();
                        Circulo circulo = new Circulo(radC);
                        System.out.println("El área del círculo es: " + circulo.area());
                    } else {
                        System.out.println("El valor ingresado no es válido.");
                        rc.next(); // Limpiar el buffer del scanner
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 2:
                    System.out.println("--------------| CUADRADO |--------------");
                    System.out.println("Ingrese un lado del cuadrado: ");
                    if (rc.hasNextDouble()) {
                        double ladC = rc.nextDouble();
                        Cuadrado cuadrado = new Cuadrado(ladC);
                        System.out.println("El área del cuadrado es: " + cuadrado.area());
                    } else {
                        System.out.println("El valor ingresado no es válido.");
                        rc.next(); // Limpiar el buffer del scanner
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 3:
                    System.out.println("-------------| TRIÁNGULO |-------------");
                    System.out.println("Ingrese la base del triángulo: ");
                    if (rc.hasNextDouble()) {
                        double baseT = rc.nextDouble();
                        System.out.println("Ingrese la altura del triángulo: ");
                        if (rc.hasNextDouble()) {
                            double altT = rc.nextDouble();
                            Triangulo triangulo = new Triangulo(baseT, altT);
                            System.out.println("El área del triángulo es: " + triangulo.area());
                        } else {
                            System.out.println("El valor ingresado no es válido.");
                            rc.next(); // Limpiar el buffer del scanner
                        }
                    } else {
                        System.out.println("El valor ingresado no es válido.");
                        rc.next(); // Limpiar el buffer del scanner
                    }
                    System.out.println("---------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------| PENTÁGONO |-------------");
                    System.out.println("Ingrese la longitud de un lado del pentágono: ");
                    if (rc.hasNextDouble()) {
                        double longP = rc.nextDouble();
                        Pentagono pentagono = new Pentagono(longP);
                        System.out.println("El área del pentágono es: " + pentagono.area());
                    } else {
                        System.out.println("El valor ingresado no es válido.");
                        rc.next(); // Limpiar el buffer del scanner
                    }
                    System.out.println("---------------------------------------");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (op != 0);

        rc.close();
    }
}
