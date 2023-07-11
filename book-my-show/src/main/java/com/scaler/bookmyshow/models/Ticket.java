package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.TicketStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private User bookedBy;

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<ShowSeat> showSeats;
    private double totalAmount;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

    private Date timeOfBooking;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;
}
