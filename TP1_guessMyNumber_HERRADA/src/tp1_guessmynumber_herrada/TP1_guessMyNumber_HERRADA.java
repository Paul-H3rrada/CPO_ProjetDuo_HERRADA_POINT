/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_herrada;

import java.util.Random;

/**
 *
 * @author herra
 */
public class TP1_guessMyNumber_HERRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random generateurAleat = new Random(); 
    int n = generateurAleat.nextInt(100); 
    int m = generateurAleat.nextInt(100); 
    int w = generateurAleat.nextInt(100); 
    int x = generateurAleat.nextInt(100); 
    int c = generateurAleat.nextInt(100); 
    System.out.println(""+n +"; "+m +"; "+w +"; "+x +"; "+c +"");
    
    }
    
}
