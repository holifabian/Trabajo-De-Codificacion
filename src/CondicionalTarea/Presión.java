package CondicionalTarea;
import java.util.Scanner;
public class Presión {
    public static void main(String[] args) {
        System.out.println("Presión");
        System.out.println("Ingrese un tiempo");
        Scanner teclado = new Scanner(System.in);
        double tiempo = teclado.nextDouble();
        double presionmenos35 = (0.46 * tiempo);
        double presionmas35 = (0.19 * tiempo) + 9.45;
        if ((tiempo) <= 35) {
            System.out.println("La presión en libras por pulgada cuadrada es: " + presionmenos35);
        } else if (tiempo > 35) {
            System.out.println("La presión en libras por pulgada cuadrada es: " + presionmas35);
        }
    }
}
