/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="Sophia";
        String variableTemporal= "";
        int peso=0;
        
       
        
        nombre=JOptionPane.showInputDialog("Dime tu nombre");
        JOptionPane.showConfirmDialog(null, "Este es el nombre solicitado" + nombre);
        
        variableTemporal=JOptionPane.showInputDialog("Dime tu peso");
        peso=Integer.parseInt(variableTemporal);
        peso=peso-5;
        JOptionPane.showConfirmDialog(null,"Mi peso es" + peso);
        
        
        
        
                
    }
    
}
