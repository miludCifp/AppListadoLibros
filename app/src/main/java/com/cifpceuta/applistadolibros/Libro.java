package com.cifpceuta.applistadolibros;

public class Libro {
    private String titulo;
    private int paginas;
    private int portada;
    private String descripcion;

    public Libro() {
    }

    public Libro(String titulo, int paginas, int portada, String descripcion) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.portada = portada;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
