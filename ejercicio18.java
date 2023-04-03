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
public class ejercicio18 {
    
    /*
Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o
Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”

    
    */
    
    
    public static void main(String[] args) {
        
       int i = 0;
       
    
            
           
           System.out.println("ingrese una opcion");
           Scanner scan = new Scanner(System.in);
           int tipoMotor = scan.nextInt();
        
           
            switch (tipoMotor){
                case 1:
                    System.out.println("a bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("a bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("a bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("a bomba es una bomba de alimenticia");
                    break;
                default:
                    System.out.println("no ingreso una opcion valida");
                    break;
                 
                
            }
       
        
     
       
       
           
          
        
        
        
        
        
    }
}
