package com.carsapi.api.dto;

public record CarDTO(
        String modelo,
        String fabricante,
        String dataFabricacao,
        int anoModelo) {
}
