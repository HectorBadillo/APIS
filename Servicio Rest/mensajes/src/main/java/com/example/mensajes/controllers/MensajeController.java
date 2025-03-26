package com.example.mensajes.controllers;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mensajes.models.MensajeModel;
import com.example.mensajes.services.MensajeServices;


@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    @Autowired
    MensajeServices mensajeServices;

    @GetMapping()
    public ArrayList<MensajeModel> obtenerMensajes(){
        return mensajeServices.obtenerMensaje();
    }

    @PostMapping()
    public MensajeModel guardarMensaje(@RequestBody MensajeModel mensaje){
        return this.mensajeServices.guardarMensaje(mensaje);
    }

    @GetMapping(path="/{id}")
    public Optional<MensajeModel> obtenerMensajePorID(@PathVariable("id") Long id){
        return this.mensajeServices.obtenerPorId(id);
    }

    @DeleteMapping(path="/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.mensajeServices.eliminarMensaje(id);
        if(ok){
            return "Se elimino el mensaje con ID: " + id;
        }
        else{
            return "No se pudo eliminar mensaje con ID: " + id;
        }
    }
    
    
}
