package Model;

import Data.EncounterHistory;

public class Patient extends Person{
    
    private EncounterHistory encounterHistory;

    public Patient(String fullName, House residence, String gender,  int id, Encounter en) {
        super(fullName, residence, gender, id);
        
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
