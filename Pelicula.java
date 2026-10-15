/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoclase4y5;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class Pelicula {
    public String nombre;
    public String genero;
    public Director director;
    public Actores actores;
    
    private int Idioma;
    private int duracionMinutos;
    
    /**
     * Esta clase es para guardar peliculas
     * 
     */
    public void showPelicula(){
        JOptionPane.showMessageDialog(null, "Muestre la Pelicula" + this.nombre);
    }
    /**
     * 
     *Return El devuelve la pelicula que va a poner 
     */
    public String playPelicula (){
        JOptionPane.showMessageDialog(null, "Play pelicula" + this.nombre);
        return this.nombre; 
    }
    /**
     * Este metodo muestra n cantidad de peliculas
     * @param cantidadPeliculas
     */
    public void siguientePelicula(int cantidadPeliculas){
        JOptionPane.showMessageDialog(null, "Muestra la cantidad" + cantidadPeliculas + "de peliculas");
    }
    
}
