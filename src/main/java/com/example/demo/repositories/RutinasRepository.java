package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.RutinasModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RutinasRepository extends CrudRepository<RutinasModel, Long> {
    public abstract ArrayList<RutinasModel> findByPrioridad(Integer prioridad);

}