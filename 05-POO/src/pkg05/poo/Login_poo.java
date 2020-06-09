package pkg05.poo;

import javax.swing.JOptionPane;

public class Login_poo {
//
//    private String usuario;
//    private int contrasena;
//    private boolean ver;
//    private int intentos;
//    private int maximo;
//
//    public Login_poo() {
//
//        usuario = "hola";
//        contrasena =123;
//        intentos = 1;
//        maximo=3;
//        
//        
//        
//
//    }
//    
//    
//    public void  ValidacionU(String usuario){
//        
//      
//        if (usuario.equals("hola")) {
//            
//           ver=true;
//            
//            
//        }else{
//            
//           ver=false; 
//            
//        }
//    }
//    
//    
//   public void validacionC(int contrasena){
//       
//       
//       if(contrasena==123){
//           
//           ver=true;
//           
//       }else {
//           
//           ver=false;
//       }
//               
//              
//       
//       
//       
//   }
//    
//    
//  
//   public String  intentos_logi(){
//       
//       while(ver!=false && (intentos<maximo)) {
//           
//           
//           intentos++;
//           
//           
//           if (intentos==3) {
//               
//               
//               ver=false;
//               
//           }
//           
//           
//       }
//       
//      
//       return intentos_logi();
//       
//   }

    private String usuario;
    private int contrasena;
    private boolean vali;

    public Login_poo() {

        usuario = "hola";

    }

    public void validacion(String usuario, int contraseña) {

        this.usuario = usuario;
        this.contrasena = contraseña;

        if (usuario.equals(usuario) && contraseña == contraseña) {

            vali = true;

        } else {

            vali = false;

        }

    }

    public String retorno() {
        if (vali == false) {

            JOptionPane.showMessageDialog(null, "usuario incorrecto");

        } else {

            JOptionPane.showMessageDialog(null, "Bienveido");

        }

        return "" + vali;

    }

}
