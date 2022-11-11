package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.RutinasModel;
import com.example.demo.services.RutinasService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rutinas")
public class RutinasController {
    @Autowired
    RutinasService RutinasService;

    @GetMapping()
    public ArrayList<RutinasModel> obtenerRutinas(){
        return RutinasService.obtenerRutinas();
    }

    @PostMapping()
    public RutinasModel guardarRutinas(@RequestBody RutinasModel rutinas){
        return this.RutinasService.guardarRutinas(rutinas);
    }

    @GetMapping( path = "/{id}")
    public Optional<RutinasModel> obtenerRutinasPorId(@PathVariable("id") Long id) {
        return this.RutinasService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<RutinasModel> obtenerRutinasPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.RutinasService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.RutinasService.eliminarRutinas(id);
        if (ok){
            return "Se eliminó la rutina con id " + id;
        }else{
            return "No pudo eliminar la rutina con id" + id;
        }
    }

}