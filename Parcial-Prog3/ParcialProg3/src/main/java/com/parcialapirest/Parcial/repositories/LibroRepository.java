package com.parcialapirest.Parcial.repositories;

import com.parcialapirest.Parcial.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
