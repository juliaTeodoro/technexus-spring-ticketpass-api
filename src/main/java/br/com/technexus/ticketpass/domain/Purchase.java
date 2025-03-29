package br.com.technexus.ticketpass.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "purchases")
@Entity()
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalValue;

    private LocalDateTime purchaseDate;

    private Integer quantity;

    private String paymentMethod;

    private String status;

    @ManyToOne()
    private Customer buyerCustomer;

    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
    private Set<Ticket> tickets = new HashSet<>();

}
