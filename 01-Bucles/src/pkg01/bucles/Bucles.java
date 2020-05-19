package pkg01.bucles;

import java.io.PrintStream;
import java.util.*;





import javax.swing.JOptionPane;

public class Bucles {

    public static void main(String[] args) {

        //  int i = 1, con = 0;

        /*while (condicion){
        
       *El  buble  se  va  a repetir  siempre  y cuando sea verdadero y ejecuta  la instrucion
       cuando  es  falso  se  sale  y no cumplina la  la  instruccion;
        
        *El while  para ejecutar una determinada veces nencesita  un contador
        
        
        
     ( Intruccion)
        
        
       
        
        while (i<=10) {
          
            System.err.println(i); 
            i++;

            
        }
        

        int o = 1, maxin, nota = 0, acum1 = 0, acum2 = 0;

        maxin = Integer.parseInt(JOptionPane.showInputDialog("Digite numero  de notas a operar"));

        while (o <= maxin) {

            nota = Integer.parseInt((JOptionPane.showInputDialog("Digite nota" + o)));

            o++;

        }

        acum1 = nota + 1;

        System.err.println(acum2);

        System.err.println(acum1);
         */
        ////////////////////////////////////////////////////////////////////////////////
        /*
 
    for(
 
 
 
 for (int j = 1; j < maxin1; j++) {
        
        j>  inicializa el bucle
        maxin> Donde termina el bucle 
        j < maxin1 condicion logica del  bucle
        j++> (contaor bucle) Es un valor  de incremento es dcir  que me  va  a incrementar positivo  o negativo 
        --j  Es va  contar de superior a inferios int j = 10; j >=1; --j
        
        
        
        
        }
 
        
         */
       /* int maxin1 = 0, notas1, acu1 = 0, acu2 = 0;
        float div =0;
        maxin1 = Integer.parseInt(JOptionPane.showInputDialog("Digite nuemro notas"));

        for (int j = 1; j <= maxin1; j++) {

            notas1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Notas "));

            acu1 += notas1;
      div = (acu1 / maxin1);
        }

      

        JOptionPane.showMessageDialog(null, "notas----------------" + div);
        
       */
       
    /*
       int num1;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite numero  a  elevar"));
        
        

        
     num1=(int )Math.round(num1);
        
     JOptionPane.showMessageDialog(null, "numero es"+num1); 
        
     */
     /*
     
     String nombre="hola estoy aprendiendo a programar  con la clase  string  y sus metodos";
     

            JOptionPane.showMessageDialog(null, "cantidad le letras son "+nombre.length()+"\n"+"la letra es -----"+nombre.charAt(3)+"\n"+"letra desde un rango a otro"+nombre.substring(1 ,45));
      
    
    
 */
     
  
     
     Scanner  escribir= new Scanner  (System.in);
     
     
     
     int dato1=Integer.parseInt(JOptionPane.showInputDialog("Digite Numero 1"));
     int dato2=Integer.parseInt(JOptionPane.showInputDialog("Digite Numero 2 "));
     
     double div =dato1/dato2;
     
    
     System.out.printf("%1.3 f", div);
     
     
     
            
     
     
     
    }

}
