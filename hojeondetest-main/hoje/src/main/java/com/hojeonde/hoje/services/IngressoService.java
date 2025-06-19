package com.hojeonde.hoje.services;

import com.hojeonde.hoje.models.Ingresso.Ingresso;
import com.hojeonde.hoje.repositories.IngressoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngressoService {

    @Autowired
    private IngressoRepository ingressoRepository;

    public List<Ingresso> findAll() {
        return ingressoRepository.findAll();
    }

    public Ingresso findById(String id) {
        return ingressoRepository.findById(Long.parseLong(id)).orElse(null);
    }

    public Ingresso save(Ingresso ingresso) {
        return ingressoRepository.save(ingresso);
    }

    public void delete(String id) {
        ingressoRepository.deleteById(Long.parseLong(id));
    }
}
