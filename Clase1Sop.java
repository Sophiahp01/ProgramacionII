/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1sop;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class Clase1Sop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String miNombre="Sophia";
        String miApellido="Herrera";
        int id=209010255;
        int idProfe;

        double salario;
        salario=400100.10;
        char unaLetra='S';
        
        JOptionPane.showMessageDialog(null, id);
        
        miNombre=JOptionPane.showInputDialog("Solicite el nombre");
        JOptionPane.showMessageDialog(null, miNombre);
        
        int edad=0;
        String edadTemporal="";
        edadTemporal=JOptionPane.showInputDialog("Digite la edad");
        edad=Integer.parseInt(edadTemporal);
        edad+=2;
        edadTemporal+=2;
        JOptionPane.showMessageDialog(null, "La edad string es" + edadTemporal + "\n" + "La edad numerica es" + edad);
        
        
                       
    }
    
}
