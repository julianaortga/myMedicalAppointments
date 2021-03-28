/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JulianaAndrea
 */
public class Doctor extends User{
    //Atributo
    private ArrayList<AvailableAppointment> availableApointments = new ArrayList<>();
    private String speciality;
        
    /*Doctor(){
    }*/
    
   public Doctor(String name, String email){
        super(name,email);
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
    public void addAvailableAppointment(String date, String time){
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

    @Override
    public void showDataUser() {
        System.out.println("Empleado del hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
    } 
    
    public static class AvailableAppointment{
    
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String date) {
            return this.date;
        }
        
        public String getDate(){
            return format.format(date);
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
