package lk.chathuranga.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CarDetails {
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
}
