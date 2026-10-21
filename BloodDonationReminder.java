
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BloodDonationReminder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Blood Donation Reminder ===");
        System.out.print("Enter last donation date (YYYY-MM-DD): ");

        String input = sc.nextLine().trim();

        try {
            LocalDate lastDonation = LocalDate.parse(input);

            if (lastDonation.isAfter(LocalDate.now())) {
                System.out.println("Donation date cannot be in the future.");
            } else {
                System.out.println("Last donation: " + lastDonation);
                System.out.println("Please ask your blood bank");
                System.out.println("to confirm your next eligible date.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date. Use YYYY-MM-DD.");
        }

        sc.close();
    }
}
