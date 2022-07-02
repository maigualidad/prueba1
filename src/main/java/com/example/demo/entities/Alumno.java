package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nombre;
    @Column
    private int Edad;

    // Relacion muchos a 1.
    // Si se borra un profe, se borran los alumnos asociados a ese profe.
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name="profesor_id") // Que haga el join en la columna de profesor_id


    private Profesor profesor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
