package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.Feature;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

// 1:M
// 1:1

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel {
    private String name;

    @OneToMany
    private List<Seat> seats;

//    @ManyToMany
    @Enumerated(EnumType.STRING) //stores the enum as a string. TODO: change such that automatically uses ordinal for storing, string while retrieving.
    @ElementCollection  //Doesnt consider the enum as a table in db. only uses Java ENUM for storing etc. TODO: change to use database enum mapping table.
    private List<Feature> auditoriumFeatures;
}
