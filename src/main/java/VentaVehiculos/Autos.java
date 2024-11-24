/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaVehiculos;

/**
 *
 * @author anton
 */
public class Autos extends Vehiculos
{
    private String Puertas;
    private String Cilindrada;

    public Autos(String Puertas, String Cilindrada, String Motor, String Color, String Llantas) {
        super(Motor, Color, Llantas);
        this.Puertas = Puertas;
        this.Cilindrada = Cilindrada;
    }

    public String getPuertas() {
        return Puertas;
    }

    public void setPuertas(String Puertas) {
        this.Puertas = Puertas;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }



  
    

}
    

