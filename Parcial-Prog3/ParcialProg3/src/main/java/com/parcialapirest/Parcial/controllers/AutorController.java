package com.parcialapirest.Parcial.controllers;

import com.parcialapirest.Parcial.entities.Autor;
import com.parcialapirest.Parcial.entities.Persona;
import com.parcialapirest.Parcial.services.AutorServiceImpl;
import com.parcialapirest.Parcial.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin( origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}
