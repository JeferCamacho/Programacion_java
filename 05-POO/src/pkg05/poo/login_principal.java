package pkg05.poo;

import javax.swing.JOptionPane;

public class login_principal {

    public static void main(String[] args) {

        Login_poo mensajero = new Login_poo();//establecer  una conversacion con la clase

      String usuario="hola" ;
       int contraseña=123; 
        
       
        
       
        usuario=JOptionPane.showInputDialog("ingrese usuario");
       contraseña=Integer.parseInt(JOptionPane.showInputDialog("IngreseConstrasena"));
       
       
       mensajero.validacion(usuario, contraseña);
       
       mensajero.retorno();
       
       
        
        
        
        
        
        
        
        
        
        

//  verificar.ValidacionU(JOptionPane.showInputDialog("ingrese  usuario"));
//  verificar.validacionC(Integer.parseInt(JOptionPane.showInputDialog("ingrese  usuario")));
//  
//  JOptionPane.showMessageDialog(null,"informacion"+ verificar.intentos_logi());
    }

}
