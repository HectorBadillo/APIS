package com.example.mensajes.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mensajes.models.MensajeModel;
import com.example.mensajes.repositories.MensajeRepository;


@Service
public class MensajeServices {
    @Autowired
    MensajeRepository mensajeRepository;

    public ArrayList<MensajeModel> obtenerMensaje(){
        return (ArrayList<MensajeModel>) mensajeRepository.findAll();
    }

    public MensajeModel guardarMensaje(MensajeModel mensaje){
        return mensajeRepository.save(mensaje);
    }

    public Optional<MensajeModel> obtenerPorId(Long id){
        return mensajeRepository.findById(id);
    }

    public boolean eliminarMensaje(Long id){
        try{
            mensajeRepository.deleteById(id);
            return true;
        }
        catch (Exception err){
            return false;
        }
    }
}
