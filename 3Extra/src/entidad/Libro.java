/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author ale
 */
public class Libro {
    private String titulo;
    private String autor;
    private int nejemplares;
    private int nprestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nejemplares, int nprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nejemplares = nejemplares;
        this.nprestados = nprestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNejemplares() {
        return nejemplares;
    }

    public void setNejemplares(int nejemplares) {
        this.nejemplares = nejemplares;
    }

    public int getNprestados() {
        return nprestados;
    }

    public void setNprestados(int nprestados) {
        this.nprestados = nprestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", nejemplares=" + nejemplares + ", nprestados=" + nprestados + '}';
    }
    
    
    
}
