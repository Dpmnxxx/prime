import java.util.Scanner;

public class PrimaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = scanner.nextDouble();

        System.out.print("Ingrese su prima base: ");
        double primaBase = scanner.nextDouble();

        double primaFinal;

        if (ingresos >= 300) {
            primaFinal = primaBase + (primaBase * 0.10);
        } else if (ingresos < 300) {
            primaFinal = primaBase + (primaBase * 0.05);
        } else {
            primaFinal = primaBase;
        }

        System.out.println("La prima final del trabajador es: $" + primaFinal);

        scanner.close();
    }
}
