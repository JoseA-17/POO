/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author anton
 */
public class CuentaCorriente extends CuentaPrincipal
{
    private String Edad;
    private String NumeroCuenta;

    public CuentaCorriente(String Edad, String NumeroCuenta, String NombreCuenta, String DNI, String Saldo) {
        super(NombreCuenta, DNI, Saldo);
        this.Edad = Edad;
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }
    
    
}
