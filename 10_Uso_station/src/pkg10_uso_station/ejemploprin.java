
package pkg10_uso_station;

import javax.swing.JOptionPane;

public class ejemploprin {
    
    
    public static void main(String[] args) {
        
        ejemplo mensaje1= new ejemplo("pablo",45);
        ejemplo mensaje2= new ejemplo("pabluto",23);
        
        
        JOptionPane.showMessageDialog(null, "informacion"+mensaje1.imprmir());
        JOptionPane.showMessageDialog(null, "informacion"+mensaje2.imprmir());
        
        
        
        
        
        
        
    }
    
}
