/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author fapis
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes = 0;
        String templ="";
        templ=JOptionPane.showInputDialog("Digite el mes");
        mes=Integer.parseInt(templ);
           
        
        switch (mes) {
            case 2:
                System.out.println("Este mes tiene 28/29 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes tiene 30 dias");
                break;
               
            default:
                System.out.println("Este mes tiene 31 dias");
                break;
                
        }
    }
    
}
