package com.scaler.bookmyshowfeb23.models;

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

    @ManyToMany
    private List<Feature> auditoriumFeatures;
}
