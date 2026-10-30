import java.util.Scanner;

public class BloodDonationReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter donor name: ");
        String name = sc.nextLine();

        System.out.print("Enter days since last donation: ");
        int days = sc.nextInt();

        if (days < 0) {
            System.out.println("Invalid number of days.");
        } else if (days >= 90) {
            System.out.println(name + " may check donation eligibility.");
        } else {
            System.out.println(name + " should wait " + (90 - days) + " more days.");
        }

        sc.close();
    }
}
