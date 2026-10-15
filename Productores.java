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
public class Productores {
    public String nombre;
    private int peliculasHechas;
    
    public void producir(){
        JOptionPane.showMessageDialog(null, "El productor "+ this.nombre + "Produce");
        
    }
}
