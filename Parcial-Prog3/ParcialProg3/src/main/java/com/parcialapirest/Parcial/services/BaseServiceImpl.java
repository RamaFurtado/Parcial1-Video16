package com.parcialapirest.Parcial.services;

import com.parcialapirest.Parcial.entities.Base;
import com.parcialapirest.Parcial.repositories.BaseRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public List<E> findAll() throws Exception {
        return baseRepository.findAll();
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception {
        return baseRepository.findAll(pageable);
    }


    @Override
    public E findById(ID id) throws Exception {
        Optional<E> optionalEntity = baseRepository.findById(id);
        return optionalEntity.get();
    }

    @Override
    public E save(E entity) throws Exception {
        return baseRepository.save(entity);
    }
    @Override
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Override
    public boolean delete(ID id) throws Exception {
        Optional<E> optionalEntity = baseRepository.findById(id);
        if (optionalEntity.isPresent()) {
            baseRepository.delete(optionalEntity.get());
            return true; // Indica que la entidad fue eliminada con éxito
        } else {
            throw new EntityNotFoundException("No se encontró la entidad con ID: " + id);
        }
    }
}
