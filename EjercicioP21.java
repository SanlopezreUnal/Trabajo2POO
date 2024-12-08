import java.util.Scanner;

public class EjercicioPropuesto21 {

    public static void main(String[] args) {
        double a, b, c;
        double p, s;
        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado a");
        a = entrada.nextDouble();

        System.out.println("Ingrese el valor del lado b");
        b = entrada.nextDouble();

        System.out.println("Ingrese el valor del lado c");
        c = entrada.nextDouble();

        p = triangulo.obtener_perimetro(a, b, c);
        s = triangulo.obtener_semiperimetro(p);
        area = triangulo.obtener_area(a, b, c, s);

        System.out.println("perimetro: " + p);
        System.out.println("semiperimetro: " + s);
        System.out.println("area: " + area);
    }
}

public class triangulo {

    public static double obtener_perimetro(double a, double b, double c) {
        return a + b + c;
    }

    public static double obtener_semiperimetro(double p) {
        return p / 2;
    }

    public static double obtener_area(double a, double b, double c, double s) {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
