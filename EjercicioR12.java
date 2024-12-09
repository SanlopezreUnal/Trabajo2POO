import java.util.Scanner;

public class EjercicioR12 {

    public static void main(String[] args) {
        String nombre;
        double nht, vhn, salario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();

        System.out.println("Ingrese numero de horas trabajadas: ");
        nht = entrada.nextDouble();

        System.out.println("Ingrese valor hora normal trabajada: ");
        vhn = entrada.nextDouble();

        salario = Empleado.obtener_salario(nht, vhn);
        System.out.println("El trabajador " + nombre + " devengo $ " + salario);
    }
}

public class Empleado {

    public static double obtener_salario(double nht, double vhn) {
        double salario, het, hee8;

        if (nht > 40) {
            het = nht - 40;

            if (het > 8) {
                hee8 = het - 8;
                salario = 40 * vhn + 16 * vhn + hee8 * 3 * vhn;
            } else {
                salario = 40 * vhn + het * 2 * vhn;
            }
        } else {
            salario = 40 * vhn * vhn;
        }
        return salario;
    }
}
