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
public class Patient {
    
    int id;
    private String name, email, address, phoneNumber, birthday, boold;
    private double weight, height;
    
    Patient(String name, String email){
        this.name = name;
        this.email = email;
        this.weight = 46.3;
    }
    
}
