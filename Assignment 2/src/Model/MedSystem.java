package Model;

import Data.DoctorDirectory;
import Data.PatientDirectory;
import Data.PersonDirectory;

public class MedSystem {
    
    private PatientDirectory patientList;
    private PersonDirectory personList;
    private DoctorDirectory doctorList;
    private City city;
    
    public MedSystem(){
        personList = new PersonDirectory();
        patientList  = new PatientDirectory();
        doctorList  = new DoctorDirectory();
    }    
    
    public void addPerson(Person p){
        personList.addPerson(p);
    }
    public PersonDirectory getPersonList() {
        return personList;
    }
    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }
    public void deletePerson(int id) {
        personList.deletePerson(id);
    }
    
    

    public void addPatient(Patient pat){
        patientList.addPatients(pat);
    }
    public PatientDirectory getPatientList() {
        return patientList;
    }
    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }
    public void deletePatient(int id) {
        patientList.deletePatient(id);
    }
    
    

    public void addDoctor(Doctor doc){
        doctorList.addDoctor(doc);
    }
    public DoctorDirectory getDoctorList() {
        return doctorList;
    }
    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }
    public void deleteDoctor(int id) {
        doctorList.deleteDoctor(id);
    }
    
    
    
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    

    public Person searchUser(int txtId) {
        System.out.println("idid:"+txtId);
        return personList.searchUser(txtId);
    }

    public void encounterPatient(int id, Encounter enc) {
        patientList.encounterPatient(id, enc);
    }   
    
    public Patient searcPatient(int txtId) {
        return patientList.searcPatient(txtId);
    }   

}
