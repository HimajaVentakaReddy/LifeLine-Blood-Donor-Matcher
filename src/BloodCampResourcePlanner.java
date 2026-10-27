import java.util.Scanner;



    public int calculateDonorsPerDesk() {
        return (expectedDonors + registrationDesks - 1) / registrationDesks;
    }

    public void displayPlan() {
        System.out.println("\n--- Blood Camp Resource Plan ---");
        System.out.println("Expected donors: " + expectedDonors);
        System.out.println("Registration desks: " + registrationDesks);
        System.out.println("Approximate donors per desk: "
                + calculateDonorsPerDesk());
        System.out.println("Arrange trained staff and supplies separately.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Expected donor count: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int donors = sc.nextInt();

        System.out.print("Number of registration desks: ");
        if (!sc.hasNextInt()) {
            System.out.println("Enter a whole number.");
            sc.close();
            return;
        }
        int desks = sc.nextInt();

        if (donors <= 0 || desks <= 0) {
            System.out.println("Both values must be positive.");
            sc.close();
            return;
        }

        new BloodCampResourcePlanner(donors, desks).displayPlan();
        sc.close();
    }
}
