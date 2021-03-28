package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*import model.ISchedulable;
import java.util.Date;
import model.AppointmentDoctor;
import model.Doctor;
import model.Patient;
import model.User;
*/
import static ui.UIMenu.showMenu;

/**
 *
 * @author JulianaAndrea
 */
public class Main {
    
    public static void main(String[] args) {
        
    /*  Doctor myDoctor = new Doctor("Juliana","juli@gmail.com");

       /* myDoctor.addAvailableAppointment(new Date(), "4:00 pm");
        myDoctor.addAvailableAppointment(new Date(), "10:00 am");
        myDoctor.addAvailableAppointment(new Date(), "1:00 pm");
       
            System.out.println(myDoctor);*/
        /*
            for (Doctor.AvailableAppointment AvAp: myDoctor.getAvailableApointment() ) {            
                System.out.println(AvAp.getDate() + " - " + AvAp.getTime());
            }*/

       /*modelo de polimorfismo
        User userD = new Doctor("Sergio","sergio@gmail.com");
        userD.showDataUser();
        User userP = new Patient("Lula","lula@gmail.com");
        userP.showDataUser();*/
        
        /*Clase anónima
        User user1 = new User("Carlos","carlos@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor \n\nHospital: Erasmo Meoz \nDepartamento:Geriatría");
            }
        }

        user1.showDataUser();

        ISchedulable iShedulable= new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };*/
        
        /*  System.out.println("----");
            System.out.println("");
            Patient patient = new Patient("Kevin","kevin@gmail.com");
            patient.setWeight(45.1);
            System.out.println(patient);*/
        
        /*     System.out.println(patient.getWeigth());
        patient.setPhoneNumber("12345678");
            System.out.println(patient.getPhoneNumber());*/
     
      showMenu();
    
    }
}
