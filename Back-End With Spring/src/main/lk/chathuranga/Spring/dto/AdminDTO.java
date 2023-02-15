package main.lk.chathuranga.Spring.dto;


public class AdminDTO {
    private String ADID;
    private String UserName;
    private String Password;

    public AdminDTO() {
    }

    public AdminDTO(String ADID, String userName, String password) {
        this.ADID = ADID;
        UserName = userName;
        Password = password;
    }

    public String getADID() {
        return ADID;
    }

    public void setADID(String ADID) {
        this.ADID = ADID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "ADID='" + ADID + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
