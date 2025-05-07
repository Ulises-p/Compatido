/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dato;

/**
 *
 * @author User
 */
public class CuentaCorriente {
   public  String nombre = "anonimo";
   protected String dni = "anonimo";
   private double saldo = 0;
   private double descubierto = 50;
   String nomBanco = "renfe";

   
    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public CuentaCorriente(String dni, double saldo, double descubierto) {
        this.dni = dni; 
        this.saldo = saldo;
        this.descubierto = descubierto;
    }
    
    public CuentaCorriente (double saldo){
        this.saldo = saldo;
        this.descubierto = 0;
    }
    
    public boolean sacarDinero(double retiro){
        if (retiro <= descubierto){
            saldo -= retiro;
               return true;
        }
        return false;    
    }
    
    public boolean ingresarDinero(double ingreso){
        if (ingreso <= descubierto){
            saldo += ingreso;
               return true;
        }
        return false;    
    }
    
    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }
    
    
    
    
    @Override
    public String toString() {
        return "CuentaCorriente{\n" + "nombre = " + nombre + ",\ndni = " + dni + ",\nsaldo = " + saldo + ",\ndescubierto = " + descubierto + '}';
    }
}



