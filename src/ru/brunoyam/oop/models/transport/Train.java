package ru.brunoyam.oop.models.transport;

public class Train extends Transport {
    Compartment[] compartments = new Compartment[10]; // массив купе

    public Compartment[] getCompartment() {
        return compartments;
    }

    public Train(int travelTime, int seatsNumber,
                 int cost, Compartment[] compartments) {
        super(travelTime, seatsNumber, cost);
        this.compartments = compartments;
    }
}