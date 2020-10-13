package com.udacity.jdnd.course3.critter.model;


import com.udacity.jdnd.course3.critter.enums.EmployeeSkill;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
//@Table(name="SCHEDULE",catalog ="critter")
public class Schedule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SCHEDULE_ID", nullable = false,unique = true)
    private long id;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    @Column(name = "ACTIVITIES", length = 500)
    private Set<EmployeeSkill> activities = new HashSet<>();

    @Column(name="SCHEDULE_DATE")
    private LocalDate date;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "pet_id") )
    private List<Pet> pets = new ArrayList<>();

    public Schedule() {

    }

    public Schedule(long id, Set<EmployeeSkill> activities, LocalDate date, List<Employee> employees, List<Pet> pets) {
        this.id = id;
        this.activities = activities;
        this.date = date;
        this.employees = employees;
        this.pets = pets;
    }


}