
package pkg01.bucles;

import javax.swing.JOptionPane;


public class Ejecicio_Entrar_numero {
   
    
    
   
    
    
    
    public static void main(String[] arcgs) {
       
     int numero=0;
        int aletorio=(int )(Math.random()*100);
        
        
        
       
        
        
        while (numero!=aletorio){
            
            
               
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite numero  a  adivinar "));
       
            
            
            if(aletorio<numero){
                
              JOptionPane.showMessageDialog(null, "Numero  menor");
               
              
                
                
            }else if (aletorio>numero){
                JOptionPane.showMessageDialog(null, "numero  mayor");
                
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "numero  correcto ");
        
        
        
       


        
        

    }
    
    
    
}
