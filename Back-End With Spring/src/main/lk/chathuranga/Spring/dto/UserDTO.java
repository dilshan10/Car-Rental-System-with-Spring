package main.lk.chathuranga.Spring.dto;

public class UserDTO {
    private String UID;
    private String userName;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String UID, String userName, String password) {
        this.UID = UID;
        this.userName = userName;
        this.password = password;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "UID='" + UID + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
