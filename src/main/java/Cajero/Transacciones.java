/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author anton
 */
public class Transacciones extends CuentaPrincipal
{
    private String Pin;
    private String NumeroCuenta;

    public Transacciones(String Pin, String NumeroCuenta, String NombreCuenta, String DNI, String Saldo) {
        super(NombreCuenta, DNI, Saldo);
        this.Pin = Pin;
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }
    
    
}
