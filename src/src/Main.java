/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.util.Date;
import static src.ui.UIMenu.*;

/**
 *
 * @author JulianaAndrea
 */
public class Main {
    
    public static void main(String[] args) {
        
    Doctor myDoctor = new Doctor("Juliana","Psicología");
    
    myDoctor.addAvailableAppointment(new Date(), "4:00 pm");
    myDoctor.addAvailableAppointment(new Date(), "10:00 am");
    myDoctor.addAvailableAppointment(new Date(), "1:00 pm");
    
    
        for (Doctor.AvailableAppointment AvAp: myDoctor.getAvailableApointment() ) {            
            System.out.println(AvAp.getDate() + " - " + AvAp.getTime());
        }
    
        System.out.println("");
        System.out.println("");
        Patient patient = new Patient("Kevin","kevin@gmail.com");
        patient.setWeight(45.1);
        System.out.println(patient);
    
    /*     System.out.println(patient.getWeigth());
    patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
    //showMenu();
    */
    }
}
