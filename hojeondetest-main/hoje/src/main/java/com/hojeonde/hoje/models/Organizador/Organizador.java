package com.hojeonde.hoje.models.Organizador;

import com.hojeonde.hoje.models.Evento.Evento;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "organizadores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "organizador")
    private List<Evento> eventos;
}
