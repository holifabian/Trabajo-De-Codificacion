package CondicionalTarea;
import java.util.Scanner;
public class Tiempo {
    public static void main(String[] args) {
        System.out.println("Ingrese minutos");
        Scanner teclado = new Scanner(System.in);
        int tiempo = teclado.nextInt();
        int dias = (tiempo / 1440);
        int horas = (tiempo / 60);
        if (tiempo > 0) {
            System.out.println("El tiempo en días es: " + dias);
            System.out.println("El tiempo en horas es: " + horas);
        }
    }
}
