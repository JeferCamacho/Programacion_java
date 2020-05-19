
package prueba6;

import javax.swing.JOptionPane;


public class Ejercicio_ordenar {
    
    
    
    public static void main(String[] args) {
        
          
//        int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite Numero 1"));
//        int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite Numero 2"));
//        
//        
//        if(n1%2  ==0){
//            
//            JOptionPane.showMessageDialog(null, "Primer numero es par");
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "numero Es impar");
//        }
//        
//        
//          if(n2%2  ==0){
//            
//            JOptionPane.showMessageDialog(null, "Primer numero es par");
//            
//        }else{
//            JOptionPane.showMessageDialog(null, "numero Es impar");
//        }
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 3"));
        int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 3"));

        if (n1 > n2 && n2 > n3 && n3 > n4) {

            JOptionPane.showMessageDialog(null, "Numero es" + n1 + "-" + n2 + "-" + n3 + "-" + n4);

        } else if (n1 > n4 && n4 > n3 && n3 > n2) {

            JOptionPane.showMessageDialog(null, "numero es:" + n1 + "-" + n4 + "-" + n3 + "-" + n2);
            
        } else if (n1 > n3 && n3 > n2 && n2 > n4) {

            JOptionPane.showMessageDialog(null, "numero es: " + n1 + "-" + n3 + "-" + n2 + "-" + n4);

        } else if (n2 > n1 && n1 > n3 && n3 > n4) {

            JOptionPane.showInputDialog("numero Es :" + n2 + "-" + n1 + "-" + n3 + "-" + n4);

        } else if (n2 > n4 && n4 > n3 && n3 > n1) {

            JOptionPane.showMessageDialog(null, "Numero Es:" + n2 + "-" + n4 + "" + n3 + "-" + n1);

        } else if (n2 > n3 && n3 > n1 && n1 > n4) {

            JOptionPane.showMessageDialog(null,"numero Es : " + n2 + "-" + n3 + "-" + n1 + "-" + n4);

        }
        
        else if(n3>n1 && n1>2 && n2>n4 ){
            
            JOptionPane.showMessageDialog(null,"numer es :"  + n3 + "-" + n1 + "-" + n2 + "-" + n4 );
  
        }
        else if(n3>n2 && n2>1 && n1>n4 ){
            
            JOptionPane.showMessageDialog(null,"numer es :"  + n3 + "-" + n2 + "-" + n1 + "-" + n4 );
  
        }
        else if(n3>n4 && n4>2 && n2>n1 ){
            
            JOptionPane.showMessageDialog(null,"numer es :"  + n3 + "-" + n2 + "-" + n4 + "-" + n1 );
  
        }
        else if(n4>n1 && n1>n2 && n2>n3 ){
            
            JOptionPane.showMessageDialog(null,"numer es :"  + n4 + "-" + n1 + "-" + n2 + "-" + n3 );
  
        }
        else if(n4>n2 && n2>n1 && n1>n3 ){
            
            JOptionPane.showMessageDialog(null,"numer es :"  + n4 + "-" + n2 + "-" + n1 + "-" + n3 );
  
        }
        else if(n4>n3 && n3>n1 && n1>n2 ){
            
            JOptionPane.showMessageDialog(null,"numer es :"  + n4 + "-" + n3 + "-" + n1 + "-" + n4);
  
        }
        
        
        
        
    }
}
