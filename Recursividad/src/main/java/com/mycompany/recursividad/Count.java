/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividad;

/**
 *
 * @author Erick López
 */
public class Count {
    
    public int count (Object datos[], int n, Object o){
        if (n == 0){
            return 0;
        }
    
    if (datos[n - 1].equals(o)) {
            return 1 + count(datos, n - 1, o);
        }

        return count(datos, n - 1, o);
    }
}
