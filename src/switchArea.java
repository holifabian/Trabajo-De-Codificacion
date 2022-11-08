import java.util.Scanner;

public class switchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 3");
        int num = teclado.nextInt();
        switch (num){
            case 1:
                System.out.println("area de un triangulo");
                System.out.println("ingrese el valor de la base");
                int base = teclado.nextInt();
                System.out.println("ingrese el valor de la altura");
                int altura = teclado.nextInt();
                double area = base * altura / 2;
                break;
            case 2:
                System.out.println("area de un circulo");
                System.out.println("ingrese radio");
                int radio = teclado.nextInt();
                double areatotal = Math. PI * (radio * radio);
                break;
            case 3:
                System.out.println("area de un cuadrado");
                System.out.println("ingrese lado");
                int lado = teclado.nextInt();
                double a = (lado * lado);
                break;
            default:
                System.out.println("error");






        }

    }
}
