public class Funciones {
    public static void main (String[] args) {
        holaMundo();
        //Declaro esta función en el public static.//
        //Las public function La puedo llamar desde cualquier lugar//
        //Una public static puede ser llamada desde otra clase//

        holaMundo("Sandra");
        holaMundo("Álvaro");
        holaMundo("Francisco");
        holaMundo("María");
    }
    private static void holaMundo() {
        System.out.println("Hola a Todo el Mundo Mundial");
        System.out.println("Muy buenas noches a todos los terrícolas");
        //(Invoco a mi función  e indico qué quiero que imprima//
        //Las private function solo puedo llamarlas desde mi ámbito del mismo bloque//
        //Una función puede tener el mismo nombre pero diferentes parámetros.Esto se llama sobrecarga//
        //Una función también se puede sobrecargar cuando hay diferente tipo de dato//
        //Una sobrecarga de la función jamás va a provocar un error//
        //Duplicar una función es una mala práctica//
    }

    private static void holaMundo(String name){
        /*
        - Indico el nombre de mi variable string como name y se colocará automáticamente
        en mi función holaMundo("Sandra"); que está arriba
        - Una private static solo puede ser usada dentro de la misma clase y no se puede llamar desde fuera
        */
        System.out.println("Hola " + name );
    }

}
