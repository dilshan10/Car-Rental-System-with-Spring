package lk.chathuranga.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CarDetailsDTO {
    private String regNumber;
    private String Brand;
    private String Type;
    private Double freeMileage;
    private Double priceForExtraKm;
    private String color;
    private int numOfPass;
    private String transmissionType;
    private String fuelType;
    private String status;
    private String imgPath;
}
