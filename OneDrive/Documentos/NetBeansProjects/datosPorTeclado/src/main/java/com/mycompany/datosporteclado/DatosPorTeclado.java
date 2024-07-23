/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datosporteclado;

import java.util.Scanner;





/**
 *
 * @author usuario
 */
public class DatosPorTeclado {

    public static void main(String[] args) {
        //programa para calcular promedio de notas
        Scanner scanner =new Scanner(System.in);
        System.out.print("Ingres la primera nota :");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ingres la segunda nota :");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Ingres la tercera nota :");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Ingres la cuarta nota :");
        double nota4 = scanner.nextDouble();
        
        double promedio = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Su promedio de nota es :"+ promedio);
        
        if(promedio<=10){
            System.out.println("desaprobado");
        }else if(promedio>=11&& promedio<=12){
            System.out.println("requiere recuperacion");
        }else if(promedio>=13 && promedio<=15){
            System.out.println("Aprobado");
        }else if(promedio>=16 && promedio<=18){
            System.out.println(" muy buena aprobacion");
        }else if(promedio>=19 && promedio<=20){
            System.out.println("exelente aprobaste con diploma");
        }
        
    }
}
