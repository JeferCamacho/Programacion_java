
package pkg05.poo;

import javax.swing.JOptionPane;




public class pruebaMain {
    
    
    
    public static void main(String[] args) {
// 
    
        prueba empleado1= new prueba("jefersson", "camacho", 11, 5, 1999, 23,23444);
        prueba empleado2= new prueba("jefersson", "camacho", 11, 5, 1999, 23,2344);
        prueba empleado3= new prueba("jefersson", "camacho", 11, 5, 1999, 23,2344);
        
        
        
        empleado1.Aumen(5);
        empleado2.Aumen(5);
        empleado3.Aumen(5);
        
        
        JOptionPane.showMessageDialog(null, "nombre......."+empleado1.nombre()+"\n"+
                "apellido........."+empleado1.apellido()+"\n"+
                "fecha........."+empleado1.fecha()+"\n"+
                "edad.........."+empleado1.edad()+"\n"+
                "sueldo........."+empleado1.aumento());
    




        
        
        
      
        
        
        
        
        
        
    }
    

    

  
     
    
    
    
    
    
    
    
}
