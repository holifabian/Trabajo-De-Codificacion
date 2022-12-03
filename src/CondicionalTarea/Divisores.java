package CondicionalTarea;
import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
        System.out.println("Divisores");
        System.out.println("Ingrese numero 1");
        Scanner teclado = new Scanner(System.in);
        int numero_1 = teclado.nextInt();
        System.out.println("Ingresar numero 2");
        int numero_2 = teclado.nextInt();
        if (numero_1 % numero_2 == 0) {
            System.out.println("El numero 2 es divisor del numero 1");
            System.out.println("No son números divisores entre si");
        }
    }
}

