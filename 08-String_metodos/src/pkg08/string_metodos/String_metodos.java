package pkg08.string_metodos;

public class String_metodos {

    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////////////////METODOS  STRING
        //Defimos una varible  para  almacenar un  texto
        String texto = "Navigate your code with ease. Click on function and method calls to jump to their definitions or references in the same repository";

        //Con    texto.length()   podemos  visializar la  cantidad  de letras que hay en el  texto  
        System.out.println("cantidad letras" + texto.length());
        
        //Con     texto.charAt(0) visulizamos una letra en una prosicion en especifico

        System.out.println("Una letra en espcifico  "+texto.charAt(0));
        
        
        //Traer un rango  de  texto  
        
        
        System.out.println("Rango de letras"+texto.subSequence(1, 15));
    
         
        //visualizar la ultima letra 
        
        int ultima_letra;
        
        
        //Realizamos  la asignacion de una varible  para asignarle  el ultima letra  con  texto.length();
        ultima_letra=texto.length();
        
        
        /* ultima  letra  con  texto.charAt(ultima_letra-1)  imprimime la  ultima  letra del texto  con la  informacion que  le  
        proporciona le  exto.lenght y lo que  hacemos  con el texto.charAt() es  visualizar la ultima letra  ultima_letra-1 lo que hace
        es disminuirle a la posicion ultima del length  un -1 porque el rango comienza desde  cero por ejemplo hola el metodo 
        lenth  visualiza  cantidad  de  letras  y trae un 4 la si se imprime 4 no hay ninguna letra en esa posicion  porque comienza desde  
        0 por  utlizamos (-1) para  po  r  ir  la  posicion ultima del  nombre  que  esta  ubicada  en 3 por que  comienza desde  cero
        */
        
        System.out.println("ultima  Letra"+texto.charAt(ultima_letra-1));
        
        
        
    }

}
