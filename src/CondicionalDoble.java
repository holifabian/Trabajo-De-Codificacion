import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("programa para determinar mayoria de edad");
        System.out.println("ingrese su edad");
        int edad= teclado.nextInt();
        boolean evaluacion =(edad <= 18);
        if (edad >= 18) {
            System.out.println("eres mayor de edad");
            System.out.println("estas casi listo para la u");
        }else{
            System.out.println("aun eres menor de edad");
        }

    }
}
