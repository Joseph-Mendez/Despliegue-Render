package com.example.nombre_microservicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NombreController {

    @GetMapping("/nombre")
    public String getNombre() {
        return "Joseph Mendez";
    }
}
