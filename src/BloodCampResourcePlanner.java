import java.util.Scanner;

public class BloodCampResourcePlanner {
    private int expectedDonors;
    private int registrationDesks;

    public BloodCampResourcePlanner(int expectedDonors, int registrationDesks) {
        this.expectedDonors = expectedDonors;
        this.registrationDesks = registrationDesks;
    }

    public int calculateDonorsPerDesk() {
        return (expectedDonors + registrationDesks - 1) / registrationDesks;
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
