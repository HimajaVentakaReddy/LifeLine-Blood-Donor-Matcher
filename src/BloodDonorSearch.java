
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



        void display() {
            System.out.println("Name: " + name);
            System.out.println("Blood Group: " + bloodGroup);
            System.out.println("City: " + city);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Donor> donors = new ArrayList<>();

        donors.add(new Donor("Rahul", "O+", "Bengaluru"));
        donors.add(new Donor("Priya", "A+", "Mysuru"));
        donors.add(new Donor("Arun", "B+", "Bengaluru"));
        donors.add(new Donor("Sneha", "O-", "Mandya"));
        donors.add(new Donor("Kiran", "AB+", "Mysuru"));

        System.out.println("=== Blood Donor Search ===");
        System.out.print("Enter required blood group: ");
        String requiredGroup = sc.nextLine().trim();

        System.out.print("Enter city: ");
        String requiredCity = sc.nextLine().trim();

        boolean found = false;

        for (Donor donor : donors) {
            if (donor.bloodGroup.equalsIgnoreCase(requiredGroup)
                    && donor.city.equalsIgnoreCase(requiredCity)) {
                donor.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching donor found.");
        }

        sc.close();
    }
}
