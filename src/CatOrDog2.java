public class CatOrDog2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use: java CatOrDog1 pet_name");
        } else {
            String pet = args[0];
            petSound(pet);
        }
    }

    private static void petSound(String pet) {
        if (pet.equalsIgnoreCase("Cat")) {
            System.out.println("Meaow!");
        } else if (pet.equalsIgnoreCase("Dog")) {
            System.out.println("Woof!");
        } else {
            System.out.println("Unknown pet");
        }
    }
}
