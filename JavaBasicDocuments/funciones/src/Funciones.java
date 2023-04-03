public class Funciones {
    public static void main (String[] args) {
        holaMundo();
        //Declaro esta función en el public static.//
        //Las public function La puedo llamar desde cualquier lugar//

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
    }

    private static void holaMundo(String name){
        /*
        Indico el nombre de mi variable string como name y se colocará automáticamente
        en mi función holaMundo("Sandra"); que está arriba
        */
        System.out.println("Hola " + name );
    }

}
