package lk.chathuranga.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ScheduleDTO {
    private String SID;
    private String Date;
    private String Time;
}
