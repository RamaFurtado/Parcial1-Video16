package com.parcialapirest.Parcial.controllers;

import com.parcialapirest.Parcial.entities.Libro;
import com.parcialapirest.Parcial.entities.Localidad;
import com.parcialapirest.Parcial.services.LibroServiceImpl;
import com.parcialapirest.Parcial.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
