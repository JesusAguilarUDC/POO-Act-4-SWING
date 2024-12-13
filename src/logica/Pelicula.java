package logica;

public class Pelicula{
    private String nombre;
    private int fechaPubli;
   
    //Constructor
    public Pelicula(String nombre, int fechaPubli){
        this.nombre = nombre;
        this.fechaPubli = fechaPubli;
    }  
    
    //Metodos
    public String getNombre(){
        return nombre;
    }
    
    public int getFechaPubli(){
        return fechaPubli;
    }
    
}
