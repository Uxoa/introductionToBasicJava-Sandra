package com.company;

public class ContinueAndBreak {
    public static void main(String[] args){
        int count = 0;
        while(count < 10){ //Mientras que el contador sea menor de 10//
            count++;  //Incrementar el contador en 1//
            if(count == 6) //Si el contador es igual que 6//
                continue;  //Continuar al siguiente valor del contador//
                /*
                - Cuando la condición es == que 6, se salta ese valor y pasa al siguiente
                - Por esa razón, en el terminal al compilar no imprime el 6 sino del 1 a 5 y del 7 al 10
                 */
            System.out.println("Hola Mundo " + count);
        }
        System.out.println("Fin");
    }
}
