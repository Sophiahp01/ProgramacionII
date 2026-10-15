
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author fapis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion dueles = new Cancion();
        dueles.nombre="Dueles";
        dueles.playCancion();
        ArtistaBanda artistaBanda = new ArtistaBanda();
        artistaBanda.nombre = "jesse y Joy"; 
        artistaBanda.genero = "Pop";
        artistaBanda.fechaCreacion =2010;
        dueles.artistaBanda=artistaBanda;
        Cancion cancion2 = new Cancion();
        cancion2.nombre="Corre!";
        cancion2.artistaBanda=artistaBanda;
        
        // Imprime el genero del artista que tiene la cancion dueles
        JOptionPane.showMessageDialog(null, dueles.artistaBanda.genero);
        
        
        cancion2.siguientesCanciones(2);
        String cualCancionSuena="";
        cualCancionSuena=cancion2.playCancion();
        
        JOptionPane.showMessageDialog(null, "AMO ESTA CANCION"+ cualCancionSuena);
        
        }
       
}
