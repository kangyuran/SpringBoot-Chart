package com.example.springbootchart.dto;

import lombok.*;

@Getter @NoArgsConstructor @ToString
public class ChartResponseDTO {
    private String targetYm;
    private Long price;

    public ChartResponseDTO(String targetYm, Long price) {
        this.targetYm = targetYm;
        this.price = price;
    }
}
