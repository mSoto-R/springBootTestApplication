package com.springtest.springbootapplication.Model;

public class InfoModel {
    private String titulo, subtitulo, descripcion;

    public InfoModel(String titulo, String subtitulo, String descripcion) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() { 
        return subtitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
