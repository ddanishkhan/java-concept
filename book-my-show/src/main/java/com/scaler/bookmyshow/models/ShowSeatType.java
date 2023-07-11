package com.scaler.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
//@Table(name = "show_seattype_mapping")
public class ShowSeatType extends BaseModel {
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private double price;
}
