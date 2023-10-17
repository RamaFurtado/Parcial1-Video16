package com.parcialapirest.Parcial.services;

import com.parcialapirest.Parcial.entities.Autor;
import com.parcialapirest.Parcial.repositories.AutorRepository;
import com.parcialapirest.Parcial.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
