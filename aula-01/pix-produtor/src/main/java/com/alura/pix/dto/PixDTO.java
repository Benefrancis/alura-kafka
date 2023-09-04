package com.alura.pix.dto;

import com.alura.pix.model.Pix;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PixDTO {
    private String identifier;
    private String chaveOrigem;
    private String chaveDestino;
    private Double valor;
    private LocalDateTime dataTransferencia;
    private PixStatus status;

    public PixDTO() {
    }

    public  PixDTO(String identifier, String chaveOrigem, String chaveDestino, Double valor, LocalDateTime dataTransferencia, PixStatus status) {
        this.identifier = identifier;
        this.chaveOrigem = chaveOrigem;
        this.chaveDestino = chaveDestino;
        this.valor = valor;
        this.dataTransferencia = dataTransferencia;
        this.status = status;
    }

    public static PixDTO toDTO(Pix p) {
        return new PixDTO( p.getIdentifier(), p.getChaveOrigem(), p.getChaveDestino(), p.getValor(), p.getDataTransferencia(), p.getStatus() );
    }
}
