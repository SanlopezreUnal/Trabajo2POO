import java.util.Scanner;

public class EjercicioR13 {

    public static void main(String[] args) {
        double valcomp, valpag;
        String color;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra: ");
        valcomp = entrada.nextDouble();

        System.out.println("Ingrese el color de la bolita: ");
        color = entrada.next();

        valpag = Valpag.valor_pagar(valcomp, color);
        System.out.println("El cliente debe pagar: $" + valpag);
    }
}

public class Valpag {
    public static double valor_pagar(double valcomp, String color) {
        double valpag, pdes;

        if (color.equals("blanco")) {
            pdes = 0;
        } else if (color.equals("verde")) {
            pdes = 10;
        } else if (color.equals("amarillo")) {
            pdes = 25;
        } else if (color.equals("azul")) {
            pdes = 50;
        } else {
            pdes = 100;
        }
        return valcomp - pdes * valcomp / 100;
    }
}
