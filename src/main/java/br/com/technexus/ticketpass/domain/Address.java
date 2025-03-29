package br.com.technexus.ticketpass.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString(exclude = {"additionalInfo"})
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
@Entity(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String street;

    private String city;

    private String state;

    private String zipCode;

    private String country;

    private String additionalInfo;

}
