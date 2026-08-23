public class EmergencyRequest {

    private String patientName;
    private String requiredBloodGroup;
    private String location;

    public EmergencyRequest(String patientName,
                            String requiredBloodGroup,
                            String location) {

        this.patientName = patientName;
        this.requiredBloodGroup = requiredBloodGroup;
        this.location = location;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getRequiredBloodGroup() {
        return requiredBloodGroup;
    }

    public String getLocation() {
        return location;
    }
}