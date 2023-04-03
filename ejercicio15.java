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
public class ejercicio15 {
    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
    voy a usar un Switch
    
    */

    public static void main(String[] args) {
        
        System.out.println("ingrese un numero del  1 a 10");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        switch(num){
            case 1:
                System.out.println("el equivalente de " + num + " en romano es I");
                break;
            case 2:
                System.out.println("el equivalente de " + num + " en romano es II");
                break;
            case 3:
                System.out.println("el equivalente de " + num + " en romano es III");
                break;
            case 4:
                System.out.println("el equivalente de " + num + " en romano es IV");
                break;
            case 5:
                System.out.println("el equivalente de " + num + " en romano es V");
                break;
            case 6:
                System.out.println("el equivalente de " + num + " en romano es VI");
                break;
            case 7:
                System.out.println("el equivalente de " + num + " en romano es VII");
                break;
            case 8:
                System.out.println("el equivalente de " + num + " en romano es VIII");
                break;
            case 9:
                System.out.println("el equivalente de " + num + " en romano es IX");
                break;
            case 10:
                System.out.println("el equivalente de " + num + " en romano es X");
                break;
            default:
                System.out.println("no ingresaste un numero del 1 a 10");
        }
        
        
        
    }
    
    
}
