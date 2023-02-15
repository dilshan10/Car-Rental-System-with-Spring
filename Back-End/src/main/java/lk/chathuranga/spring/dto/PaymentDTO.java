package lk.chathuranga.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PaymentDTO {
    private String PayID;
    private Double Value;
    private String date;
    private String time;
}
