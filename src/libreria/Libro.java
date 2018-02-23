/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.ArrayList;

/**
 *
 * @author tperezrodriguez
 */
public class Libro implements Comparable <Libro> {

    private String titulo;
    private String autor;
    private String ISBN;
    private double prezo;
    private int numUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, double prezo, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "|| Autor: " + autor + "|| ISBN: " + ISBN + "|| Prezo: " + prezo + "|| Número unidades: " + numUnidades;
    }

    @Override
    public int compareTo(Libro o) {

        int resultado = 0;

        if (this.titulo.compareToIgnoreCase(o.titulo) > 0) {
            resultado = 1;
        } else if (this.titulo.compareToIgnoreCase(o.titulo) == 0) {
            resultado = 0;
        } else {
            resultado = -1;
        }
        return resultado;
    }

}
