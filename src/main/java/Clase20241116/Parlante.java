/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author anton
 */
public class Parlante extends Producto
{
    private String Sonido;
    private String Rendimiento;

    public Parlante(String Sonido, String Rendimiento, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Sonido = Sonido;
        this.Rendimiento = Rendimiento;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }

    public String getRendimiento() {
        return Rendimiento;
    }

    public void setRendimiento(String Rendimiento) {
        this.Rendimiento = Rendimiento;
    }

    
    
}