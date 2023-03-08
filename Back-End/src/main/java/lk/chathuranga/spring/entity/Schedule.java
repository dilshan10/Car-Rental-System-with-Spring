package lk.chathuranga.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Schedule {
    @Id
    private String SID;
    private String driID;
    private String Date;
    private String Time;

    @ManyToOne
    @JoinColumn(name = "driID")
    private Driver driver;
}
