package lk.chathuranga.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriverDTO {
    private String driID;
    private String driName;
    private String driAddress;
    private String DLNumber;
    private String email;
    private String imgPath;
    private String password;
    private String Availability;
}