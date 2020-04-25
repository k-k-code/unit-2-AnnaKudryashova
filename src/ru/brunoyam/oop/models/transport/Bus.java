package ru.brunoyam.oop.models.transport;
import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

/**
 * Автобус прикрепленный к определенному маршруту.
 */
public class Bus extends Transport {

    private boolean hasToilet;
    private int stopsNumber;
    private int seatsNumber;
    private Passenger[] passengers = new Passenger[seatsNumber];

    public Bus(boolean hasToilet, int stopsNumber,
               int travelTime, int seatsNumber, int cost) {
        super(travelTime, seatsNumber, cost);
        this.hasToilet = hasToilet;
        this.stopsNumber = stopsNumber;
    }
    public boolean saleTicket(int seat, Passenger passenger) {
        for(int i=0; i < passengers.length; i++){
            if((passengers[i] == null) && (seat > 0 && seat < seatsNumber)) {
                passengers[i] = passenger;
                return true;
            }
        }
        return false;
    }

    public boolean isHasToilet() {
        return hasToilet;
    }
       public int getStopsNumber() {
        return stopsNumber;
    }
        public Passenger[] getPassengers() {
        return passengers;
    }

    @Override
    public int getSeatsNumber() {
        return seatsNumber;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "SeatsNumber=" + getSeatsNumber() +
                ", hasToilet=" + isHasToilet() +
                ", passengers=" + Arrays.toString(passengers) +
                ", cost=" + getCost() +
                '}';
    }
}