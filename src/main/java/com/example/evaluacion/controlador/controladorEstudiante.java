package com.example.evaluacion.controlador;

import com.example.evaluacion.Productos.Estudiante;
import com.example.evaluacion.servicio.servicioEstudiantes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class controladorEstudiante {

    servicioEstudiantes servicio = new servicioEstudiantes();

    @GetMapping("/listarEstudiante")
    public ArrayList<Estudiante> listarEstudiante(){
        servicio.promedio();
        return servicio.listar();
    }

    @PostMapping("/agregarEstudiante")
    public String agregar(@RequestBody Estudiante estudiante){
        return servicio.agregarEstudiante(estudiante);
    }

    @RequestMapping("/calcularJuicio")
    public String calcularJuicio(){
        return servicio.promedio();
    }
}
























































    /*
    @DeleteMapping("/eliminarEstudiante")
    public ArrayList<Estudiante> eliminarEstudiante(){
        return servicio.eliminarEstudiante();
    }

    @PostMapping("/modificarEstudiante")
    public String modificarEstudiante(@RequestBody Estudiante estudiante){
        return servicio.ModificarEs(estudiante);
    }
    */
