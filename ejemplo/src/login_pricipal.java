
import javax.swing.JOptionPane;

public class login_pricipal {

    private String nombre;
    private int pass;
    public boolean vali;

    public login_pricipal(String pnombre, int ppass) {

        nombre = pnombre;
        pass = ppass;

    }

    public String recibeuser(){

        if (nombre.equals("hola") && pass==123) {
            
             return "Bienvenido";

        } else {

           return "informacion incorrecta";

        }

    }

    

    }


