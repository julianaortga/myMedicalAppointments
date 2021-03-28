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
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointment");
            System.out.println("0. Logout");
            
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());  

            switch(response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointment();
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
                
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointment.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    
                    doctors.put(Integer.valueOf(k), doctorAppointment);
                }
            }
            
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.parseInt(sc.nextLine());
            
            Map<Integer,Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");
            
            //Obtener los datos confirmados
            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            
            System.out.println(doctorSelected.getName() 
                    + ". Date: "
                    + doctorSelected.getAvailableApointment().get(indexDate).getDate()
                    + ".  Time: " 
                    + doctorSelected.getAvailableApointment().get(indexDate).getTime());
        
            //Confirmar respuesta        
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());
            
            if(response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(doctorSelected, 
                        doctorSelected.getAvailableApointment().get(indexDate).getDate(null), 
                        doctorSelected.getAvailableApointment().get(indexDate).getTime());
                showPatientMenu();
            }
        }while(response!=0);
    }

    private static void showPatientMyAppointment(){
        int response = 0;
        
        do{
            System.out.println("::My Appointments::");
            if(UIMenu.patientLogged.getAppointmentDoctors().size()==0){
                System.out.println("Don't have appointments");
                break;
            }
            
            for(int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size();i++){
              int j = i+1;
                System.out.println(j +". " +
                       "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()+
                       "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime()+
                       "\nDoctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }
            
            System.out.println("0. Return");
        }while(response!=0);
    }
}
