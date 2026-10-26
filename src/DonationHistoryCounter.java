import java.util.Scanner;

public class DonationHistoryCounter {
    private int previousDonations;
    private int newDonations;

    public DonationHistoryCounter(int previousDonations, int newDonations) {
        this.previousDonations = previousDonations;
        this.newDonations = newDonations;
    }

    public int calculateTotal() {
        return previousDonations + newDonations;
    }

    public void displayHistory() {
        System.out.println("\n--- Donation History Summary ---");
        System.out.println("Previous Donations: " + previousDonations);
        System.out.println("New Donations Recorded: " + newDonations);
        System.out.println("Total Donations: " + calculateTotal());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter previous donation count: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid whole number.");
            sc.close();
            return;
        }
        int previous = sc.nextInt();

        System.out.print("Enter additional donations to record: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid whole number.");
            sc.close();
            return;
        }
        int additional = sc.nextInt();

        if (previous < 0 || additional < 0
                || previous > Integer.MAX_VALUE - additional) {
            System.out.println("Counts must be non-negative and within range.");
            sc.close();
            return;
        }

        new DonationHistoryCounter(previous, additional).displayHistory();
        sc.close();
    }
}
