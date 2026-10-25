import java.util.Scanner;

public class BloodDonationAppointment {
    private String donorName;
    private String bloodGroup;
    private String appointmentDay;

    public BloodDonationAppointment(String donorName, String bloodGroup,
                                    String appointmentDay) {
        this.donorName = donorName;
        this.bloodGroup = bloodGroup;
        this.appointmentDay = appointmentDay;
    }

    public void displayAppointment() {
        System.out.println("\n--- Blood Donation Appointment ---");
        System.out.println("Donor Name: " + donorName);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Appointment Day: " + appointmentDay);
        System.out.println("Status: Details recorded.");
        System.out.println("Confirm availability with the donation center.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter donor name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter blood group (A+, O-, AB+, etc.): ");
        String group = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter appointment day: ");
        String day = sc.nextLine().trim();

        String[] validGroups = {
            "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"
        };

        boolean validGroup = false;

        for (String valid : validGroups) {
            if (valid.equals(group)) {
                validGroup = true;
                break;
            }
        }

        if (name.isEmpty() || day.isEmpty() || !validGroup) {
            System.out.println("Invalid details. Please check your inputs.");
            sc.close();
            return;
        }

        BloodDonationAppointment appointment =
                new BloodDonationAppointment(name, group, day);

        appointment.displayAppointment();
        sc.close();
    }
}
