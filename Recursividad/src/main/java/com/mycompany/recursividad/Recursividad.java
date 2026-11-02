/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividad;

import java.util.Arrays;

/**
 *
 * @author Erick López
 */
public class Recursividad {

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();
        
        MCD mcd = new MCD();
        
        Count contador = new Count();
        
        Reverse inversor = new Reverse();

        // Fibonacci
        System.out.println("Fibonacci de 5: " + fib.fibonacci(5));

        System.out.println("");

        System.out.println("Fibonacci de 40: " + fib.fibonacci(40));

        System.out.println("");

        // MCD
        System.out.println("MCD de 45 y 75: " + mcd.mcd(45, 75));

        System.out.println("");

        System.out.println("MCD de 47 y 91: " + mcd.mcd(47, 91));

        System.out.println("");

        // Count con números
        Object numeros[] = {1, 2, 3, 3, 2, 3, 1};

        System.out.println("Ocurrencias del 3: "
                + contador.count(numeros, numeros.length, 3));

        System.out.println("");

        System.out.println("Ocurrencias del 1: "
                + contador.count(numeros, numeros.length, 1));

        System.out.println("");

        // Count con caracteres
        Object letras[] = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};

        System.out.println("Ocurrencias de C: "
                + contador.count(letras, letras.length, 'C'));

        System.out.println("");

        System.out.println("Ocurrencias de E: "
                + contador.count(letras, letras.length, 'E'));

        System.out.println("");

        // Reverse con números
        Object numerosReverse[] = {1, 2, 3, 4, 5};

        inversor.reverse(numerosReverse, 0, numerosReverse.length - 1);

        System.out.println("Arreglo invertido: "
                + Arrays.toString(numerosReverse));

        System.out.println("");

        // Reverse con caracteres
        Object letrasReverse[] = {'A', 'B', 'C', 'D'};

        inversor.reverse(letrasReverse, 0, letrasReverse.length - 1);

        System.out.println("Letras invertidas: "
                + Arrays.toString(letrasReverse));

    }
}