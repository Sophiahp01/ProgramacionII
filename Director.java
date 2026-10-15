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
public class Director {
    public String nombre;
    private int peliculasDirigidas;
    
    public void dirigir(){
        JOptionPane.showMessageDialog(null, "El director" + this.nombre + "Dirige");
        
    }
    
}
