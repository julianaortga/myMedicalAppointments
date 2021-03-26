/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JulianaAndrea
 */
public class Doctor extends User{
    //Atributo
    private String speciality;
        
    /*Doctor(){
    }*/
    
   public Doctor(String name, String email){
        super(name,email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
    
    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointment.toString();
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

        @Override
        public String toString() {
            return "AvailableAppointment \nDate: " + date + "\nTime: " + time;
        }     
        
    }

    
}
