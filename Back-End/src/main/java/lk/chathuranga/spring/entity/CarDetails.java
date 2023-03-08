package lk.chathuranga.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class CarDetails {
    @Id
    private String regNumber;
    private String Brand;
    private String Type;
    private BigDecimal freeMileage;
    private BigDecimal priceForExtraKm;
    private String color;
    private int numOfPass;
    private String transmissionType;
    private String fuelType;
    private String status;
    private String imgPath;

    @OneToMany(mappedBy = "carDetails")
    private List<RentDetails> rentDetail = new ArrayList<>();
}
