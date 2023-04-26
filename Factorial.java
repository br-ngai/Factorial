
package com.mycompany.factorial;

/**
 *
 * @author Brandon Hernandez Moreno
 * @email. beu7www@gmail.com
 */
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        
        int numero = num.nextInt();
        int factorial = 1;
        
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}