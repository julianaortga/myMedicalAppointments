/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author JulianaAndrea
 */
public class UIDoctorMenu {
    
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();   
    
    public static void showDoctorMenu(){
        
        int response = 0;
        
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available Appointment");
            System.out.println("2. My Scheduled Appointments");
            System.out.println("0. Logout");
            
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());  

            switch(response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                    
            }
                
        }while(response != 0);
    }
    
    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        
        do{
            System.out.println("");
            System.out.println("--- Add Available Appointment --");
            System.out.println(":: Select a Month");
            
            for (int i = 0; i < 3; i++) {
                int a = i + 1;
                System.out.println(a + ". " + UIMenu.MONTHS[i]);
                
            }
            System.out.println("0. Return");
            
             Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());  
            
            if(response > 0 && response < 4){
            int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);
                
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();
                
                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");
                
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2)continue;//No se sale del siglo, vuelve a iniciar desde donde se quedo
                
                int responseTime = 0;
                String time = "";
                
                do{
                    System.out.println("Insert the time available for date: " +  date);
                    time = sc.nextLine();
                    
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());
                    
                }while(response == 2);
                
                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);
                
            }else if (response == 0){
            showDoctorMenu();
            }
        
        }while(response!=0);
    }
    
    private static void checkDoctorAvailableAppointments(Doctor doctor){
        
        if(doctor.getAvailableApointment().size()> 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
