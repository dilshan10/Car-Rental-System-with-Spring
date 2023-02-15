package main.lk.chathuranga.Spring.dto;

public class DriverDTO {
    private String driID;
    private String driName;
    private String driAddress;
    private String DLNumber;
    private boolean Availability;

    public DriverDTO() {
    }

    public DriverDTO(String driID, String driName, String driAddress, String DLNumber, boolean availability) {
        this.driID = driID;
        this.driName = driName;
        this.driAddress = driAddress;
        this.DLNumber = DLNumber;
        Availability = availability;
    }

    public String getDriID() {
        return driID;
    }

    public void setDriID(String driID) {
        this.driID = driID;
    }

    public String getDriName() {
        return driName;
    }

    public void setDriName(String driName) {
        this.driName = driName;
    }

    public String getDriAddress() {
        return driAddress;
    }

    public void setDriAddress(String driAddress) {
        this.driAddress = driAddress;
    }

    public String getDLNumber() {
        return DLNumber;
    }

    public void setDLNumber(String DLNumber) {
        this.DLNumber = DLNumber;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean availability) {
        Availability = availability;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "driID='" + driID + '\'' +
                ", driName='" + driName + '\'' +
                ", driAddress='" + driAddress + '\'' +
                ", DLNumber='" + DLNumber + '\'' +
                ", Availability=" + Availability +
                '}';
    }
}
