/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_herrada;

import java.util.Scanner;

/**
 *
 * @author herra
 */
public class TP1_manipNombresInt_HERRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a;
    int b;
    double c=1.0;
    int add;
    int diff;
    int prod;
    double div;
    double quot;
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Choisissez un nombre");
    a=sc.nextInt();
    System.out.println("Choisissez encore un nombre");
    b=sc.nextInt();
    System.out.println("vos deux nombres sont "+a +" et "+b +"");
    add=a+b;
    diff=a-b;
    prod=a*b;
    div=(a*c)/b;
    quot=(a*c)%b;
   
    System.out.println("la somme de vos nombres est "+add +" la difference est "+diff +" le produit est "+prod +"");
    System.out.println("" +"la division de ces nombres est "+div +" le reste de cette division est "+quot);
    }
    
}
