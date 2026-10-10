/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia=0;
        String templ="";
        
        templ=JOptionPane.showInputDialog("Digite el dia de la semana");
        dia=Integer.parseInt(templ);
        
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
                 break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
                 break;
        
            case 8:
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "Dia virtual");
            default:
                JOptionPane.showMessageDialog(null, "Dia incorrecto");
        }
                
    }
    
}
