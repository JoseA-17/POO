/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author anton
 */
import java.util.ArrayList;
  import java.util.List;
public class Herencia  
{

    public static void main(String[] args)
    {
        Animal p = new Perro("Color Negro", "SI","si","SI",4);
        ///p.Sonido();
        
        Animal g=new Gato("Color Gris","SI","SI","SI",4);
        //g.Sonido();
        
        Animal q = new Queco("Blanco","SI","SI","SI",4);
        /////////q.Sonido();
        
        //System.out.println("\n");
        List<Animal> lista = new ArrayList<Animal>();
        lista.add(p);
        lista.add(g);
        lista.add(new Queco("BLANCO","SI","SI","SI",4));
     
        
        for (Animal item : lista)
        {
           item.Sonido();
        }
    }
}
