import java.util.Scanner;

public class Area_de_un_Circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Area de un Circulo: ");
        System.out.println("Colocar el valor del Radio");
        double R = teclado.nextInt();
        double exp = 2;
        double Area = Math.PI* Math.pow(R, exp);
        System.out.println("Resultado del Area: "+ Area);
    }
}
