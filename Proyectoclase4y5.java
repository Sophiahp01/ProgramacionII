/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoclase4y5;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class Proyectoclase4y5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instanciar 1 Director 
        Director directorUnico = new Director();
        directorUnico.nombre = "Christopher Nolan";

        // Instanciar 4 Actores diferentes
        Actores actor1 = new Actores();
        actor1.nombre = "Chris Evans";
        
        Actores actor2 = new Actores();
        actor2.nombre = "Andrew Garfield";

        Actores actor3 = new Actores();
        actor3.nombre = "Tom Cruise";

        Actores actor4 = new Actores();
        actor4.nombre = "Tom Felton";

        // Instanciar 1 Productora
        Productores productora = new Productores();
        productora.nombre = "Warner Bros";

        // Instanciar 2 Películas diferentes y asignarles el mismo director
        Pelicula pelicula1 = new Pelicula();
        pelicula1.nombre = "Inception";
        pelicula1.genero = "Ciencia Ficción";
        pelicula1.director = directorUnico;
        pelicula1.actores = actor1;

        Pelicula pelicula2 = new Pelicula();
        pelicula2.nombre = "Oppenheimer";
        pelicula2.genero = "Historia/Drama";
        pelicula2.director = directorUnico; 
        pelicula2.actores = actor2;

        // Utilizar métodos 
        productora.producir();
        directorUnico.dirigir();
        
        actor1.actuar();
        actor2.actuar();
        actor3.actuar();
        actor4.actuar();

        pelicula1.showPelicula();
        pelicula1.playPelicula();

        pelicula2.showPelicula();
        pelicula2.playPelicula();
        
    }
    
}
