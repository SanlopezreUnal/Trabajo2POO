import java.util.Scanner;
public class EjercicioP24 {

    public static void main(String[] args) {
        double pesobola1, pesobola2, pesobola3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera 1: ");
        pesobola1 = entrada.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera 2: ");
        pesobola2 = entrada.nextDouble();
        
        System.out.println("Ingrese el peso de la esfera 3: ");
        pesobola3 = entrada.nextDouble();
        
        if ((pesobola1>pesobola2)&&(pesobola1>pesobola3)){
            System.out.println("La esfera 1 es la mas pesada con: "+ pesobola1);
        }
        else if((pesobola2>pesobola1)&&(pesobola2>pesobola3)){
            System.out.println("La esfera 2 es la mas pesada con: "+ pesobola2);
        }
        else{
            System.out.println("La esfera 3 es la mas pesada con: "+ pesobola3);
        }
    }
}
