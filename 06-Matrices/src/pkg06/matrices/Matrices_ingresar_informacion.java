package pkg06.matrices;

import javax.swing.JOptionPane;

public class Matrices_ingresar_informacion {

    public static void main(String[] args) {
//
//        //////////////////////////////////////////////////////INGRESAR  INFROMACION A LA  MATRIZ    
//        //Declaracion de la matriz      a
//        String[] matrizString = new String[7];
//
//        //Recorre  la matriz y por cada  incrementacion muestra la pantalla emergente      
//        for (int i = 0; i < 7; i++) {
//
//            //matrizString[i]= Imprime cada acumulador  de  i++         
//            //Muestra  la pantalla emergente  cada  vez que  incrementa  el  contador    ( matrizString[i])
//            matrizString[i] = JOptionPane.showInputDialog("ingrese Pais........." + i);
//
//        }
//
//           //Se imprime la  matriz con el for  reducido 
//        for (String matrixS : matrizString) {
//
//            //Imprime  la  matriz que tenemos  en la  condicion del for  
//            System.out.println("Paises-----------" + matrixS);
//
//        }
//        
        /////////////////////////////////////////////////////RELLENAR LA MATRIZ CON  EL METODO RANDOM

        //Creamos  la  matriz de  una logitud de 100 espacios
        
        int[] matriz = new int[100];
        
        //recoremos la  matriz hasta  1000

        for (int i = 0; i < matriz.length; i++) {
            
            //Rellenamos la matriz con numero  random Math.random() * 100 y  los aproximamos con Math.round

            matriz[i] = (int)Math.round(Math.random() * 100);

        }
        
        //Recoremos la  matriz y imprimimos  la informacion que incorporamos con el metodo  Math.random() * 100;
        for(int matriz1:matriz){
            
            
            System.out.print(matriz1+"-");
        }

    }

}
