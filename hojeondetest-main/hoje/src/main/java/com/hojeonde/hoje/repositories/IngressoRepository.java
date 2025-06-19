package com.hojeonde.hoje.repositories;

import com.hojeonde.hoje.models.Ingresso.Ingresso;


import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository<Ingresso, Long> {
}
