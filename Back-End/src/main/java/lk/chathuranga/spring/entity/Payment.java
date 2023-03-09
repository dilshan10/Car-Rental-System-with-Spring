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
public class Payment {
    @Id
    private String PayID;
    private Double Value;
    private String date;
    private String time;
    private String ReID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ReID",insertable = false,updatable = false)
    private Rent rent;

}
