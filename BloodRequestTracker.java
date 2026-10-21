
import java.util.ArrayList;
import java.util.Scanner;

public class BloodRequestTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> requests = new ArrayList<>();

        System.out.println("=== Blood Request Tracker ===");

        System.out.print("Enter patient name: ");
        String patient = sc.nextLine().trim();

        System.out.print("Enter required blood group: ");
        String group = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter hospital name: ");
        String hospital = sc.nextLine().trim();

        System.out.print("Enter units required: ");
        int units = sc.nextInt();

        if (patient.isEmpty() || group.isEmpty()
                || hospital.isEmpty() || units <= 0) {
            System.out.println("Invalid request details.");
        } else {
            String request = "Patient: " + patient
                    + " | Blood Group: " + group
                    + " | Hospital: " + hospital
                    + " | Units: " + units;

            requests.add(request);

            System.out.println("\nRequest recorded successfully!");
            for (String item : requests) {
                System.out.println(item);
            }
        }

        sc.close();
    }
}
