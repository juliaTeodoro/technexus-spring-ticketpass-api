package br.com.technexus.ticketpass.util.dto;

public record EventRequestDTO(
        String name,
        String description,
        Double price,
        String startDateTime,
        String endDateTime,
        AddressRequestDTO address) {
}
