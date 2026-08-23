import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static List<Donor> donors = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        System.out.println("======================================");
        System.out.println("     LifeLine Blood Donor Matcher");
        System.out.println("======================================");

        do {

            showMenu();

            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    registerDonor();
                    break;

                case 2:
                    viewDonors();
                    break;

                case 3:
                    createEmergencyRequest();
                    break;

                case 4:
                    searchByBloodGroup();
                    break;

                case 5:
                    updateAvailability();
                    break;

                case 6:
                    System.out.println();
                    System.out.println(
                            "Thank you for using LifeLine.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        scanner.close();
    }

    public static void showMenu() {

        System.out.println();
        System.out.println("----------- MAIN MENU -----------");
        System.out.println("1. Register Donor");
        System.out.println("2. View All Donors");
        System.out.println("3. Emergency Blood Request");
        System.out.println("4. Search Donors by Blood Group");
        System.out.println("5. Update Donor Availability");
        System.out.println("6. Exit");
        System.out.println("---------------------------------");
    }

    public static void registerDonor() {

        System.out.println();
        System.out.println("----- REGISTER DONOR -----");

        System.out.print("Enter donor name: ");
        String name = scanner.nextLine();

        System.out.print(
                "Enter blood group (A+, A-, B+, B-, O+, O-, AB+, AB-): ");

        String bloodGroup =
                scanner.nextLine().toUpperCase();

        if (!isValidBloodGroup(bloodGroup)) {

            System.out.println("Invalid blood group.");

            return;
        }

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.print(
                "Is donor currently available? (yes/no): ");

        String availability = scanner.nextLine();

        boolean available =
                availability.equalsIgnoreCase("yes");

        Donor donor =
                new Donor(
                        name,
                        bloodGroup,
                        location,
                        phone,
                        available);

        donors.add(donor);

        System.out.println();
        System.out.println(
                "Donor registered successfully.");
    }

    public static void viewDonors() {

        System.out.println();
        System.out.println("----- REGISTERED DONORS -----");

        if (donors.isEmpty()) {

            System.out.println(
                    "No donors have been registered.");

            return;
        }

        for (int i = 0; i < donors.size(); i++) {

            System.out.println(
                    (i + 1) + ". " + donors.get(i));
        }
    }

    public static void createEmergencyRequest() {

        System.out.println();
        System.out.println(
                "----- EMERGENCY BLOOD REQUEST -----");

        if (donors.isEmpty()) {

            System.out.println(
                    "No donors are currently registered.");

            return;
        }

        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        System.out.print("Required blood group: ");

        String bloodGroup =
                scanner.nextLine().toUpperCase();

        if (!isValidBloodGroup(bloodGroup)) {

            System.out.println("Invalid blood group.");

            return;
        }

        System.out.print("Emergency location: ");
        String location = scanner.nextLine();

        EmergencyRequest request =
                new EmergencyRequest(
                        patientName,
                        bloodGroup,
                        location);

        List<Donor> matches =
                DonorMatcher.findCompatibleDonors(
                        donors,
                        request);

        System.out.println();
        System.out.println("Searching for donors...");

        if (matches.isEmpty()) {

            System.out.println(
                    "No compatible available donors found.");

            return;
        }

        System.out.println();
        System.out.println(
                "Compatible donors found:");

        for (int i = 0; i < matches.size(); i++) {

            System.out.println(
                    (i + 1)
                            + ". "
                            + matches.get(i));
        }

        System.out.println();
        System.out.println(
                "Best matches are shown first.");
    }

    public static void searchByBloodGroup() {

        System.out.println();
        System.out.println(
                "----- SEARCH DONORS -----");

        System.out.print(
                "Enter blood group to search: ");

        String bloodGroup =
                scanner.nextLine().toUpperCase();

        boolean found = false;

        for (Donor donor : donors) {

            if (donor.getBloodGroup()
                    .equalsIgnoreCase(bloodGroup)) {

                System.out.println(donor);

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No donors found with blood group "
                            + bloodGroup);
        }
    }

    public static void updateAvailability() {

        System.out.println();
        System.out.println(
                "----- UPDATE AVAILABILITY -----");

        System.out.print(
                "Enter donor phone number: ");

        String phone = scanner.nextLine();

        for (Donor donor : donors) {

            if (donor.getPhoneNumber()
                    .equals(phone)) {

                System.out.print(
                        "Available now? (yes/no): ");

                String answer =
                        scanner.nextLine();

                donor.setAvailable(
                        answer.equalsIgnoreCase("yes"));

                System.out.println(
                        "Availability updated successfully.");

                return;
            }
        }

        System.out.println("Donor not found.");
    }

    public static boolean isValidBloodGroup(
            String bloodGroup) {

        return bloodGroup.equals("A+")
                || bloodGroup.equals("A-")
                || bloodGroup.equals("B+")
                || bloodGroup.equals("B-")
                || bloodGroup.equals("O+")
                || bloodGroup.equals("O-")
                || bloodGroup.equals("AB+")
                || bloodGroup.equals("AB-");
    }
}