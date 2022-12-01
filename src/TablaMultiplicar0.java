import java.util.Scanner;

public class TablaMultiplicar0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 10: ");
        int numero = scanner.nextInt();
        // obligar al usuario a poner un número positivo
        // SOLAMENTE entrará en el bucle siguiente si ha introducido un número <= 0
        while(numero <= 0 || numero > 10) {
            System.out.print("Por favor, un número del 1 al 10: ");
            numero = scanner.nextInt();
        }
        // Muestra la tabla de multiplicar del número elegido
        System.out.println("\n  Tabla de multiplicar del " + numero);
        System.out.println("===============================");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t\t" + numero + " x " + i + " = " + numero * i);
        }
    }
}
