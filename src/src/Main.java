/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import static src.ui.UIMenu.*;

/**
 *
 * @author JulianaAndrea
 */
public class Main {
    
    public static void main(String[] args) {
        
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();
        myDoctor.showId();
        
        Doctor myDoctorJuli = new Doctor();
        myDoctorJuli.showId();
        
        showMenu();
    }
}
