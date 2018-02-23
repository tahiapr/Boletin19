/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author tperezrodriguez
 */
public class Metodos {
    /**
     * amosar os libros que temos ( Os libros deben estar ordenados polo campo titulo ) 
     * dar de baixa os libros con numero de unidades =0 
     * consultar un libro determinado 
     * 
     * Nos métodos
     * vender, amosar, baixas e consultar debes comprobar que o array recibido
     * non é null. No caso contrario lanza una excepción.
     */
    Libreria lib = new Libreria();
    ArrayList<Libro> listaLibros ;
    
    public void engadirLibros (Libro lb){
        listaLibros.add(lb);
    }
    
    public void venderLibros (String isbnL){
        int lVendido;
        boolean encontrado=false;

        for (int i = 0; i < listaLibros.size(); i++) {
             if (listaLibros.get(i).getISBN().equalsIgnoreCase(isbnL)) {
                lVendido=listaLibros.get(i).getNumUnidades();
                listaLibros.get(i).setNumUnidades(lVendido-1);
                encontrado=true;
            }
        }
        if (encontrado==false) {
            System.out.println("El libro que busca no existe");
        }
        }
    
    public void amosarLibros(){
        listaLibros = lib.devolverLista();
        Collections.sort(listaLibros);

        for (Libro aux: listaLibros) {
            JOptionPane.showConfirmDialog(null, aux.toString());
        }
       
    }
    
    }
    
    


