package ru.brunoyam.oop.models.transport;

public class Ship extends Transport {
    Cabin[] cabins = new Cabin[10]; // массив кают
    public Cabin[] getCabin() {
        return cabins;
    }
    public Ship(int travelTime, int seatsNumber, int cost,
     Cabin[]cabins) {
        super(travelTime, seatsNumber, cost);
        this.cabins = cabins;
    }

}
