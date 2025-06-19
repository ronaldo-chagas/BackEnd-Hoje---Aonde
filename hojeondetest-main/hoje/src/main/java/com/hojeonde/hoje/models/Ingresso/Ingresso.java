package com.hojeonde.hoje.models.Ingresso;


import com.hojeonde.hoje.models.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String codigo;
  private String tipo;
  private Double preco;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
}
