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
public class Patient extends User {
    //Atributos
    private String  birthday, boold;
    private double weight, height;
    
    Patient(String name, String email){
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

    public String getBoold() {
        return boold;
    }

    public void setBoold(String boold) {
        this.boold = boold;
    }   
    
}
