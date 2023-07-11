package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.SeatStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {   /* This is a physical seat */
    private String name;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    private int rowIndex;
    private int columnIndex;

    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
