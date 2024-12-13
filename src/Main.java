package logica;
import GUI.Pantalla;

public class Main {
    public static void main(String[] args) {
        
        Pantalla panta = new Pantalla();
        panta.setVisible(true);        
        panta.setLocationRelativeTo(null); 
        
        Pelicula pelicula = new Pelicula ("Cuestión de tiempo", 2013);
        Actor actor = new Actor ("Domhnall", "Gleeson", 41, 2);
        Director director = new Director ("Richard", "Whalley", 68, 1);
    }
}
