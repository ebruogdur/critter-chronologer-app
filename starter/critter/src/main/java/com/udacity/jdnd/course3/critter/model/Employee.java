package com.udacity.jdnd.course3.critter.model;

import com.udacity.jdnd.course3.critter.enums.EmployeeSkill;
import lombok.Data;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@Table(name="EMPLOYEE",catalog ="critter")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="EMPLOYEE_ID", nullable = false,unique = true)
    private long id;

    @Nationalized
    @Column(name="EMPLOYEE_NAME", nullable = false, length = 255)
    private String name;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Column(name = "SKILLS", length = 500)
    private List<EmployeeSkill> skills = new ArrayList<>();

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Column(name = "DAYS_AVAILABLE", length = 500)
    private List<DayOfWeek> daysAvailable = new ArrayList<>();

    public Employee() {

    }

    public Employee(long id, String name, List<EmployeeSkill> skills, List<DayOfWeek> daysAvailable) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.daysAvailable = daysAvailable;
    }


}
