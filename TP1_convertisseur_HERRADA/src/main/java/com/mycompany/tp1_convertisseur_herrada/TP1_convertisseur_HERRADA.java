/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp1_convertisseur_herrada;

import static com.mycompany.tp1_convertisseur_herrada.TP1_convertisseur_HERRADA.CelciusVersKelvin;
import java.util.Scanner;

/**
 *
 * @author herra
 */
public class TP1_convertisseur_HERRADA {

    public static double CelciusVersKelvin (double tCelcius) { 
    return(tCelcius + 273.15);
    } 
     public static double KelvinVersCelcius (double tCelcius) { 
    return(tCelcius - 273.15);
    } 
     public static double FarenheitVersCelcius (double tCelcius) { 
    return(tCelcius-32)/1.8;
    } 
     public static double CelciusVersFarenheit (double tCelcius) { 
    return(tCelcius*1.8)+32;
    } 
     public static double KelvinVersFarenheit (double tCelcius) { 
    return(tCelcius-273.15)*1.8+32;
    } 
     public static double FarenheitVersKelvin (double tCelcius) { 
    return(tCelcius-32)/1.8+273.15;
    } 
    
    public static void main(String[] args) {
    double nbr,result = 0;
    double CK,KC,FC,CF,KF,FK;
    int calcul;
    
  
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Bonjour, saisissez une valeur :");
    nbr=sc.nextDouble();
    System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n1) De Celvius à Kelvin \n2) De Kelvin à Celcius \n3) De Farenheit à Celcius\n4) De Celcius à Farenheit\n5) De Kelvin à Farenheit\n6) De Farenheit à Kelvin");
    calcul=sc.nextInt();
    if (calcul < 1 || calcul > 6) {
            System.out.println("Erreur : La valeur doit être comprise entre 1 et 6.");
    System.exit(0);    
    }
    
     CK=CelciusVersKelvin(nbr);
     KC=KelvinVersCelcius(nbr);
     FC=FarenheitVersCelcius(nbr);
     CF=CelciusVersFarenheit(nbr);
     KF=KelvinVersFarenheit(nbr);
     FK= FarenheitVersKelvin(nbr);
     
      switch(calcul) {
     case 1: 
            result=CK;
            break;
     case 2:    
         result=KC;
         break;
     case 3:
         result=FC;
         break;
     case 4:
         result=CF;
         break;
     case 5:
         result=KF;
         break;
     case 6:
         result=FK;
         break;
     default:
         break;
    }
    System.out.println("Ceci nous donne un résultat  de "+result +", avec initalement "+nbr +"");
    
   
    }

}