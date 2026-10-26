import java.util.Scanner;

public class BloodStockLevelChecker {
    private String bloodGroup;
    private int unitsAvailable;
    private int minimumRequired;

    public BloodStockLevelChecker(String bloodGroup, int unitsAvailable,
                                  int minimumRequired) {
        this.bloodGroup = bloodGroup;
        this.unitsAvailable = unitsAvailable;
        this.minimumRequired = minimumRequired;
    }

    public void displayStatus() {
        System.out.println("\n--- Blood Stock Level Report ---");
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Units Available: " + unitsAvailable);
        System.out.println("Minimum Target: " + minimumRequired);

        if (unitsAvailable < minimumRequired) {
            System.out.println("Status: Below the configured target.");
        } else {
            System.out.println("Status: Target reached.");
        }

        System.out.println("Confirm actual inventory with the blood bank.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter blood group: ");
        String group = sc.nextLine().trim().toUpperCase();

        String[] groups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        boolean valid = false;
        for (String g : groups) {
            if (g.equals(group)) valid = true;
        }

        if (!valid) {
            System.out.println("Invalid blood group.");
            sc.close();
            return;
        }

        System.out.print("Enter units available: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int units = sc.nextInt();

        System.out.print("Enter minimum target units: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int target = sc.nextInt();

        if (units < 0 || target < 0) {
            System.out.println("Unit counts cannot be negative.");
            sc.close();
            return;
        }

        new BloodStockLevelChecker(group, units, target).displayStatus();
        sc.close();
    }
}
