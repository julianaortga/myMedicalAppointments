/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import model.Doctor;

/**
 *
 * @author JulianaAndrea
 */
public class UIPatientMenu {
    
    public static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointment");
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
        }while(response!=0);
        
    }
    private static void showBookAppointmentMenu(){
        int response = 0;
        do{
            System.out.println("--- Book an apointment ---");
            System.out.println("::Select date");
            //Numeración de la lista de fechas
            //Indice de la fecha selecionada
            //[doctors]
            //1.- doctor1
                // - 1 fecha1
                // - 2 fecha2
            //2.- doctor2
            Map<Integer, Map<Integer,Doctor>> doctors = new TreeMap<>();
            
            int k =0;
            //Mostrar la lista de fechas disponibles
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments 
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableApointment();
                Map<Integer,Doctor> doctorAppointment = new TreeMap<>();
                
                for (int j = 0; availableAppointments.size() < 10; j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointment.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    
                    doctors.put(Integer.valueOf(k), doctorAppointment);
                }
            }
            
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.parseInt(sc.nextLine());
            
            
        }while(response!=0);
    }
}
