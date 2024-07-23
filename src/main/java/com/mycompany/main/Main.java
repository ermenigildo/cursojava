/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        String nombre = "Ermenigildo";
        String apellido = "orbezo";
        String estadoCivil = "soltero";
        String pais = "Peru";
        int edad =17;
        boolean entrada = true;
        String datos = (nombre +" "+apellido);
        System.out.println("***********************************************");
        System.out.println("mi nobre completo es "+datos);
        //primera condicion
        if(estadoCivil.equalsIgnoreCase("soltero")){
            System.out.println("***********************************************");
            System.out.println("Udted es soltero");            
        }if(pais.equalsIgnoreCase("peru")){
            System.out.println("***********************************************");
            System.out.println("usted es peruano");
            System.out.println("***********************************************");
        }
        else{
            System.out.println("no cumple ninguno de los requisitos");
        }       
        //segunda condicion      
        if(estadoCivil.equalsIgnoreCase("soltero")&& pais.equalsIgnoreCase("peru")){
            System.out.println("usted cumple con los requisitos");        
        }else if (estadoCivil.equalsIgnoreCase("soltero")){
            System.out.println("ustes es soltero pero no es peruano");
        }else if(pais.equalsIgnoreCase("peru")){
            System.out.println("Usted es peruano pero no es soltero");            
        }
        else{
            System.out.println("No comple con los requisitos");
        }
        //terceta condicion
        if(edad>=18){
            System.out.println("Usted cumple con el segundo requisito de edad");
        }else{
            System.out.println("usted es menor de edad");
        }
        // mundo
        //cuerta condicion de edad
        if (edad>=18 && entrada==true){
            System.out.println("cumple con los requsitos de edad y tiene entrada");
        }else if(edad>=18){
            System.out.println("eres mayor de edad pero no tienes entrada");
        }else if(entrada == true){
            System.out.println("tienes entrada pero no eres mayor de edad");
        }else{
            System.out.println("no comples con el reuisito de edad");
        }
        
        
    }
}
