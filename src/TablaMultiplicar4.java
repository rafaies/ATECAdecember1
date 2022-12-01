import java.util.Scanner;

public class TablaMultiplicar4 {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean fin = false;
        while(!fin) {
            int numero = getNumero1al10();
            MuestraTablaMultiplicar(numero);
            fin = isFin();
        }
    }

    private static boolean isFin() {
        System.out.print("\n¿Otra Tabla? (S/N): ");
        String respuesta = scanner.nextLine().toUpperCase();
        return respuesta.equals("N");
    }

    // lee un número obligando a que esté en el rango 1-10
    private static int getNumero1al10() {
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
        return numero;
    }

    // Muestra la tabla de multiplicar del número elegido
    private static void MuestraTablaMultiplicar(int numero) {
        System.out.println("\n  Tabla de multiplicar del " + numero);
        System.out.println("===============================");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t\t" + numero + " x " + i + " = " + numero * i);
        }
    }
}
