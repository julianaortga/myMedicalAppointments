/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author JulianaAndrea
 */
public class Doctor {
    static int id = 0;//autoincrement
    String name;
    String speciality;
    
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
}
