package com.company;

public class WhileLoop {
    public static void main(String[] args){
        int count = 0;
        while(count < 10){  //Mientras que el contador sea menor que 10//
            System.out.println(count + " Hola Mundo, incrementaré el contador hasta ser menor que 10");
            count++;
            //count++ es la condición. Si no la indicáramos, al ser true sería infinito y entraría en bucle//
        }
        System.out.println("Fin");
    }
}
