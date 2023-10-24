/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

/**
 *
 * @author michele.piamarta
 */
public class Cerchio extends Figura{
    protected Double raggio;

    public Cerchio(Double raggio, String nome, Punto centro) throws Exception {
        super(nome, centro);
        checkLato(raggio);
        this.raggio = raggio;
    }
    
    @Override
    public double getArea(){
        return raggio*raggio*Math.PI;
    }
    
    @Override
    public double getPerimetro(){
        return raggio*2*Math.PI;
    }

    
    
    
}
