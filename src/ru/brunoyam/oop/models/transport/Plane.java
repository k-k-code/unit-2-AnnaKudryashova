package ru.brunoyam.oop.models.transport;

import java.util.Arrays;

/**
 * Авиатранспорт (самолет) прикрепленный к определенному авиамаршруту
 */
public class Plane extends Transport {
    /**
     * Багаж включен в стоимость билета
     */
    private boolean luggage;

    public boolean isLuggage() {
        return luggage;
    }

    Passenger[] planePassengers = new Passenger[1];
    
    /**
     * Конструктор, заполняющий все поля.
     *
     * @param travelTime  время в пути
     * @param seatsNumber количество мест
     * @param cost        стоимость билета
     * @param luggage     багаж включен в стоимость билета
     */
    public Plane(int travelTime, int seatsNumber,
                 int cost, boolean luggage, Passenger[] planePassengers) {
        super(travelTime, seatsNumber, cost);
        this.luggage = luggage;
        this.planePassengers = planePassengers;
    }

    @Override
    public String toString() {
        String planeDescription = super.toString() + "particular: ";
        return planeDescription + "Plane{" +
                "luggage=" + luggage +
                ", planePassengers=" + Arrays.toString(planePassengers) +
                '}';
    }
}
