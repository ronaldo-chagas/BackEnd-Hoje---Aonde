package com.hojeonde.hoje.services;

import com.hojeonde.hoje.models.Local.Local;
import com.hojeonde.hoje.repositories.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository;

    public List<Local> findAll() {
        return localRepository.findAll();
    }

    public Local findById(Long id) {
        return localRepository.findById(id).orElse(null);
    }

    public Local save(Local local) {
        return localRepository.save(local);
    }

    public void delete(Long id) {
        localRepository.deleteById(id);
    }
}
