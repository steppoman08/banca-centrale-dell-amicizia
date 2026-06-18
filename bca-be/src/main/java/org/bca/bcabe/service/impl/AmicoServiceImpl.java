package org.bca.bcabe.service.impl;

import org.bca.bcabe.entity.Amico;
import org.bca.bcabe.repository.AmicoRepository;
import org.bca.bcabe.service.AmicoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmicoServiceImpl implements AmicoService {

    private final AmicoRepository repository;

    public AmicoServiceImpl(AmicoRepository repository) {
        this.repository = repository;
        System.out.println("Istanzio AmicoServiceImpl");
    }

    @Override
    public List<Amico> findAll() {
        return repository.findAll();
    }
}