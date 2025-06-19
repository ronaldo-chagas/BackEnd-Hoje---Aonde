package com.hojeonde.hoje.controllers;

import com.hojeonde.hoje.models.Ingresso.Ingresso;
import com.hojeonde.hoje.services.IngressoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingressos")
public class IngressoController {
    @Autowired
    private IngressoService ingressoService;

    @GetMapping
    public List<Ingresso> getAllIngressos() {
        return ingressoService.findAll();
    }

    @GetMapping("/{id}")
    public Ingresso getIngressoById(@PathVariable String id) {
        return ingressoService.findById(id);
    }

    @PostMapping
    public Ingresso createIngresso(@RequestBody Ingresso ingresso) {
        return ingressoService.save(ingresso);
    }

    @DeleteMapping("/{id}")
    public void deleteIngresso(@PathVariable String id) {
        ingressoService.delete(id);
    }
}

