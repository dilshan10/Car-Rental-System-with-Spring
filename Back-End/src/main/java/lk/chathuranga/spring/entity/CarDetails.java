package lk.chathuranga.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class CarDetails {
    @Id
    String regNumber;
    String Brand;
    String Type;
    Double freeMileage;
    Double priceForExtraKm;
    String color;
    int numOfPass;
    String transmissionType;
    String fuelType;
    String status;
    String imgPath;
}
