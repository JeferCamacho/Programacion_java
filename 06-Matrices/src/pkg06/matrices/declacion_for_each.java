
package pkg06.matrices;


public class declacion_for_each {
    
    
    
    public static void main(String[] args) {
        
      ////////////////////////////////////////////BUCLE FOR EACH  MEJORADO  ////    VARIABLES TIPO  ENTERO 
  
    
     //Declacion de  la matriz y en la misma linea de  codigo espeficamos las variables
    
    int []  matrizint={1,2,3,4};
    
    
    /*Este  es para recorer  la  matriz reducido 
    
    for((varible de la matriz) +(nombre )+ : + (nombrematriz){
    
     System.err.println(nombre);
    }
    
    
    */
       
       
    for(int matrizI:matrizint){
        
        System.out.println(matrizI);
        
    }
    
    
     
    ////////////////////////////////////////////BUCLE FOR EACH  MEJORADO  ////    VARIABLES TIPO  STRING
    
    
    
    
    
    
    String [] matrizString={"hola","hola","que hace"};
    
        for (String matrizS:matrizString) {
            
            System.out.print(matrizS);
            
        }
         
    }
    
   
    
    
    
    
}
