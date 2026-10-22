
import java.time.LocalDate;
import java.util.Scanner;

public class BloodDonationCertificate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Donation Certificate Generator ===");

        System.out.print("Enter donor name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter blood group: ");
        String group = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter donation center: ");
        String center = sc.nextLine().trim();

        System.out.print("Enter units donated: ");
        int units = sc.nextInt();

        if (name.isEmpty() || group.isEmpty()
                || center.isEmpty() || units <= 0) {
            System.out.println("Please enter valid details.");
        } else {
            System.out.println("\n==============================");
            System.out.println("   BLOOD DONATION RECORD");
            System.out.println("==============================");
            System.out.println("Donor Name: " + name);
            System.out.println("Blood Group: " + group);
            System.out.println("Donation Center: " + center);
            System.out.println("Units Recorded: " + units);
            System.out.println("Date: " + LocalDate.now());
            System.out.println("==============================");
            System.out.println("Record generated successfully.");
        }

        sc.close();
    }
}
