package com.Company;

public class FoorLoop {
    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
            /* - Colocamos el bucle for
               - Seguido del nombre del tipo de la variable, nombre de la variable y su valor
               - Seguido de la condición de parada
               - Seguido de las iteraciones que tendrá dicha variable
               - La variable se le puede llamar i (De índice) o ponerle cualquier otro nombre.
               - La variable i se irá incrementando de uno en uno desde cero hasta ser menor que 10
               - Compilaremos el código y pediremos que imprima un mensaje que lo hará 9 veces
               - En el momento que sea 10, incumple la condición y se rompe el bucle
            */
            System.out.println(i + " Hola mundo, soy una variable que aumenta de 1 en 1 hasta llegar a 9");

        }
        System.out.println("Fin");
    }
}
