package com.springtest.springbootapplication.DTO;

public class InformacionDTO {
    private String titulo;

    private String descripcion;

    public InformacionDTO(String titulo, String descripcion) {
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
