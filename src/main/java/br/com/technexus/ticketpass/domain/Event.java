package br.com.technexus.ticketpass.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"attendees", "address"})
@Table(name = "events")
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private LocalDateTime startDateTime;

    @Column(nullable = false)
    private LocalDateTime endDateTime;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

//    @ManyToMany(mappedBy = "events")
//    private Set<Customer> attendees = new HashSet<>();

}
