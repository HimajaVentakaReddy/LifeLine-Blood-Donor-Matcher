import java.util.Scanner;

public class DonationCampChecklist {
    private String venue;
    private int expectedDonors;
    private int registrationDesks;

    public DonationCampChecklist(String venue, int expectedDonors,
                                 int registrationDesks) {
        this.venue = venue;
        this.expectedDonors = expectedDonors;
        this.registrationDesks = registrationDesks;
    }

    public void displayPlan() {
        System.out.println("\n--- Donation Camp Planning Checklist ---");
        System.out.println("Venue: " + venue);
        System.out.println("Expected Donors: " + expectedDonors);
        System.out.println("Registration Desks: " + registrationDesks);
        System.out.println("Checklist:");
        System.out.println("- Confirm venue and date");
        System.out.println("- Arrange trained medical staff");
        System.out.println("- Prepare registration and waiting areas");
        System.out.println("- Confirm equipment and emergency procedures");
        System.out.println("- Coordinate with an authorized blood bank");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter camp venue: ");
        String venue = sc.nextLine().trim();

        System.out.print("Enter expected number of donors: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int donors = sc.nextInt();

        System.out.print("Enter number of registration desks: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int desks = sc.nextInt();

        if (venue.isEmpty() || donors <= 0 || desks <= 0) {
            System.out.println("Venue, donor count and desk count must be valid.");
            sc.close();
            return;
        }

        new DonationCampChecklist(venue, donors, desks).displayPlan();
        sc.close();
    }
}
