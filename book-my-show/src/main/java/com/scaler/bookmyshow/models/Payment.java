package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.PaymentMethod;
import com.scaler.bookmyshow.models.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    private Date timeOfPayment;
    private double amount;
    private String referenceId;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToOne
    private Ticket ticket;
}
