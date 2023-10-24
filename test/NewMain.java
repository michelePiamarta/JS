
import Geometry.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author michele.piamarta
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Quadrato q;
        q = new Quadrato(1, "quadrato", new Punto(10,10));
        System.out.println(q.getDiagonale());
        Figura fig = new Cerchio(9d, "pippo", new Punto(100,5));
        
    }
    
}
