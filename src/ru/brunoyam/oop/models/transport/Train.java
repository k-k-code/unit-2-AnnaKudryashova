package ru.brunoyam.oop.models.transport;
import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Train extends Transport {
    private Compartment[] compartments = {new Compartment(CompartmentType.STANDARD), new Compartment(CompartmentType.SV), new Compartment(CompartmentType.LUX)}; // массив купе

    public Train(int travelTime, int seatsNumber, int cost) {
        super(travelTime, seatsNumber, cost);
    }
    public boolean saleTicket(int compartmentNumber, Passenger passenger) {
        if (compartmentNumber < 0 || compartmentNumber >= compartments.length) {
            return false;
        } else {
            return compartments[compartmentNumber].placePassenger(passenger);
        }
    }
    public Compartment[] getCompartments() {return compartments;}
    @Override
    public String toString() {
        return "Train {" +
                Arrays.toString(compartments) +
                '}';
    }
}