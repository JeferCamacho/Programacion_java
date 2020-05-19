package pkg06.matrices;

public class declaracion_matriz_variables {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////// TIPO DE  VARIBLE  DE ENTERA      

        //Primera Forma  declarar la variables fuera de  la linea  de  codigo  de la  matriz    
        int[] matrizint = new int[5];

        matrizint[0] = 15;
        matrizint[1] = 5;
        matrizint[2] = 9;
        matrizint[3] = 7;
        matrizint[4] = 8;

        //Recorer la informacion dentro de la  matriz con especificacion de la  condicion 
        for (int i = 0; i < 5; i++) {

            System.err.println(matrizint[i]);

        }

        //Recorer  la informacion  dentro  de la  matriz  con el  metodo  nombre.length   
        for (int i = 0; i < matrizint.length; i++) {

            System.err.println(matrizint[i]);

        }

        /////////////////////////////////////////////////////////TIPO DE VARIABLE  STRING 
        
        
        
        
        //Primera Forma  declarar la variables fuera de  la linea  de  codigo  de la  matriz
        String[] matrizstring = new String[5];

        matrizstring[0] = "hola";
        matrizstring[1] = "hola";
        matrizstring[2] = "hola";
        matrizstring[3] = "hola";
        matrizstring[4] = "hola";

         //Recorer la informacion dentro de la  matriz con especificacion de la  condicion   
        for (int i = 0; i < 5; i++) {

            System.err.println(matrizstring[i]);

        }

        //Recorer la informacion dentro de la  matriz con el  metodo  nombre.length
        for (int i = 0; i < matrizstring.length; i++) {

            System.err.println(matrizstring[i]);

        }

    }

}
