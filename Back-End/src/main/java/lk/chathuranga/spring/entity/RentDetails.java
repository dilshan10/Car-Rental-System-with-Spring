package lk.chathuranga.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class RentDetails {
    @Id
    private String ReID;
    private String regNumber;
    private String SID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ReID")
    private Rent rent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SID")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "regNumber")
    private CarDetails carDetails;

}
