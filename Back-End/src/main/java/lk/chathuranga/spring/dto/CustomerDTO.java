package lk.chathuranga.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String custID;
    private String name;
    private String address;
    private String DOB;
    private String tellNum;
    private String emailAddress;
    private String imgPath;
    private String userID;
}

