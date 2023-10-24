/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometry;

/**
 *
 * @author michele.piamarta
 */
public abstract class Figura {
    protected String nome; //identificatore univoco
    protected Punto centro;
    public Figura(String nome,Punto centro){
        this.nome = nome;
        this.centro = centro;
    }
    abstract double getArea();
    abstract double getPerimetro();
    public Punto getCentro(){
        return centro;
    }
    public String getNome(){
        return nome;
    }
    
    protected void checkLato(double lato) throws Exception{
        if(lato<=0)
            throw new Exception("la lunghezza del lato non può essere minore o uguale a 0");
    }
}
