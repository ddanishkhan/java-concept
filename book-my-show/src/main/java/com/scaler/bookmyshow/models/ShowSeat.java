package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.ShowSeatState;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
//@Table(name = "show_seat_mapping")
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.STRING)
    private ShowSeatState state;
}