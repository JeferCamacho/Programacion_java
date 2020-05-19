
package pkg01.bucles;

import javax.swing.JOptionPane;


public class Ejecicio_for_factorial {
    
    
    public static void main(String[] args) {
        
        
        
         int   resultado=1;
        
        int numero =Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        
        
        for (int i = numero; i > 0; i--) {
            
            
            
            resultado=resultado*i;
            
        }

        
        JOptionPane.showMessageDialog(null  , " factorial  "+numero+"resultado es "+resultado);
    }
    
}
