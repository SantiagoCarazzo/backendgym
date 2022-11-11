package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EjerciciosModel;
import com.example.demo.services.EjerciciosService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ejercicios")
public class EjerciciosController {
    @Autowired
    EjerciciosService EjerciciosService;

    @GetMapping()
    public ArrayList<EjerciciosModel> obtenerEjercicios(){
        return EjerciciosService.obtenerEjercicios();
    }

    @PostMapping()
    public EjerciciosModel guardarEjercicios(@RequestBody EjerciciosModel ejercicios){
        return this.EjerciciosService.guardarEjercicios(ejercicios);
    }

    @GetMapping( path = "/{id}")
    public Optional<EjerciciosModel> obtenerEjerciciosPorId(@PathVariable("id") Long id) {
        return this.EjerciciosService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<EjerciciosModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.EjerciciosService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.EjerciciosService.eliminarEjercicios(id);
        if (ok){
            return "Se eliminó el ejercicio con id " + id;
        }else{
            return "No pudo eliminar el ejercicio con id" + id;
        }
    }

}