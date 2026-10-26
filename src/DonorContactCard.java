import java.util.Scanner;

public class DonorContactCard {
    private String name;
    private String phone;
    private String bloodGroup;

    public DonorContactCard(String name, String phone, String bloodGroup) {
        this.name = name;
        this.phone = phone;
        this.bloodGroup = bloodGroup;
    }

    public void displayCard() {
        System.out.println("\n--- Donor Contact Card ---");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Keep donor contact details private.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter donor name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine().trim();

        System.out.print("Enter blood group: ");
        String group = sc.nextLine().trim().toUpperCase();

        String[] groups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        boolean valid = false;

        for (String g : groups) {
            if (g.equals(group)) valid = true;
        }

        if (name.isEmpty() || !phone.matches("[0-9]{10}") || !valid) {
            System.out.println("Enter a name, 10-digit phone number and valid blood group.");
            sc.close();
            return;
        }

        new DonorContactCard(name, phone, group).displayCard();
        sc.close();
    }
}
