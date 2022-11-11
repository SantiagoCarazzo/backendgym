package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.EjerciciosModel;
import com.example.demo.repositories.EjerciciosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EjerciciosService {
    @Autowired
    EjerciciosRepository ejerciciosRepository;

    public ArrayList<EjerciciosModel> obtenerEjercicios(){
        return (ArrayList<EjerciciosModel>) ejerciciosRepository.findAll();
    }

    public EjerciciosModel guardarEjercicios(EjerciciosModel ejercicios){
        return ejerciciosRepository.save(ejercicios);
    }

    public Optional<EjerciciosModel> obtenerPorId(Long id){
        return ejerciciosRepository.findById(id);
    }


    public ArrayList<EjerciciosModel>  obtenerPorPrioridad(Integer prioridad) {
        return ejerciciosRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarEjercicios(Long id) {
        try{
            ejerciciosRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    



}