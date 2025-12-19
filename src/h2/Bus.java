package h2;

import java.util.ArrayList;

public class Bus {
    public ArrayList<Passenger> passengers;
    public Bus() {
        passengers = new ArrayList<Passenger>();
    }
    public void enterBus(Passenger p) {
        passengers.add(p);
    }
    private void exitBus() {
        for (int i = passengers.size() - 1; i >= 0; i--) {
            Passenger p = passengers.get(i);
            if (p.visited == p.planned) {
                passengers.remove(i);
            }
        }
    }
    public void nextStop(Passenger[] boarding) {
        for (int i = 0; i < passengers.size(); i++) {
            passengers.get(i).visited++;
        }
        exitBus();
        for (int i = 0; i < boarding.length; i++) {
            passengers.add(boarding[i]);
        }
    }
    public void nextStop() {
        Passenger[] boarding = new Passenger[0];
        nextStop(boarding);
    }
    public ArrayList<Passenger> findPassengersWithoutTickets() {
        ArrayList<Passenger> passengersWithoutTickets = new ArrayList<Passenger>();
        for (int i = passengers.size() - 1; i >= 0; i--) {
            Passenger p = passengers.get(i);
            if (!p.ticket) {
                passengersWithoutTickets.add(0, p);
                passengers.remove(i);
            }
        }
        return passengersWithoutTickets;
    }
    public void transferPassengers(Bus otherBus, String[] passengerNames) {
        int otherBusSize = otherBus.passengers.size();
        for (int i = 0; i < passengerNames.length; i++) {
            for (int j = passengers.size() - 1; j >= 0; j--) {
                Passenger p = passengers.get(j);
                if (p.name == passengerNames[i]) {
                    otherBus.passengers.add(otherBusSize, p);
                    passengers.remove(j);
                }
            }
        }
    }
}
