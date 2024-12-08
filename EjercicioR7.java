import java.util.Scanner;
public class EjercicioRR_7 {

    public static void main(String[] args) {
        double a,b;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        
        
        if (a>b){
            System.out.println(a + " es mayor que "+ b);
        }
        else if (a==b){
            System.out.println(a + " es igual a " + b);
        }
        else{
            System.out.println(a + " es menor que "+ b);
        }
    }
}

