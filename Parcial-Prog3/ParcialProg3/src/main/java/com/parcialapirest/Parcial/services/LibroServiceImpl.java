package com.parcialapirest.Parcial.services;

import com.parcialapirest.Parcial.entities.Libro;
import com.parcialapirest.Parcial.repositories.BaseRepository;
import com.parcialapirest.Parcial.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
   @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro,Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
