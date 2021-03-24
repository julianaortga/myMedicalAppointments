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
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    
    Doctor(String name){
        System.out.println("El nombre del doctor es: " + name);
    }
    //comportamientos
    public void showName(){
        System.out.println(name);
    }
    
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
}
