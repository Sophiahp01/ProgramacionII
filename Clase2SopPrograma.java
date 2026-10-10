/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2sop.programa;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class Clase2SopPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String miNombre="";
        int edad=0;
        String temp="";
        temp=JOptionPane.showInputDialog("Digite su edad");
        edad=Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, edad);
        
        if(edad>=18){
            JOptionPane.showMessageDialog(null,"Si puedes tomar y fumar");
        if (edad==18){
            JOptionPane.showMessageDialog(null,"Fijo va a ir de fiesta");
        }
        
        }else{
            JOptionPane.showMessageDialog(null, "vaya a misa");
        }
        if (18==18)
            JOptionPane.showMessageDialog(null, "Tiene apenas 18");
        JOptionPane.showMessageDialog(null, "esto siempre se va a imprimir");
    }
    
}
