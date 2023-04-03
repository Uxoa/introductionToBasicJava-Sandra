package com.company;

public class IfElse {
    public static void main(String[] args){
        boolean check = 5 < 10;
        int number1 = 15;
        int number2 = 23;
        int number3 = 2;

        if(number1>number2 && number2>number3 ){
            //El if else es un condicional//
            //Si tal condición se cumple o no, entonces se ejecuta tal o cual opción//
            //-&&: Se tienen que cumplir ambas condiciones para que sea true//
            //La respuesta sería falso, puesto que number1 no es mayor que number2//
            System.out.println("Es verdadero");
        }else if(number2<number3){
            System.out.println("Es falso");
        } else {
            System.out.println("Fin");
        }

    }
}
