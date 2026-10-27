import java.util.Scanner;

public class DonorAvailabilityScheduler {
    private String donorName;
    private String availableDay;
    private String availableTime;

    public DonorAvailabilityScheduler(String donorName, String availableDay,
                                      String availableTime) {
        this.donorName = donorName;
        this.availableDay = availableDay;
        this.availableTime = availableTime;
    }

    public void displayAvailability() {
        System.out.println("\n--- Donor Availability ---");
        System.out.println("Donor: " + donorName);
        System.out.println("Preferred day: " + availableDay);
        System.out.println("Preferred time: " + availableTime);
        System.out.println("Status: Preference recorded, not a confirmed booking.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter donor name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter preferred day: ");
        String day = sc.nextLine().trim();

        System.out.print("Enter preferred time: ");
        String time = sc.nextLine().trim();

        if (name.isEmpty() || day.isEmpty() || time.isEmpty()) {
            System.out.println("All fields are required.");
            sc.close();
            return;
        }

        new DonorAvailabilityScheduler(name, day, time).displayAvailability();
        sc.close();
    }
}
