
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fapis
 */
public class Cancion {
    public String nombre;
    private int duracionSegundos;
    public ArtistaBanda artistaBanda;
    public Disco disco1;
    private Disco disco2;
    private Disco disco3;
    private Disco disco4;
    private Disco disco5;
    
    /**
     * Esta clase es para guardar musica
     * 
     */
    public void stopCancion(){
        JOptionPane.showMessageDialog(null, "Pare la MUSICA");
    }
    /**
     * 
     *Return El devuelve la cancion que va a reproducir
     */
    public String playCancion (){
        JOptionPane.showMessageDialog(null, "Play cancion"+ this.nombre);
        return this.nombre; 
    }
    /**
     * Este metodo adelanta n cantidad de canciones
     * @param cantidadCanciones esta es la cantidad de canciones arriba de 1 y maximo 
     */
    public void siguientesCanciones(int cantidadCanciones){
        JOptionPane.showMessageDialog(null, "Adelanta maximo"+ cantidadCanciones+ "de canciones");
    }
    
}
