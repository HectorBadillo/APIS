package com.example.formulario.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Registro {

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @NotBlank(message = "El apellido es obligatorio")
    private String lastName;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Correo inválido")
    private String email;

    @NotBlank(message = "El país es obligatorio")
    private String country;

    @NotBlank(message = "La cuenta es obligatoria")
    private String account;

    @NotBlank(message = "El promedio es obligatorio")
    private String avg;
}