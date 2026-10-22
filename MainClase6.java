/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.clase6;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class MainClase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setBin(123123123);
        c1.setPlaca("SOLO");
        
        c1.setEstado(EstadoCarro.buscaMateriales);
        
        JOptionPane.showMessageDialog(null, c1.getPlaca());
        JOptionPane.showMessageDialog(null, c1.toString());
        
        Carro c2=new Carro("BMW", "X6", "AS20", 3000, new Date(),true);
        JOptionPane.showMessageDialog(null, c2.toString());
        
        Dueno Juan=new Dueno();
        JOptionPane.showMessageDialog(null, Juan.toString());
        JOptionPane.showMessageDialog(null, Carro.iniciaPlaca);
                
    }
    
}
