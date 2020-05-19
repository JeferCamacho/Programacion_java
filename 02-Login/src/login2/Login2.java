package login2;

import javax.swing.JOptionPane;

public class Login2 {

    public static void main(String[] args) {

        String usuario = "hola";
        int contra = 123;

        int contador = 0, intentos = 1, maximo = 3, saldo = 1000, consignar = 0, retirar, regresar = 1 ,regresarlo=1, saldop;

        boolean logi = true;

        usuario = JOptionPane.showInputDialog("Bienvenido Bancolombia\n\n\n" + "Ingrese Usuario");
        contra = Integer.parseInt(JOptionPane.showInputDialog("Digite Contraseña"));

        while (contra != 123 && usuario != "hola" && (intentos < maximo)) {

            JOptionPane.showMessageDialog(null, "Informacion incorrecta Intento" + intentos);
            usuario = JOptionPane.showInputDialog("Ingrese Usuario");
            contra = Integer.parseInt(JOptionPane.showInputDialog("Digite Contraseña"));

            intentos++;

            if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "Cuenta bloqueda\n"
                        + "Comuquese para mas  informacion :  1000456 \n"
                        + "Correo Electronico : bancocolombia@gmail.com"
                );
                
                return;
                


            }

        
          System.err.println("hola");
        
}    
        
        

        
        
        


        do {
            if (true) {

                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1--------------- Saldo\n"
                        + "2---------------Consignar\n"
                        + "3...............Retirar\n"
                        + "4---------------Cambiar clave\n"
                        + "5---------------salir"
                )
                );

                switch (opcion) {
                    case 1:

                        JOptionPane.showMessageDialog(null, "Saldo Actual-----------------" + saldo);

                        break;

                    case 2:
                        consignar = Integer.parseInt(JOptionPane.showInputDialog("Digite monto a consugnar"));

                        saldo = (consignar + saldo);

                        JOptionPane.showMessageDialog(null, "Consignacion EXITOSA");

                        break;

                    case 3:

                        retirar = Integer.parseInt(JOptionPane.showInputDialog("Retirar"));
                        if (saldo<(retirar)|| retirar>=50000) {

                            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");

                        } else {

                            JOptionPane.showMessageDialog(null, "Retiro EXITOSO");
                           saldo =  saldo-retirar ;  

                        }
                      
                          
                      
                      

                        break;

                    case 4:

                        break;

                    case 5:

                        JOptionPane.showMessageDialog(null, "Muchas Gracias");

                        break;

                    default:

                        JOptionPane.showMessageDialog(null, "opcion no  escontrada");

                }

            }

            regresar = Integer.parseInt(JOptionPane.showInputDialog(("1-------------------Continuar\n" + "2------------------Salir")));

        } while (regresar == 1);

    }
}
