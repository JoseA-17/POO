/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author anton
 */
public class Herencia  
{

    public static void main(String[] args)
    {
        Animal p = new Perro("Color Negro", "SI","si","SI",4);
        p.Sonido();
        
        Animal g=new Gato("Color Gris","SI","SI","SI",4);
        g.Sonido();
        
        Animal q = new Queco("Blanco","SI","SI","SI",4);
        q.Sonido();
    }
}
