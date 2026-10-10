/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forwhiledo;

/**
 *
 * @author fapis
 */
public class ForWhileDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1; i<=10;i++){
            System.out.println("for "+i);
        }
        int i=1;
        while (i<=10){
            System.out.println("while "+i);
            i++;
        }
        i=1;
        do{
            System.out.println("do "+i);
            i++;
        } while (i<=10);
        
    }
    
}
