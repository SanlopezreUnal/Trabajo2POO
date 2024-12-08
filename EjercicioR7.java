import java.util.Scanner;
public class EjercicioRR7 {

    public static void main(String[] args) {
        double n1,n2,n3,menor,mayor;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Escriba el valor de n1");
        n1 = entrada.nextDouble();
        
        System.out.println("Escriba el valor de n2");
        n2 = entrada.nextDouble();
        
        System.out.println("Escriba el valor de n3");
        n3 = entrada.nextDouble();
        
        if ((n1>n2) && (n1>n3)) {
            mayor = n1;
        }
        else if (n2>n3) {
            mayor = n2;
        }
        else {
            mayor = n3;
           
        }
        
        System.out.println("El mayor entre: "+ n1 + ", "+ n2 + " y "+ n3 + " es "+ mayor);
        
    }
}
