package com.company;

public class BreakInLoop {
    public static void main(String[] args){
        int count = 0;
        while(count < 20){ //Mientras que el contador sea menor de 10//
            count++;  //Incrementar el contador en 1//
            if(count == 6) //Si el contador es igual que 6//
                break;  //se rompe el bucle//
                /*
                - Cuando la condición es == que 6, se rompe el bucle y nos salimos de él
                - Por esa razón, en el terminal al compilar no imprime el 6 sino del 1 a 5 y nos salimos
                 */
            System.out.println("Hola Mundo " + count);
        }
        System.out.println("Fin");
    }
}
