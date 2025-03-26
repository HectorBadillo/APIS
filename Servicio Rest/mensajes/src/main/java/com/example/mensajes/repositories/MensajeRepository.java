package com.example.mensajes.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mensajes.models.MensajeModel;

@Repository
public interface MensajeRepository extends CrudRepository<MensajeModel, Long>{
    public abstract ArrayList<MensajeModel> findByAutor(String autor);
}
