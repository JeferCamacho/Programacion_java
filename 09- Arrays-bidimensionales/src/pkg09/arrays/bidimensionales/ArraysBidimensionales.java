package pkg09.arrays.bidimensionales;

public class ArraysBidimensionales {

    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////MATRIZ BIDIMENCIONAL
        //Declaracion  de  la matriz  bidimencional 
        //Tipo  de dato + [] +[] + (nombre  de  la matriz) + = + new + tipo de dato inicial +  [tamaaño de la matriz] + [tamaaño de la matriz] 
        int[][] bidimencional = new int[4][5];

        //Realizamos el recorrido de la matriz  bidimencional  con dos  for  en el  caul  recorren las  posisciones  de  la  matriz
        for (int i = 0; i < 4; i++) {

            //    int [4]
            for (int j = 0; j < 5; j++) {

                //   int [5]     
                /*realizamos  el  relleno de  la matriz bidimencioanl  especificamos las   bidimencional[i][j] en cual va ha ser  el  recorrido con
        for para  realizar  el relleno Math.random()*100  y lo  convertimos en entero  con Math.round y hacemos  una refundicion   (int) por 
        el valor  retorno no es  permitida
        
        
                 */
                bidimencional[i][j] = (int) Math.round(Math.random() * 100);

            }

            //Realizamos fue recorer  la  matriz para  imprimirla se  realiza con for  para  que recorra las  dos  dimenciones     
            for (int j = 0; j < 4; j++) {
                
                
                
                //Recorrido  int [4]
                
                
                //Se  coloca  este  System para  poder  visualizar el espacion en el recorrido  
                System.err.println("");
                
                
                

                for (int k = 0; k < 5; k++) {
                    
                    
                    //recorrido  Dimencion  int [5]  
                    
                    
                  /*Realizamos  la  impresion de los  recorridos  de l  for [j][k]   en caul  usuamos System.err.print(bidimencional[j][k]  para 
                    imprimir lo  que hay en las  dimenciones
                    
                    */

                    System.err.print(bidimencional[j][k] + " ");

                }
            }

        }

    }

}
