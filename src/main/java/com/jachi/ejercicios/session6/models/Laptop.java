package com.jachi.ejercicios.session6.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fabricante;
    private String modelo;
    private Integer capacidadRam;
    private Double precio;

    public Laptop() {
    }

    public Laptop(Long id, String fabricante, String modelo, Integer capacidadRam, Double precio) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidadRam = capacidadRam;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidadRam() {
        return capacidadRam;
    }

    public void setCapacidadRam(Integer capacidadRam) {
        this.capacidadRam = capacidadRam;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadRam=" + capacidadRam +
                ", precio=" + precio +
                '}';
    }
}
