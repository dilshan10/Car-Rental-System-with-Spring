package lk.chathuranga.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Rent {
    @Id
    private String ReID;
    private String custID;
    private String Date;
    private String Time;
    private String LossDamegePayment;
    private BigDecimal duration;
    private String PayID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PayID")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "custID")
    private Customer customer;
}
