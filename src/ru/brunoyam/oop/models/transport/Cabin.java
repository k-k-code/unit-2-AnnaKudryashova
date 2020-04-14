package ru.brunoyam.oop.models.transport;

import java.util.Arrays;

public class Cabin extends Ship {
    int seatsCabinNumber; // к-во мест в каюте
    String comfortClass; // класс комфорта
    Passenger[] shipPassengers = new Passenger[3]; // массив пассажиров с билетом на корабль

    public Cabin(int travelTime, int seatsNumber, int cost, Cabin[] cabins, int seatsCabinNumber,
                 String comfortClass, Passenger[] shipPassengers) {
        super(travelTime, seatsNumber, cost, cabins);
        this.seatsCabinNumber = seatsCabinNumber;
        this.comfortClass = comfortClass;
        this.shipPassengers = shipPassengers;
    }

    @Override
    public String toString() {
        String shipDescription = super.toString() + "particular: ";
        return shipDescription + "Cabin{" +
                "seatsCabinNumber=" + seatsCabinNumber +
                ", comfortClass='" + comfortClass + '\'' +
                ", shipPassengers=" + Arrays.toString(shipPassengers) +
                '}';
    }
}