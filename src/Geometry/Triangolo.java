/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

/**
 *
 * @author michele.piamarta
 */
public class Triangolo extends Figura{
    protected double base,altezza,lato1,lato2;


    public Triangolo(double base, double lato1, double lato2, String nome, Punto centro) throws Exception {
        super(nome, centro);
        checkLato(base);
        checkLato(lato1);
        checkLato(lato2);
        this.base = base;
        this.lato1 = lato1;
        this.lato2 = lato2;
    }
    
    public Triangolo(double base,double lato1, float angoloCompreso, String nome, Punto centro) throws Exception{
        this(base,lato1,Math.sqrt((base*base)+(lato1*lato1))-2*(base)*(lato1)*Math.cos(angoloCompreso),nome,centro);
        
    }
    
    public Triangolo(double base, double lato1, double lato2, String nome) throws Exception {
        this(base,lato1,lato2,nome,new Punto(0,0));
    }
    
    

    @Override
    public double getArea() {
        double p = (lato1+base+lato2)/2;
        return Math.sqrt(p*(p-lato1)*(p-base)*(p-lato2));
    }

    @Override
    public double getPerimetro() {
        return base+lato1+lato2;
    }
    
}
