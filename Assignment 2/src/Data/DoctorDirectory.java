/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Model.Doctor;
import java.util.ArrayList;

/**
 *
 * @author ruchi
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctors;

    public DoctorDirectory() {
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    
    
    public void removeDoctor(Doctor doctor){
        doctors.add(doctor);
    }


    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public Doctor searchUser(int txtId) {

        for (Doctor v : doctors) {
            System.out.println("doctor "+v.getId());
            if (v.getId() == txtId ) {
                System.out.println("doctor"+v.getFullName());
                return v;
            }
        }
        return null;
    }

    public void deleteDoctor(int id) {
        System.out.println("id "+id);
        
       for (Doctor p : doctors) {
            
            if (p.getId() == id ) {
                doctors.remove(p);
                return;
            }
        }
    }
    
}
