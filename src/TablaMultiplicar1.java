import java.util.Scanner;

public class TablaMultiplicar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numero = 0; // valor inicial para que entre al bucle

        while(numero <= 0 || numero > 10) {
            System.out.print("Introduzca un número del 1 al 10: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Recuerde, solamente números del 1 al 10: ");
                scanner.nextLine(); // limpia el buffer
            }
            numero = scanner.nextInt();
            scanner.nextLine(); // limpia el buffer
        }

        // Muestra la tabla de multiplicar del número elegido
        System.out.println("\n  Tabla de multiplicar del " + numero);
        System.out.println("===============================");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t\t" + numero + " x " + i + " = " + numero * i);
        }

    }
}
