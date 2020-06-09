package pkg05.poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class prueba {

    private String nombre;
    private String apellido;
    private Date tiempo;
    private int dia;
    private int mes;
    private int year;
    private int edad;
    private double  aumento;
    private int  sueldo;

    public prueba(String nombre, String apellido, int dia, int mes, int year, int edad,int  sueldo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.tiempo = tiempo;
        GregorianCalendar fecha = new GregorianCalendar(dia, mes, year);
        tiempo = fecha.getTime();
        this.edad=edad;
        this.sueldo=sueldo;
        
   
        
    }
    
    
    
    public String nombre(){
        
        
        
        return nombre;
    }

    public String apellido() {
        
        
        return apellido;
   
        
    }
    
    
    public Date fecha(){
        
        
        return tiempo;
        
    }
    
    
    public int edad(){
        
        return edad;
        
        
    }
    
    public double sueldo(){
        
       return sueldo;
        
    }
    
    public  void Aumen(int aumento){
        
        sueldo=sueldo*(aumento/100);
        
        
        
    }
    
    public  double aumento(){
        
        
        return sueldo;
    }
    
    

}
