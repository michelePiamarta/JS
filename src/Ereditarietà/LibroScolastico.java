/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ereditarietà;

/**
 *
 * @author michele.piamarta
 */
public class LibroScolastico extends Libro{
    
    public LibroScolastico(double costo, String autore, String titolo, int anno) {
        super(costo, autore, titolo, anno);
        this.costo *= 2;
    }
    
}
