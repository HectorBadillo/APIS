package com.example.formulario.controller;

import com.example.formulario.model.Registro;
import com.example.formulario.service.RegistroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormularioController {

    @Autowired
    private RegistroService registroService;

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("registro", new Registro());
        return "formulario";
    }

    @PostMapping("/registrar")
    public String registrar(@Valid Registro registro, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formulario";
        }
        String respuesta = registroService.enviarRegistro(registro);
        model.addAttribute("mensaje", "Respuesta del servidor: " + respuesta);
        return "formulario";
    }
}