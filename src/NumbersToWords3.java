import java.util.Scanner;

public class NumbersToWords3 {
    public static void main(String[] args) {
        System.out.println(numberToWord(getNumero1al10()));
    }

    private static String numberToWord(int n) {
        String word;
        switch (n) {
            case 1:
                word = "Uno";
                break;
            case 2:
                word = "Dos";
                break;
            case 3:
                word = "Tres";
                break;
            case 4:
                word = "Cuatro";
                break;
            case 5:
                word = "Cinco";
                break;
            case 6:
                word = "Seis";
                break;
            case 7:
                word = "Siete";
                break;
            case 8:
                word = "Ocho";
                break;
            case 9:
                word = "Nueve";
                break;
            case 10:
                word = "Diez";
                break;
            default:
                word = "Error";
                break;
        }
        return word;
    }

    private static int getNumero1al10() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0; // valor inicial para que entre al bucle

        while (numero <= 0 || numero > 10) {
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
}
