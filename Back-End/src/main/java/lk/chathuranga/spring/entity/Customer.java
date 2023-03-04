package lk.chathuranga.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String custID;
    private String name;
    private String address;
    private String DOB;
    private String tellNum;
    private String emailAddress;
    private String imgPath;
    private String password;
}
