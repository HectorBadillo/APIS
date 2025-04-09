package com.example.formulario.service;

import com.example.formulario.model.Registro;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders; // ✅ CORRECTO: desde Spring
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class RegistroService {

    public String enviarRegistro(Registro registro) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://masksoft.com.mx/register";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("name", registro.getName());
        map.add("email", registro.getEmail());
        map.add("account", registro.getAccount());
        map.add("lastName", registro.getLastName());
        map.add("avg", String.valueOf(registro.getAvg()));
        map.add("country", registro.getCountry());

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

        return response.getBody();
    }
}
