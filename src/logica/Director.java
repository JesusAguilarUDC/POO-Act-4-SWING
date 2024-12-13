package logica;

public class Director {
    private String nombre;
    private String apellido;
    private int edad;
    private int premio;
    
    //Constructor
    public Director(String nombre, String apellido, int edad, int premio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.premio = premio;
    }
    
    //Metodos
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getPremio() {
        return premio;
    }
    
    public void infoDirector(){
       System.out.println("Hola, soy" + nombre + apellido + ", tengo" + edad + "años,y por el momento tengo" + premio + "pemios");
    }
}
