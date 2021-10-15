/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import aritmetica.Aritmetica;

/**
 *
 * @author Alumno mañana
 */
public class Test {
  
    
    public static void main (String[] args) {
        
        int res = 0;
        try {
            res = Aritmetica.division(10,0);
        
        } catch (Exception e) {
        e.printStackTrace(System.out);
        
        } finally{
            
            System.out.println("siempre estoy");
        }
        
        
        
        
    }
    
    
}
