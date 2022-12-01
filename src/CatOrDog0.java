public class CatOrDog0 {
    public static void main(String[] args) {
        String pet = args[0];
        if (pet.equalsIgnoreCase("Cat")){
            System.out.println("Meaow!");
        } else if (pet.equalsIgnoreCase("Dog")) {
            System.out.println("Woof!");
        } else {
            System.out.println("Unknown pet");
        }
    }
}
