/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
 */
public class ejercicio20 {

    public static void main(String[] args) {

        System.out.println("Ingrese un valor maximo");
        Scanner maximo_i = new Scanner(System.in);
        int maximo = maximo_i.nextInt();
        int suma = 0;

        do 
        {
            System.out.println("Ingrese valores");
            int num = maximo_i.nextInt();
            suma += num;
        } while (maximo > suma);

        System.out.println("el maximo a superar en la suma es " + maximo + " y la suma arrojo " + suma);

    }
}
