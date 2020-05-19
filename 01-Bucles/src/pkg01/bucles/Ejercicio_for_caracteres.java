package pkg01.bucles;

import javax.swing.JOptionPane;

public class Ejercicio_for_caracteres {

    public static void main(String[] args) {

       /* 
        i> Inicio blucle 
        i<=10>condicion miestras  que se  cumpla se va  a seguir ejecutando  
        i++>contador  bucle 
        
        i+=2 incrementa  en  2 en 2 hasta  que  se  finaliza
        
        */
        
        
        
      
        int  arroba = 0;
        boolean  punto =false;

        String email = JOptionPane.showInputDialog("digite correo  electronico ");

        for (int i = 1; i < email.length(); i++) {

            if (email.charAt(i) == '@') {

                arroba++;

            }
            
            if (email.charAt(i)=='.'){
                
                
                
                punto=true;
            }
            

        }
        
        if(arroba==1 && punto==true){
            
            
                JOptionPane.showMessageDialog(null, "Informacion Corecta");
            
            
        }else {
            
            
            JOptionPane.showMessageDialog(null, "Es incorrecto");
            
            
            
        }
          
        
      
        
        
    }

}
