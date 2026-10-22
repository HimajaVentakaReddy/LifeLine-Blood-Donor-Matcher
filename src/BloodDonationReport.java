
import java.util.Scanner;

public class BloodDonationReport {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Blood Donation Report ===");

        System.out.print("Enter donor name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter blood group: ");
        String group = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter total donations recorded: ");
        int donations = sc.nextInt();

        System.out.print("Enter total units donated: ");
        int units = sc.nextInt();

        if (name.isEmpty() || group.isEmpty()
                || donations < 0 || units < 0) {
            System.out.println("Invalid report details.");
        } else {
            System.out.println("\n----- Donation Summary -----");
            System.out.println("Donor Name: " + name);
            System.out.println("Blood Group: " + group);
            System.out.println("Total Donations: " + donations);
            System.out.println("Total Units: " + units);
            System.out.println("Report generated successfully.");
        }

        sc.close();
    }
}
