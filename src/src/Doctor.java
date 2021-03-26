/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JulianaAndrea
 */
public class Doctor {
    static int id = 0;//autoincrement
    private String name;
    private String speciality;
        
    Doctor(){
    }
    
    Doctor(String name, String speciality){
 
        this.name = name;
        this.speciality= speciality;
        id++;
    }
    //comportamientos
    public void showName(){
        System.out.println(name);
    }
    
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
    
    //Citas del doctor
    ArrayList<AvailableAppointment>availableAppointment = new ArrayList();
    
    //Añadir nueva cita del doctor
    public void addAvailableAppointment(Date date, String time){
      this.availableAppointment.add(new AvailableAppointment(date, time));
    }
    
    //Devolver la lista completa de citas
    public ArrayList<AvailableAppointment> getAvailableApointment (){
        return this.availableAppointment;
    }
    
    public static class AvailableAppointment{
    
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
        
        
    }
}
