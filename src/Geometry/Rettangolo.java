/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

/**
 *
 * @author michele.piamarta
 */
public class Rettangolo extends Figura{
    protected double base,altezza;

    public Rettangolo(double base, double altezza, String nome, Punto centro) {
        super(nome, centro);
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo(double base,float area, String nome, Punto centro) throws Exception {
        this(base,area/base,nome,centro);
    }
    
    

    @Override
    public double getArea() {
        return base*altezza;
    }

    @Override
    public double getPerimetro() {
        return (base*2)+(altezza*2);
    }
    
    public double getDiagonale(){
        return Math.sqrt((base*base)+(altezza*altezza));
    }
}
