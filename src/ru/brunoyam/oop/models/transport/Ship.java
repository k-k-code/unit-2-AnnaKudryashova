
package ru.brunoyam.oop.models.transport;
import ru.brunoyam.oop.models.Passenger;
import java.util.Arrays;

public class Ship extends Transport {

    private Cabin[] cabins = {new Cabin(CabinType.STANDARD), new Cabin(CabinType.COMFORT), new Cabin(CabinType.LUX)}; // массив кают

    public Ship(int travelTime, int seatsNumber, int cost) {
        super(travelTime, seatsNumber, cost);
    }
    public boolean saleTicket(int cabinNumber, Passenger passenger) {
        if (cabinNumber < 0 || cabinNumber >= cabins.length) {
            return false;
        } else {
            return cabins[cabinNumber].placePassenger(passenger);
        }
    }
    public Cabin[] getCabins() {return cabins;}
    @Override
    public String toString() {
        return "Ship {" +
                Arrays.toString(cabins) +
                '}';
    }
}