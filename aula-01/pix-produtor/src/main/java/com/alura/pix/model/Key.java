package com.alura.pix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Key {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_KEY")
    @SequenceGenerator( name = "SQ_KEY", sequenceName = "SQ_KEY")
    @Column(name = "ID_KEY")
    private Long id;
    private String chave;
}
