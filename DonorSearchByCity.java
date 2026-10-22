
import java.util.Scanner;

public class DonorSearchByCity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {
            "Rahul", "Priya", "Arun", "Sneha", "Kiran"
        };

        String[] cities = {
            "Bengaluru", "Mysuru", "Bengaluru",
            "Mandya", "Mysuru"
        };

        String[] groups = {
            "O+", "A+", "B+", "O-", "AB+"
        };

        System.out.println("=== Donor Search By City ===");
        System.out.print("Enter city: ");
        String city = sc.nextLine().trim();

        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (cities[i].equalsIgnoreCase(city)) {
                System.out.println("Name: " + names[i]);
                System.out.println("Blood Group: " + groups[i]);
                System.out.println("City: " + cities[i]);
                System.out.println("-------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No donors found in this city.");
        }

        sc.close();
    }
}
