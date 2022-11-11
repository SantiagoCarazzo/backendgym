package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "rutinas")

public class RutinasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private EjerciciosModel Ejercicios[];
    private int peso;
    private int series;
    private int repeticiones;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EjerciciosModel[] getEjercicios() {
        return Ejercicios;
    }

    public void setEjercicios(EjerciciosModel[] ejercicios) {
        Ejercicios = ejercicios;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }



}
