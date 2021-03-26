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
public class Patient extends User {
    //Atributos
    private String  birthday, blood;
    private double weight, height;
    
    public Patient(String name, String email){
        super(name,email);
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public String getWeigth(){
        return this.weight+" kg";
    }
    
      public String getHeight() {
        return height+ " kg";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }   

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + weight +
                "\nHeight: " + height + "\nBlood: " + blood;
    }
         
}
