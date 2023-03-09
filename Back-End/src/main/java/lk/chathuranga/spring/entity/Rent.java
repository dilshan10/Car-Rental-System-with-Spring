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

    @ManyToOne
    @JoinColumn(name = "custID",insertable = false,updatable = false)
    private Customer customer;



}
