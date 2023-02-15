package lk.chathuranga.spring.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Deprecated
@ToString
public class CarDetailsDTO {
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
