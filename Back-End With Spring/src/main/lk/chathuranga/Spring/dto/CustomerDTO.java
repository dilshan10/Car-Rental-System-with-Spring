package main.lk.chathuranga.Spring.dto;

public class CustomerDTO {
    private String custID;
    private String name;
    private String address;
    private String tellNum;
    private String emailAddress;

    public CustomerDTO() {
    }

    public CustomerDTO(String custID, String name, String address, String tellNum, String emailAddress) {
        this.custID = custID;
        this.name = name;
        this.address = address;
        this.tellNum = tellNum;
        this.emailAddress = emailAddress;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTellNum() {
        return tellNum;
    }

    public void setTellNum(String tellNum) {
        this.tellNum = tellNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "custID='" + custID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tellNum='" + tellNum + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

