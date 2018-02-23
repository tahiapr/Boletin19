package boletin19;

import javax.swing.JOptionPane;
import libreria.*;

public class Boletin19 {

    public static void main(String[] args) {
        
        Metodos m = new Metodos();
        Libreria l = new Libreria();
        l.añadirLibreria();
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué é o que desexa facer? \n"
                + "1) Engadir libros \n"
                + "2) Vender libros \n"
                + "3) Amosar alfabéticamente os libros que temos\n"
                + "4) Dar de baixa libros\n"
                + "5) Consultar un libro determinado"));

        while (op != 0) {
            switch (op) {
                case 1:
                    m.engadirLibros(new Libro ( JOptionPane.showInputDialog("Título: "), JOptionPane.showInputDialog("Autor: "), JOptionPane.showInputDialog("ISBN: "), Float.parseFloat(JOptionPane.showInputDialog("Precio: ")), Integer.parseInt(JOptionPane.showInputDialog("Unidades: "))));
                    break;
                case 2:
                    m.venderLibros(JOptionPane.showInputDialog("Inserte el ISBN del libro que quiera borrar"));
                    break;
                case 3:
                    m.amosarLibros();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
            op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué é o que desexa facer? \n"
                    + "1) Engadir libros \n"
                    + "2) Vender libros \n"
                    + "3) Amosar alfabéticamente os libros que temos\n"
                    + "4) Dar de baixa libros\n"
                    + "5) Consultar un libro determinado"));
        }
        //crear el array
    }

}
