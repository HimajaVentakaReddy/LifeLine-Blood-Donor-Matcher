import java.util.Scanner;

public class BloodGroupInformation {
    private String bloodGroup;

    public BloodGroupInformation(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getInformation() {
        switch (bloodGroup) {
            case "A+":
            case "A-":
                return "Group A blood type recorded.";
            case "B+":
            case "B-":
                return "Group B blood type recorded.";
            case "AB+":
            case "AB-":
                return "Group AB blood type recorded.";
            case "O+":
            case "O-":
                return "Group O blood type recorded.";
            default:
                return "Unknown blood group.";
        }
    }

    public void displayInformation() {
        System.out.println("\n--- Blood Group Information ---");
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Information: " + getInformation());
        System.out.println("Compatibility must be confirmed by medical staff.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter blood group (A+, A-, B+, B-, AB+, AB-, O+, O-): ");
        String group = sc.nextLine().trim().toUpperCase();

        String[] validGroups = {
            "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"
        };

        boolean valid = false;
        for (String item : validGroups) {
            if (item.equals(group)) {
                valid = true;
                break;
            }
        }

        if (!valid) {
            System.out.println("Invalid blood group.");
            sc.close();
            return;
        }

        new BloodGroupInformation(group).displayInformation();
        sc.close();
    }
}
