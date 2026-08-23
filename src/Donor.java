public class Donor {

    private String name;
    private String bloodGroup;
    private String location;
    private String phoneNumber;
    private boolean available;

    public Donor(String name, String bloodGroup, String location,
                 String phoneNumber, boolean available) {

        this.name = name;
        this.bloodGroup = bloodGroup;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {

        return "Name: " + name
                + " | Blood Group: " + bloodGroup
                + " | Location: " + location
                + " | Phone: " + phoneNumber
                + " | Available: " + (available ? "Yes" : "No");
    }
}