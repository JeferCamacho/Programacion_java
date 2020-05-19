package pkg06.matrices;

public class Matrices {

    public static void main(String[] args) {

        /*
        
        Declaración int[] nombre= new int[10];
        
        *Tipo de  matriz : int
        nombre de la matriz: nombre
        Numero  de  valores que almacena la matriz: int[10]
        
        
        
        tipo  de la matriz + nombre  + new +  tipo de la matriz (int) cantidad de valores[10]
        
        
        iniciar un valor  de  la matriz
        
        
        nombre[0]=15;
        nombre[1]=15;
        nombre[0]=15;
        nombre[0]=15;
        nombre[0]=15;
        
        
        posiciones  desde  cero (5) :01234
        
        
     ////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
        
        Declaracion en misma linea
        
        
        int[] nombre={15,25,8,-7,92}
        
        
        
        //////////////////////////////////////////////////////////////////////////////////////////////
        
        
        recojer el matrices 
        
        for (int i=0; i<5; i++){
        
        
        imprimir + nombre matriz + variable que estarecorriendo el for  [i]
        
        
        
        
                System.err.println("matriz[i]");   
        
        }
        
        
       ////////////////////////////////////////////////////////////////////////////
      
        Para imprimir toda  la matriz  se realiza  con la metodo (length) 
        
        
        matriz.length
        
        
        
       for(int i=0; i<matriz.length;i++){
        
        
        Se imprimime toda la informacion de la matriz
        
                System.err.println(matriz[i]);
        
        
        }
        
        
        
        
        
        
        
        
        
         */
        // int[]  matriz=new int[5];
        int[] matriz1 = {15, 25, 8, -7, 92, 58};

        for (int i = 0; i < matriz1.length; i++) {

            System.out.println("valor de la posicion---" + i + "variable guardada" + matriz1[i]);

        }

    }

}
