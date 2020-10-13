package com.udacity.jdnd.course3.critter.model;


import lombok.Data;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
//@Table(name="CUSTOMER",catalog ="critter")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID", nullable = false, unique = true)
    private long id;

    @Nationalized
    @Column(name = "CUSTOMER_NAME", nullable = false, length = 255)
    private String name;

    @Column(name = "PHONE_NUMBER", length = 255)
    private String phoneNumber;

    @Column(name = "NOTES", length = 512)
    private String notes;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "owner",cascade = CascadeType.ALL)
    private List<Pet> pets = new ArrayList<>();

    public Customer() {

    }

    public Customer(long id, String name, String phoneNumber, String notes, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.notes = notes;
        this.pets = pets;
    }
}

