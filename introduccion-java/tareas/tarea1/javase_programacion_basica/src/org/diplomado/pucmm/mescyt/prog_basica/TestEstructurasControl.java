/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diplomado.pucmm.mescyt.prog_basica;

import java.util.Scanner;

/**
 *
 * @author ecabrerar
 */
/**
 * Un ejemplo sencillo que trata de demostrar la comparacion de variables
 * númericas y también la comparación de cadena de caracteres, así como también
 * el uso de las sentencias IF/ELSE y WHILE
 */
public class TestEstructurasControl {

    public static void main(String[] args) {
        // La bienvenida al usuario con el programa
        System.out.println("Bienvenido a la calculadora de la factura total");
        System.out.println();  // imprimir una línea en blanco

        // crear un objeto de la clase Scanner llamado sc
        Scanner sc = new Scanner(System.in);

        // Realizar los cálculos de la factura hasta que la elección no sea igual a "y" o "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // Obtener el subtotal de la factura del usuario
            System.out.print("Escriba el subtotal:   ");
            double subtotal = sc.nextDouble();

            // Calcular el importe del descuento y el total
            double discountPercent = 0.0;
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            //Mostrar la cantidad de descuento y el total 
            String message = "Porcentaje de descuento: " + discountPercent + "\n"
                    + "Importe de descuento :  " + discountAmount + "\n"
                    + "Total de la factura:    " + total + "\n";
            System.out.println(message);

            // Si el usuario quiere seguir
            System.out.print("Continuar ? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
