/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_herrada;

/**
 *
 * @author herra
 */
public class Convertisseur {
    int nbConversions = 0;
    
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
   @Override 
public String toString () { 
return "nb de conversions"+ nbConversions; 
} 
    
}
