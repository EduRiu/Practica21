/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ejercicio17 {
    
    /*
    Una obra social tiene tres clases de socios:

Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos odontológicos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
    */
    
    public static void main(String[] args) {
        
        System.out.println("ingrese el tipo de socio a verificar");
        Scanner scan = new Scanner(System.in);
        String socio = scan.next();
        
        socio = socio.toUpperCase();
        
        switch (socio){
            case "A":
                System.out.println("ingrese el monto del tratamiento");
                Scanner costo_a = new Scanner(System.in);
                double costoA = costo_a.nextDouble();
                System.out.println("Usted debe abonar $" + (costoA * .5));
                break;
            case "B":
                System.out.println("ingrese el monto del tratamiento");
                Scanner costo_b = new Scanner(System.in);
                double costoB = costo_b.nextDouble();
                System.out.println("Usted debe abonar $" + (costoB - (costoB * .35)));
                break;
           case "C":
                System.out.println("ingrese el monto del tratamiento");
                Scanner costo_c = new Scanner(System.in);
                double costoC = costo_c.nextDouble();
                System.out.println("Usted debe abonar $" + costoC);
                break;  
           default:
               System.out.println("Usted no ingreso una valor correcto");
            
            
            
        }                
        
        
        
        
        
        
        
        
    }
    
}
