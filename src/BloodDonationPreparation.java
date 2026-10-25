import java.util.Scanner;

public class BloodDonationPreparation {
    private boolean hydrated;
    private boolean ateMeal;
    private boolean carryingIdentification;

    public BloodDonationPreparation(boolean hydrated, boolean ateMeal,
                                    boolean carryingIdentification) {
        this.hydrated = hydrated;
        this.ateMeal = ateMeal;
        this.carryingIdentification = carryingIdentification;
    }

    public void displayReport() {
        System.out.println("\n--- Donation Preparation Report ---");
        System.out.println("Drank water: " + (hydrated ? "Yes" : "No"));
        System.out.println("Had a meal: " + (ateMeal ? "Yes" : "No"));
        System.out.println("Has identification: "
                + (carryingIdentification ? "Yes" : "No"));

        if (hydrated && ateMeal && carryingIdentification) {
            System.out.println("Your basic preparation checklist is complete.");
        } else {
            System.out.println("Review the items above before your visit.");
        }

        System.out.println("Follow the donation center's official instructions.");
    }

    private static boolean readYesNo(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String answer = sc.nextLine().trim();

            if (answer.equalsIgnoreCase("yes")) return true;
            if (answer.equalsIgnoreCase("no")) return false;

            System.out.println("Please enter yes or no.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean water = readYesNo(sc, "Have you had water? (yes/no): ");
        boolean meal = readYesNo(sc, "Have you eaten a meal? (yes/no): ");
        boolean id = readYesNo(sc, "Do you have identification? (yes/no): ");

        new BloodDonationPreparation(water, meal, id).displayReport();
        sc.close();
    }
}
