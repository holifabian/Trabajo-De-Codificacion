package CondicionalTarea;
import java.util.Scanner;
public class NúmeroMayor {
    public static void main(String[] args) {
        System.out.println("Ingrese primer número");
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
        System.out.println("Ingresar segundo número");
        int numero2 = teclado.nextInt();
        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor");
        } else {
            System.out.println("El segundo es mayor");
        }
    }
}
