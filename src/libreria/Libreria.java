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
public class Libreria {
    
     ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    
    Libro l1 = new Libro("Monstruos invisibles", "Chuck Palahniuk", "LB0001", 9.95f, 15);
    Libro l2 = new Libro("Factotum", "Charles Bukowski", "LB0002", 8.9f, 11);
    Libro l3 = new Libro("Azul casi transparente", "Ryu Murakami", "LB0003", 7.9f, 9);
    Libro l4 = new Libro("La torre oscura: el pistolero", "Stephen King", "LB0004", 29.95f, 23);
    
    public void añadirLibreria(){
        listaLibros.add(l1);
        listaLibros.add(l2);
        listaLibros.add(l3);
        listaLibros.add(l4);
    }
    
    public  ArrayList<Libro> devolverLista(){
        return this.listaLibros;
    }
}
