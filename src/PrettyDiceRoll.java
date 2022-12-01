import java.util.Random;

public class PrettyDiceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        int dado = random.nextInt(2) + 1;
        if (dado == 1) {
            System.out.println("+----+\n" +
                    "|    | \n" +
                    "|  o | \n" +
                    "|    |\n" +
                    "+----+");
        } else if (dado == 2) {
            System.out.println("+----+\n" +
                    "|    | \n" +
                    "| oo | \n" +
                    "|    |\n" +
                    "+----+");
        }
    }
}
