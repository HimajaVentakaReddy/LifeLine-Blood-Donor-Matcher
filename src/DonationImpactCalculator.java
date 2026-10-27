import java.util.Scanner;

public class DonationImpactCalculator {
    private int donationCount;

    public DonationImpactCalculator(int donationCount) {
        this.donationCount = donationCount;
    }

    public int calculatePotentialComponents() {
        return donationCount * 3;
    }

    public void displayReport() {
        System.out.println("\n--- Donation Impact Estimate ---");
        System.out.println("Donations recorded: " + donationCount);
        System.out.println("Potential components: "
                + calculatePotentialComponents());
        System.out.println("This is an educational estimate, not a guarantee.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of donations: ");

        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid whole number.");
            sc.close();
            return;
        }

        int count = sc.nextInt();
        if (count < 0 || count > Integer.MAX_VALUE / 3) {
            System.out.println("Enter a valid donation count.");
            sc.close();
            return;
        }

        new DonationImpactCalculator(count).displayReport();
        sc.close();
    }
}
