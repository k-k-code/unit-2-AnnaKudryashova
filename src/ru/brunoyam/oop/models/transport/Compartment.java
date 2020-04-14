package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.Appilcation;

import java.util.Arrays;

public class Compartment extends Train {
    private int berthNumber; //к-во мест в купе
    private String comfortClass; // класс комфорта
    Passenger[] trainPassengers = new Passenger[2]; //массив пассажиров,купивших билет на поезд


    public Compartment(int travelTime, int seatsNumber,
                       int cost, Compartment[] compartments,
                       int berthNumber, String comfortClass, Passenger[] trainPassengers) {
        super(travelTime, seatsNumber, cost, compartments);
        this.berthNumber = berthNumber;
        this.comfortClass = comfortClass;
        this.trainPassengers = trainPassengers;
    }
    public Passenger[] getTrainPassengers() {
       return trainPassengers;
    }
    public void setTrainPassengers(Passenger[] trainPassengers) {
        this.trainPassengers = trainPassengers;
    }

    @Override
    public String toString() {
        String trainDescription = super.toString() + "particular: ";
                return trainDescription + "Compartment{" +
                "berthNumber=" + berthNumber +
                ", comfortClass='" + comfortClass + '\'' +
                ", trainPassengers=" + Arrays.toString(trainPassengers) +
                '}';
    }
}
