/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author eduardo
 */
public class ejercicio8 {
    
    
    public static void main(String[] args) {
        
      /*
       Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
       cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
       valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
       los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable
       auxiliar.   
     */  
        
      int a, b, c, d, aux;
      
      a = 1; /* D */
      b = 2; /* C */
      c = 3; /* A */
      d = 4; /* B */
      System.out.println("A = " + a + " / B = " + b + " / C = " + c + " / D = " + d);
      
      a = d;
      b = c;
      c = a;
      d = b;
      System.out.println("Luego de cambiar las varialbes," + "A = " + a + " / B = " + b + " / C = " + c + " / D = " + d);      
      
      
      
      
      
      
      
      
      
      
      
        
    }
}
