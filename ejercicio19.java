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
public class ejercicio19 {
    
    /*
    Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
    la nota se pedirá de nuevo hasta que la nota sea correcta.
    */
    
    
    public static void main(String[] args) {
        
        
        Scanner nota_i = new Scanner (System.in);
        boolean salir =  true;
        
      
       
        
        do
        {
         System.out.println("ingrese una nota");
         int nota = nota_i.nextInt();
         if (nota<=10 && nota>=0)
         {
             salir = false;
         }
         
         
         
        }while (salir);
        
        
        
        
       
      
        
        
       
      
          
          
      
  }
}
