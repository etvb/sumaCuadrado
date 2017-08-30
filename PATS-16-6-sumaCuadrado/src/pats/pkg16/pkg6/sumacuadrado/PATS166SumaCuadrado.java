/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pats.pkg16.pkg6.sumacuadrado;

import java.util.Scanner;

/**
 *
 * @author edgardo
 */
public class PATS166SumaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double num1 = 0, num2 = 0, resultado;
        
        //Pedimos datos
        System.out.print("Ingresa el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        num2 = teclado.nextDouble();
        
        //Calculamos y mostramos
        resultado = (Math.pow(num1, 2)) + (Math.pow(num2, 2)) + (2*(num1*num2));
        System.out.println(resultado);
        
        
    }
    
}
