import java.util.Scanner;

public class DonorRegistrationValidator {
    private String name;
    private int age;
    private String bloodGroup;

    public DonorRegistrationValidator(String name, int age, String bloodGroup) {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
    }

    public void displayResult() {
        System.out.println("\n--- Donor Registration Review ---");
        System.out.println("Name: " + name);
        System.out.println("Age entered: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Basic details check: Passed");
        System.out.println("Medical eligibility must be confirmed by qualified staff.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter donor name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter age: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a valid age.");
            sc.close();
            return;
        }
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter blood group: ");
        String group = sc.nextLine().trim().toUpperCase();

        String[] groups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        boolean valid = false;
        for (String g : groups) {
            if (g.equals(group)) valid = true;
        }

        if (name.isEmpty() || age < 1 || age > 120 || !valid) {
            System.out.println("Please check the name, age and blood group.");
            sc.close();
            return;
        }

        new DonorRegistrationValidator(name, age, group).displayResult();
        sc.close();
    }
}
