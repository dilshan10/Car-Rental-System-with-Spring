package lk.chathuranga.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RentDTO {
    String ReID;
    String Date;
    String Time;
    Double LossDamegePayment;
    Double duration;
}