/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.ui;

import java.util.Scanner;

/**
 *
 * @author JulianaAndrea
 */
public class UIMenu {
    
   public static void showMenu(){
        
        System.out.println("Welcome to my Appointments");
        System.out.println("Selecciona la opción deseada");
        
        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");
            
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            switch(response){
                case 1:
                    System.out.println("Doctor");
                case 2: 
                    response = 0;
                    showPatientMenu();
                    
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while(response!=0);
    }
        
   public static void showPatientMenu(){
     
        int response = 0;
        
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");
            
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());  
            
            switch (response){
                case 1: System.out.println("::Book an appointment");
                break;
                case 2: System.out.println("::My appointments");
                break;
                case 0:
                    showMenu();
                    break;
            }
           }while(response!=0);
    }
}
