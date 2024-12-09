import java.util.Scanner;

public class EjercicioP19 {
    public static double obtener_perimetro(double lado) {
        return 3 * lado;
    }

    public static double obtener_altura(double lado) {
        return (lado * Math.sqrt(3)) / 2;
    }

    public static double obtener_area(double lado) {
        return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }

    public static void main(String[] args) {
        double perimetro, altura, area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado");
        double lado = entrada.nextDouble();

        perimetro = obtener_perimetro(lado);
        area = obtener_area(lado);
        altura = obtener_altura(lado);

        System.out.println("perimetro: " + perimetro);
        System.out.println("area: " + area);
        System.out.println("altura: " + altura);
    }
}
