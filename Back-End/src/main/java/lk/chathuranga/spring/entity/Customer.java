package lk.chathuranga.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "customer")
    private List<Rent> rent = new ArrayList<>();


}
