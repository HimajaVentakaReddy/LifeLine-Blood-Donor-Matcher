import java.util.Scanner;

public class DonorEligibilityChecklist {
    private int age;
    private boolean feelingWell;
    private boolean hasValidAppointment;

    public DonorEligibilityChecklist(int age, boolean feelingWell,
                                     boolean hasValidAppointment) {
        this.age = age;
        this.feelingWell = feelingWell;
        this.hasValidAppointment = hasValidAppointment;
    }

    public void displayChecklist() {
        System.out.println("\n--- Donor Preparation Checklist ---");
        System.out.println("Age entered: " + age);
        System.out.println("Feeling well: " + (feelingWell ? "Yes" : "No"));
        System.out.println("Appointment arranged: "
                + (hasValidAppointment ? "Yes" : "No"));

        System.out.println("Please consult donation-center staff to confirm "
                + "eligibility.");
        System.out.println("This checklist does not determine medical eligibility.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid age.");
            sc.close();
            return;
        }
        int age = sc.nextInt();

        if (age < 1 || age > 120) {
            System.out.println("Enter a valid age.");
            sc.close();
            return;
        }

        System.out.print("Are you feeling well today? (yes/no): ");
        String well = sc.next().trim();

        System.out.print("Do you have an appointment? (yes/no): ");
        String appointment = sc.next().trim();

        if ((!well.equalsIgnoreCase("yes") && !well.equalsIgnoreCase("no"))
                || (!appointment.equalsIgnoreCase("yes")
                && !appointment.equalsIgnoreCase("no"))) {
            System.out.println("Please enter yes or no.");
            sc.close();
            return;
        }

        DonorEligibilityChecklist checklist =
                new DonorEligibilityChecklist(age,
                        well.equalsIgnoreCase("yes"),
                        appointment.equalsIgnoreCase("yes"));
        checklist.displayChecklist();
        sc.close();
    }
}
