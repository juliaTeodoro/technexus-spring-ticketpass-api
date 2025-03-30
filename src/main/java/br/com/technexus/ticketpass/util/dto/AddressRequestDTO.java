package br.com.technexus.ticketpass.util.dto;

public record AddressRequestDTO(
        String number,
        String street,
        String city,
        String state,
        String zipCode,
        String country,
        String additionalInfo) {
}
