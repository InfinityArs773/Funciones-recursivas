/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividad;

/**
 *
 * @author Erick López
 */
public class Reverse {
    
    public void reverse(Object datos[], int inicio, int fin) {

        if (inicio >= fin) {
            return;
        }

        Object auxiliar = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = auxiliar;

        reverse(datos, inicio + 1, fin - 1);
     }
}
