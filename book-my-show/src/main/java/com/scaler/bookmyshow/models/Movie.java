package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.Feature;
import com.scaler.bookmyshow.models.enums.Genre;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;

    @ManyToMany
    private List<Actor> actors;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> movieFeatures;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Genre> genre;


}
