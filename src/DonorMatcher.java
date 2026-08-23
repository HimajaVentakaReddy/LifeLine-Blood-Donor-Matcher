import java.util.ArrayList;
import java.util.List;

public class DonorMatcher {

    public static List<Donor> findCompatibleDonors(
            List<Donor> donors,
            EmergencyRequest request) {

        List<Donor> matches = new ArrayList<>();

        for (Donor donor : donors) {

            if (donor.isAvailable()
                    && isCompatible(
                            donor.getBloodGroup(),
                            request.getRequiredBloodGroup())) {

                matches.add(donor);
            }
        }

        matches.sort((d1, d2) -> {

            boolean location1 =
                    d1.getLocation()
                            .equalsIgnoreCase(request.getLocation());

            boolean location2 =
                    d2.getLocation()
                            .equalsIgnoreCase(request.getLocation());

            if (location1 && !location2) {
                return -1;
            }

            if (!location1 && location2) {
                return 1;
            }

            boolean exact1 =
                    d1.getBloodGroup()
                            .equalsIgnoreCase(
                                    request.getRequiredBloodGroup());

            boolean exact2 =
                    d2.getBloodGroup()
                            .equalsIgnoreCase(
                                    request.getRequiredBloodGroup());

            if (exact1 && !exact2) {
                return -1;
            }

            if (!exact1 && exact2) {
                return 1;
            }

            return 0;
        });

        return matches;
    }

    public static boolean isCompatible(
            String donorBlood,
            String requiredBlood) {

        donorBlood = donorBlood.toUpperCase();
        requiredBlood = requiredBlood.toUpperCase();

        switch (requiredBlood) {

            case "O-":
                return donorBlood.equals("O-");

            case "O+":
                return donorBlood.equals("O-")
                        || donorBlood.equals("O+");

            case "A-":
                return donorBlood.equals("O-")
                        || donorBlood.equals("A-");

            case "A+":
                return donorBlood.equals("O-")
                        || donorBlood.equals("O+")
                        || donorBlood.equals("A-")
                        || donorBlood.equals("A+");

            case "B-":
                return donorBlood.equals("O-")
                        || donorBlood.equals("B-");

            case "B+":
                return donorBlood.equals("O-")
                        || donorBlood.equals("O+")
                        || donorBlood.equals("B-")
                        || donorBlood.equals("B+");

            case "AB-":
                return donorBlood.equals("O-")
                        || donorBlood.equals("A-")
                        || donorBlood.equals("B-")
                        || donorBlood.equals("AB-");

            case "AB+":
                return true;

            default:
                return false;
        }
    }
}