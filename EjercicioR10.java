import java.util.Scanner;

public class EjercicioRR10 {

    public static void main(String[] args) {
        int ni;
        String nombre;
        String apellido;
        String nombre_completo;
        double pat, pagmat, est;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nivel: ");
        ni = entrada.nextInt();

        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();

        System.out.println("Ingrese el apellido: ");
        apellido = entrada.next();

        System.out.println("Ingrese el patrimonio: ");
        pat = entrada.nextDouble();

        System.out.println("Ingrese el estrato: ");
        est = entrada.nextDouble();

        nombre_completo = nombre + " " + apellido;

        pagmat = Estudiante.obtener_pagmat(pat, est);

        System.out.println("el estudiante con ni: " + ni + " y nombre: " + nombre_completo + " debe pagar: " + pagmat);

    }
}

public class Estudiante {
    public static double obtener_pagmat(double pat, double est) {
        double pagmat = 50000;
        if ((pat > 2000000) && (est > 3)) {
            pagmat = pagmat + 0.03 * pat;
        }
        return pagmat;
    }
}
