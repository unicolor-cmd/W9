package h1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrioListe {
    ArrayList<Patient> myList = new ArrayList<Patient>();
    public void addPatient(Patient p) {
        int i = 0;
        while (myList.size() > i && myList.get(i).prio <= p.prio) {
            i++;
        }
        myList.add(i, p);
    }
    public Patient getNextPatient() {
        return myList.remove(0);
    }
    public int getPosition(Patient p) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == p) {
                return i;
            }
        }
        return -1;
    }
}
