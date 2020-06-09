package pkg10_uso_station;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class ejemplo {

        private String nombre;
        private int edad;
        private static int id = 1;
        private int idg;

    public ejemplo(String nombre, int edad) {

            this.nombre = nombre;
                this.edad = edad;
                idg=id;
                id++;

    }

    public String imprmir() {

        return "nombre " + nombre + "\n"
                + "edad" + edad + "\n"
                + "id" + idg;

    }
    
    ///////////////////////////////////////////METODO STATIC 
    
    // No trabaja  sobre  metodos 

}
