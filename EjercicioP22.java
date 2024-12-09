import java.util.Scanner;
public class EjercicioP22 {

    public static void main(String[] args) {
        String nombre;
        double SalHora, HorasTrab, salario_total;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el salario por hora: ");
        SalHora = entrada.nextDouble();
        
        System.out.println("Ingrese las horas trabajadas: ");
        HorasTrab = entrada.nextDouble();
        
        salario_total = HorasTrab*SalHora;
        
        if (salario_total>450000){
            System.out.println("El nombre del trabajador es "+ nombre + ", y su salario mensual es "+ salario_total);
        }
        else{
            System.out.println("El nombre del trabajador es "+ nombre);
        }
    }
}
