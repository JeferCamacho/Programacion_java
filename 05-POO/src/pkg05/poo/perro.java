package pkg05.poo;

public class perro {
    
    private String hola;
    

    private String colorPerro;
    private int anos_tiene;
    private String Emfermo;
    private String color_ojos;

    public void colorperr(String colorPerro) {

        this.colorPerro = colorPerro;

    }

    public void anosperr(int anos_tiene) {
        
       this.anos_tiene=anos_tiene;
       

    }
    
    public void emfer(String enfermo){
        
      this.Emfermo=enfermo;
        
    }
    
    
    public void coloreyes(String color_ojos){
        
        
        this.color_ojos=color_ojos;
        
    }

    public String imprimir() {

        return "color Perro-------" + colorPerro+ "\n"+
                "años perro----------"+anos_tiene+ "\n"+
                "ha Estado Emfermo----"+Emfermo+ "\n"+
                "Color Ojos ----------"+color_ojos;
        

    }
    
    
    

           

}
