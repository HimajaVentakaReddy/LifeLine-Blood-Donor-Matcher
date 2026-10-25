import java.util.Scanner;

public class BloodRequestPriority {
    private int urgencyLevel;

    public BloodRequestPriority(int urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public String getPriority() {
        if (urgencyLevel == 1) {
            return "Critical - contact emergency medical services";
        } else if (urgencyLevel == 2) {
            return "High - contact the hospital promptly";
        } else {
            return "Routine - coordinate with the donation center";
        }
    }

    public void displayResult() {
        System.out.println("\n--- Blood Request Priority ---");
        System.out.println("Urgency Level: " + urgencyLevel);
        System.out.println("Priority: " + getPriority());
        System.out.println("This is a basic guide, not medical triage.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Critical");
        System.out.println("2. High");
        System.out.println("3. Routine");
        System.out.print("Select urgency level (1-3): ");

        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid number.");
            sc.close();
            return;
        }

        int level = sc.nextInt();
        if (level < 1 || level > 3) {
            System.out.println("Choose 1, 2, or 3.");
            sc.close();
            return;
        }

        new BloodRequestPriority(level).displayResult();
        sc.close();
    }
}
