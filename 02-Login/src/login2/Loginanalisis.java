
package login2;
import com.oracle.jrockit.jfr.DataType;
import javax.swing.*;

public class Loginanalisis {
    
    public static void main(String[] args) {
        
      
       String usuario="jefersson";
       int pass= 123  ,intento =1,maximo=3;
       
       
       
       
       
       while(usuario.equals(usuario) && pass ==(pass)   && (intento<maximo)){
           
           
         
           
          JOptionPane.showMessageDialog(null, "Datos incorrectos"+intento);
          usuario =JOptionPane.showInputDialog("Digite usuario ");
          pass=Integer.parseInt(JOptionPane.showInputDialog("Digite numero telefono"));
          
            intento++;
          
           
           
           if(intento==3){
               
               
              JOptionPane.showMessageDialog(null, "Cuenta Bloqueda"+intento);
              
           }
       }
       
     
               
               
               
        
        
        
        
        
    }
    
    
    
}
