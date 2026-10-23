import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
