package lk.chathuranga.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Driver {
    @Id
    private String driID;
    private String driName;
    private String driAddress;
    private String DLNumber;
    private String email;
    private String imgPath;
    private String password;
    private String Availability;

    @OneToMany(mappedBy = "drivers")
    private List<Schedule> schedules = new ArrayList<>();
}
