import java.util.Scanner;

public class Formula_General {
    public static void main(String[] args) {
        System.out.println("Valor_Formula_General: ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor de A: ");
        double A = teclado.nextInt();
        System.out.println("Valor de B: ");
        double B = teclado.nextInt();
        System.out.println("Valor de C: ");
        double C = teclado.nextInt();
        double exp = 2;
        double Q = Math.sqrt(Math.pow(B, exp) - 4 * A * C);
        double X1 = (-B+Q) / (2*A);
        double X2 = (-B-Q) / (2*A);
        System.out.println("Resultado del valor x1: "+ X1);
        System.out.println("Resultado del valor x2: "+ X2);
    }
}
