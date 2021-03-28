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
public abstract class User {
    private int id;
    private String name, email, address, phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("El número telefónico debe ser máximo de 8 dígitos");
        }else if (phoneNumber.length() == 8){
        this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", Email: " + email +
                "\nAddress: " + address + ". Phone: " + phoneNumber ;
    }        
    
    //método abstracto
    public abstract void showDataUser();
   
    
}
