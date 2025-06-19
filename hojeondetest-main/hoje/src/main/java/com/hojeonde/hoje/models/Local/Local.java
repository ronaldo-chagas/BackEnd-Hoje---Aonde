package com.hojeonde.hoje.models.Local;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.hojeonde.hoje.models.Evento.Evento;


@Entity
@Table(name = "locais")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String capacidade;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evento> eventos;
}
