package lk.chathuranga.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RentDetailstDTO {
    private String ReID;
    private String regNumber;
    private String SID;
}
