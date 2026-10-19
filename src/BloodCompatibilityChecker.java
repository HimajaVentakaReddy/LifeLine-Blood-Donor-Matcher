
import java.util.Scanner;

public class BloodCompatibilityChecker {

    public static boolean canDonate(String donor, String recipient) {
        donor = donor.toUpperCase().trim();
        recipient = recipient.toUpperCase().trim();

        switch (donor) {
            case "O-":
                return true;

            case "O+":
                return recipient.equals("O+")
                    || recipient.equals("A+")
                    || recipient.equals("B+")
                    || recipient.equals("AB+");

            case "A-":
                return recipient.equals("A-")
                    || recipient.equals("A+")
                    || recipient.equals("AB-")
                    || recipient.equals("AB+");

            case "A+":
                return recipient.equals("A+")
                    || recipient.equals("AB+");

            case "B-":
                return recipient.equals("B-")
                    || recipient.equals("B+")
                    || recipient.equals("AB-")
                    || recipient.equals("AB+");

            case "B+":
                return recipient.equals("B+")
                    || recipient.equals("AB+");

            case "AB-":
                return recipient.equals("AB-")
                    || recipient.equals("AB+");

            case "AB+":
                return recipient.equals("AB+");

            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Blood Compatibility Checker ===");

        System.out.print("Enter donor blood group: ");
        String donor = sc.nextLine().trim();

        System.out.print("Enter recipient blood group: ");
        String recipient = sc.nextLine().trim();

        if (canDonate(donor, recipient)) {
            System.out.println(
                donor.toUpperCase() + " may be compatible with "
                + recipient.toUpperCase()
            );
        } else {
            System.out.println(
                "These blood groups are not compatible for red-cell donation."
            );
        }

        sc.close();
    }
}
