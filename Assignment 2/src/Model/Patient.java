/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Data.EncounterHistory;

/**
 *
 * @author ruchi
 */
public class Patient {
    private EncounterHistory encounterHistory;

    public Patient(String fullName, House residence, String gender, String dob, int id, Encounter en) {
        super(fullName, residence, gender, dob, id);
        
        this.encounterHistory = new EncounterHistory();
        this.encounterHistory.addEncounter(en);
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory eh) {
        this.encounterHistory = eh;
    }
}
