import java.util.Scanner;

public class EjercicioP8 {
    int codigo_empleado;
    String nombre_empleado;
    double numero_horas_trabajadas_mes;
    double valor_hora_trabajada;
    double porcentaje_retencion;
    double salario_bruto;
    double salario_neto;

    public static double calcular_porcentaje_retencion(int retencion_fuente) {
        return retencion_fuente / 100.0;
    }

    public static double calcular_salario_bruto(double numero_horas_trabajadas_mes, double valor_hora_trabajada) {
        return numero_horas_trabajadas_mes * valor_hora_trabajada;
    }

    public static double calcular_salario_neto(double salario_bruto, double porcentaje_retencion) {
        return salario_bruto - (salario_bruto * porcentaje_retencion);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre, apellido, nombre_completo;
        double salario_bruto, salario_neto;

        System.out.println("Ingrese código del empleado:");
        int codigo_empleado = entrada.nextInt();

        System.out.println("Ingrese nombre del empleado:");
        nombre = entrada.next();

        System.out.println("Ingrese apellido del empleado:");
        apellido = entrada.next();

        System.out.println("Ingrese el número de horas trabajadas en el mes:");
        double horas_trabajadas = entrada.nextDouble();

        System.out.println("Ingrese el valor por hora trabajada:");
        double valor_hora = entrada.nextDouble();

        System.out.println("Ingrese porcentaje de retención (en %):");
        int retencion = entrada.nextInt();

        nombre_completo = nombre + " " + apellido;
        double porcentaje_retencion = calcular_porcentaje_retencion(retencion);
        salario_bruto = calcular_salario_bruto(horas_trabajadas, valor_hora);
        salario_neto = calcular_salario_neto(salario_bruto, porcentaje_retencion);

        System.out.println("\nResultados:");
        System.out.println("Código del empleado: " + codigo_empleado);
        System.out.println("Nombre completo: " + nombre_completo);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
    }
}
