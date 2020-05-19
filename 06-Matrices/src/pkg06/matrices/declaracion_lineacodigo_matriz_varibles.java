package pkg06.matrices;

public class declaracion_lineacodigo_matriz_varibles {

    public static void main(String[] args) {

        //////////////////////////////////////////////////////// TIPO DE  VARIBLE  DE ENTERA     
        
        //Declacion de  la matriz y en la misma linea de  codigo espeficamos las variables
        int[] matrizint = {45, 56, 78, 96, 45, 6, 7, 8};

        //Recorer la informacion dentro de la  matriz con especificacion de la  condicion 
        for (int i = 0; i < 8; i++) {

            System.err.println(matrizint[i]);

        }

        //Recorer la informacion dentro de la  matriz con el  metodo  nombre.length
        for (int i = 0; i < matrizint.length; i++) {

        }

        /////////////////////////////////////////////////////////TIPO DE VARIABLE  STRING 
        //Declacion de  la matriz y en la misma linea de  codigo espeficamos las variables de  String
        String[] matrizString = {"Santiago", "hola", "Bienvenidos"};

        //Recorer la informacion dentro de la  matriz con especificacion de la  condicion  
        for (int i = 0; i < 4; i++) {

            System.out.println(matrizString[i]);

        }

        //Recorer la informacion dentro de la  matriz con el  metodo  nombre.length
        for (int i = 0; i < matrizString.length; i++) {

            System.err.println(matrizString[i]);
            
            
            

        }

    }

}
