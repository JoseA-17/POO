/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaVehiculos;

/**
 *
 * @author anton
 */
public class Motos extends Vehiculos
{
    private String Asientos;
    private String Marca;

    public Motos(String Asientos, String Marca, String Motor, String Color, String Llantas) {
        super(Motor, Color, Llantas);
        this.Asientos = Asientos;
        this.Marca = Marca;
    }

    public String getAsientos() {
        return Asientos;
    }

    public void setAsientos(String Asientos) {
        this.Asientos = Asientos;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

   

   

 
    
}
