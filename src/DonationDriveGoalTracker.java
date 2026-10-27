import java.util.Scanner;

public class DonationDriveGoalTracker {
    private int target;
    private int collected;

    public DonationDriveGoalTracker(int target, int collected) {
        this.target = target;
        this.collected = collected;
    }

    public double calculateProgress() {
        return Math.min(100.0, collected * 100.0 / target);
    }

    public void displayReport() {
        System.out.println("\n--- Donation Drive Progress ---");
        System.out.println("Target: " + target);
        System.out.println("Collected: " + collected);
        System.out.printf("Progress: %.2f%%%n", calculateProgress());

        if (collected >= target) {
            System.out.println("Target reached!");
        } else {
            System.out.println("Still needed: " + (target - collected));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter donation drive target: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int target = sc.nextInt();

        System.out.print("Enter donations collected so far: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int collected = sc.nextInt();

        if (target <= 0 || collected < 0) {
            System.out.println("Target must be positive and collected cannot be negative.");
            sc.close();
            return;
        }

        new DonationDriveGoalTracker(target, collected).displayReport();
        sc.close();
    }
}
