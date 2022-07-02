package com.example.demo.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String titulo;

    @OneToMany(mappedBy = "profesor", fetch = FetchType.LAZY)

    private Set<Alumno> alumnos = new HashSet<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
