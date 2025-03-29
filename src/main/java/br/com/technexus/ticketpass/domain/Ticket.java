package br.com.technexus.ticketpass.domain;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Double unitPrice;

    // future fields: coupons, discounts, and ticket status (sold, cancelled, etc.)

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "customer_attendee_id")
    private Customer customerAttendee;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

}
