/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgg.calculohipotenusa;

import javax.swing.JOptionPane;

/**
 * Este programa calcula la hipotenusa de un triángulo rectángulo 
 * @author sandr
 */
public class Main {
    
    public static void main(String [] args) {
    
        // Declaro e inicializo las variables. 
        double ladoA = 0;
        double ladoB = 0;
        double hipotenusa = 0;
        
        // Le pido al usuario los datos por pantalla.
        ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, 
                                               "¿Cuánto mide el primer lado? "));
        ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, 
                                               "¿Cuánto mide el segundo lado? "));
        
        // Realizo la operación, copio las dos formas posibles
        // Más sencilla
        //hipotenusa = (ladoA * ladoA)+ (ladoB * ladoB);
        //hipotenusa = Math.sqrt(hipotenusa);
        // Mejor expresada
        hipotenusa = Math.sqrt(Math.pow(ladoA,2) + Math.pow(ladoB,2));
        // Enseño por pantalla el total
        System.out.println(hipotenusa);
    }
}
