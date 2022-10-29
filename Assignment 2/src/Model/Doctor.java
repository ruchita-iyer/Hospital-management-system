/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ruchi
 */
public class Doctor {
    
    private String fullName;
    private House residence;
    private String gender;
    //private Date dob;
    private int id;

    public Doctor(String fullName,
            House residence,
            String gender,
            //Date dob,
            int id) {

        this.fullName = fullName;
        this.residence = residence;
        this.gender = gender;
        //this.dob = dob;
        this.id = id;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /*public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
