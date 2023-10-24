/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

/**
 *
 * @author michele.piamarta
 */
public class TriangoloRettangolo extends Triangolo{

    public TriangoloRettangolo(double base, double altezza, String nome, Punto centro) throws Exception {
        super(base, altezza, Math.sqrt((base*base)+(altezza*altezza)), nome, centro);
    }
    
    public double getIpotenusa(){
        return Math.sqrt((base*base)+(altezza*altezza));
    }
}
