package com.hojeonde.hoje.services;

import com.hojeonde.hoje.models.Evento.Evento;

import com.hojeonde.hoje.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public Evento findById(Long id) {
        if (id == null ) {
            throw new IllegalArgumentException("ID não pode ser nulo ou vazio");
        }

        Optional<Evento> evento = eventoRepository.findById(id);
        if (evento.isEmpty()) {
            throw new IllegalArgumentException("Evento com ID " + id + " não encontrado");
        }

        return evento.get();
    }

    public Evento save(Evento evento) {
        if (evento == null) {
            throw new IllegalArgumentException("Evento não pode ser nulo");
        }

        if (evento.getNome() == null || evento.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do evento não pode ser vazio");
        }

        if (evento.getDataInicio() == null) {
            throw new IllegalArgumentException("A data do evento não pode ser nula");
        }


        if (eventoRepository.existsByNomeAndDataInicio(evento.getNome(), evento.getDataInicio())) {
            throw new IllegalArgumentException("Já existe um evento com o nome '" + evento.getNome() + "' e data '" + evento.getDataInicio() + "'");
        }

        return eventoRepository.save(evento);
    }

    public void delete(Long id) {
        if (id == null ) {
            throw new IllegalArgumentException("ID não pode ser nulo ou vazio");
        }

        if (!eventoRepository.existsById(id)) {
            throw new IllegalArgumentException("Evento com ID " + id + " não encontrado para exclusão");
        }

        eventoRepository.deleteById(id);
    }
}
