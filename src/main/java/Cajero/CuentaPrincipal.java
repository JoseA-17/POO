/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author anton
 */
public class CuentaPrincipal 
{
   private String NombreCuenta;
    private String DNI;
    private String Saldo;

    public CuentaPrincipal(String NombreCuenta, String DNI, String Saldo) {
        this.NombreCuenta = NombreCuenta;
        this.DNI = DNI;
        this.Saldo = Saldo;
    }

    public String getNombreCuenta() {
        return NombreCuenta;
    }

    public void setNombreCuenta(String NombreCuenta) {
        this.NombreCuenta = NombreCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    
}
