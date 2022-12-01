public class CatOrDog3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use: java CatOrDog1 pet_name");
        } else {
            String pet = args[0];
            petSound(pet);
        }
    }

    private static void petSound(String pet) {
        pet = pet.toLowerCase();
        if (pet.equals("cat")) {
            System.out.println("Meaow!");
        } else if (pet.equals("dog")) {
            System.out.println("Woof!");
        } else {
            System.out.println("Unknown pet");
        }
    }
}
