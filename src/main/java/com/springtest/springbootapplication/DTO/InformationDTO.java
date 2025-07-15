package com.springtest.springbootapplication.DTO;

public class InformationDTO {
    private String titulo;

    private String descripcion;

    public InformationDTO(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
