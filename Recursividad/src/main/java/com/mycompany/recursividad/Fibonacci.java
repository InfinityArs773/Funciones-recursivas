package com.mycompany.recursividad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick López
 */
public class Fibonacci {
    public static long fibonacci(int num) {

        if (num <= 1) {
            return num;
        }

    return fibonacci(num - 1) + fibonacci(num - 2);
}
}
