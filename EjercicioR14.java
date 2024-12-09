import java.util.Scanner;

public class EjercicioR14 {

    public static void main(String[] args) {
        double vd1, vd2, vd3;
        double salario_d1, salario_d2, salario_d3;
        double salar1, salar2, salar3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las ventas del departamento 1: ");
        vd1 = entrada.nextDouble();

        System.out.println("Ingrese el salario del departamento 1: ");
        salario_d1 = entrada.nextDouble();

        System.out.println("Ingrese las ventas del departamento 2: ");
        vd2 = entrada.nextDouble();

        System.out.println("Ingrese el salario del departamento 2: ");
        salario_d2 = entrada.nextDouble();

        System.out.println("Ingrese las ventas del departamento 3: ");
        vd3 = entrada.nextDouble();

        System.out.println("Ingrese el salario del departamento 3: ");
        salario_d3 = entrada.nextDouble();

        salar1 = Salario_vd1.salario_vd1(vd1, vd2, vd3, salario_d1);
        salar2 = Salario_vd2.salario_vd2(vd1, vd2, vd3, salario_d2);
        salar3 = Salario_vd3.salario_vd2(vd1, vd2, vd3, salario_d3);

        System.out.println("Salario vendedores departamento 1 " + salar1);
        System.out.println("Salario vendedores departamento 2 " + salar2);
        System.out.println("Salario vendedores departamento 3 " + salar3);
    }
}

public class Salario_vd1 {
    public static double salario_vd1(double vd1, double vd2, double vd3, double salario_d1) {
        double totven, porven;
        double salar1;

        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;

        if (vd1 > porven) {
            salar1 = salario_d1 + 0.2 * salario_d1;
        } else {
            salar1 = salario_d1;
        }

        return salar1;
    }
}

public class Salario_vd2 {
    public static double salario_vd2(double vd1, double vd2, double vd3, double salario_d2) {
        double totven, porven;
        double salar2;
        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;
        if (vd2 > porven) {
            salar2 = salario_d2 + 0.2 * salario_d2;
        } else {
            salar2 = salario_d2;
        }
        return salar2;
    }
}

public class Salario_vd3 {
    public static double salario_vd2(double vd1, double vd2, double vd3, double salario_d3) {
        double totven, porven;
        double salar3;
        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;
        if (vd3 > porven) {
            salar3 = salario_d3 + 0.2 * salario_d3;
        } else {
            salar3 = salario_d3;
        }
        return salar3;
    }
}
