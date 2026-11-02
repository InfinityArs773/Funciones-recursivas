/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursividad;

/**
 *
 * @author Erick López
 */
public class MCD {
    
    public static int mcd(int a, int b){
        
        if (b==0){
           return a;
        }
        
        return mcd(b, a % b);
    }
}
