package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.RutinasModel;
import com.example.demo.repositories.RutinasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RutinasService {
    @Autowired
    RutinasRepository rutinasRepository;

    public ArrayList<RutinasModel> obtenerRutinas(){
        return (ArrayList<RutinasModel>) rutinasRepository.findAll();
    }

    public RutinasModel guardarRutinas(RutinasModel rutinas){
        return rutinasRepository.save(rutinas);
    }

    public Optional<RutinasModel> obtenerPorId(Long id){
        return rutinasRepository.findById(id);
    }


    public ArrayList<RutinasModel>  obtenerPorPrioridad(Integer prioridad) {
        return rutinasRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarRutinas(Long id) {
        try{
            rutinasRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }



}