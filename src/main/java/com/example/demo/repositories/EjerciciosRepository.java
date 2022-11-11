package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.EjerciciosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjerciciosRepository extends CrudRepository<EjerciciosModel, Long> {
    public abstract ArrayList<EjerciciosModel> findByPrioridad(Integer prioridad);

}