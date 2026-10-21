
import java.util.Scanner;

public class DonorEligibilityChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Donor Eligibility Pre-Screening ===");

        System.out.print("Enter donor name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        if (age <= 0 || weight <= 0) {
            System.out.println("Please enter valid details.");
        } else if (age < 18) {
            System.out.println("Professional eligibility review required.");
            System.out.println("Minors should not donate blood.");
        } else {
            System.out.println("Details recorded for " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Consult a blood bank for eligibility screening.");
        }

        sc.close();
    }
}
