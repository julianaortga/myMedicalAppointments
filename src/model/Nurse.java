/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JulianaAndrea
 */
public class Nurse extends User {
   private String speciality;
    
    public Nurse(String name, String email){
        super(name,email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del hospital: Cruz verde");
        System.out.println("Departamento: Oncología, pediatría, nutrición");
    }
    
}
