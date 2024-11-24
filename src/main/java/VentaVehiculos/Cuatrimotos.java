/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaVehiculos;

/**
 *
 * @author anton
 */
public class Cuatrimotos extends Vehiculos 
{
    private String Marca;
    private String Caja;

    public Cuatrimotos(String Marca, String Caja, String Motor, String Color, String Llantas) {
        super(Motor, Color, Llantas);
        this.Marca = Marca;
        this.Caja = Caja;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCaja() {
        return Caja;
    }

    public void setCaja(String Modelo) {
        this.Caja = Caja;
    }

    
    
}
