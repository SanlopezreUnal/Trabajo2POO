import java.util.Scanner;
public class cuadratica {


    public static double hallar_formula(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double festudiante1(double a, double b, double formula) {
        return (-b + Math.sqrt(formula)) / (2 * a);
    }

    public static double festudiante2(double a, double b, double formula) {
        return (-b - Math.sqrt(formula)) / (2 * a);
    }

    public static void main(String[] args) {
        double a, b, c, formula, x_1, x_2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = entrada.nextDouble();

        formula = hallar_formula(a, b, c);

        if (formula > 0) {
            x_1 = festudiante1(a, b, formula);
            x_2 = festudiante2(a, b, formula);
            System.out.println("Las soluciones son x = " + x_1 + " y x = " + x_2);
        } else if (formula == 0) {
            x_1 = -b / (2 * a);
            System.out.println("La solucion es x = " + x_1);
        } else {
            System.out.println("La ecuación no tiene soluciones reales");
        }
    }
}

