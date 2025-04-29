package com.seccion4.respo4.repository;

@repository

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.seccion4.respo4.model.Persona;

public class PersonaRepository {
    private List<Persona> persona = new ArrayList<>();

    public Persona create(Persona p){
        persona.add(p);
        return p;

    }

}
