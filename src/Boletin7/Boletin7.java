/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin7;

import dato.CuentaCorriente;

/**
 *
 * @author User
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente miCuenta = new CuentaCorriente(200);
        System.out.println("-------------------------------------------------------------------------");
        
//        if(miCuenta.ingresarDinero(20)){
//            System.out.println("Se puedo ingresar el dinero");
//        } else {
//            System.out.println("No se puedo ingresar el dinero");
//        }
//        
//        System.out.println("-------------------------------------------------------------------------");
//        
//        if(miCuenta.sacarDinero(20)){
//            System.out.println("Se puedo sacar el dinero");
//        } else {
//            System.out.println("No se puedo sacar el dinero");
//        }
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(miCuenta.toString());
        
        
    }
}
