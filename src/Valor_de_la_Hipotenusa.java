import java.util.Scanner;

public class Valor_de_la_Hipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor de la Hipotenusa: ");
        System.out.println("Valor del Cateto Adyacente: ");
        double Cateto_Adyacente = teclado.nextInt();
        System.out.println("Valor del Cateto Opuesto: ");
        double Cateto_Opuesto = teclado.nextInt();
        double exp = 2;
        double Hipotenusa = Math.sqrt(Math.pow(Cateto_Adyacente, exp) + Math.pow(Cateto_Opuesto, exp));
        System.out.println("Resultado de la Hipotenusa: "+ Hipotenusa);
    }
}
