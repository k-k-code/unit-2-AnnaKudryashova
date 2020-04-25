package ru.brunoyam.oop.models.transport;
import ru.brunoyam.oop.models.Passenger;
import java.util.Arrays;

/**
 * Авиатранспорт (самолет) прикрепленный к определенному авиамаршруту
 */
public class Plane extends Transport {
    /**
     * Багаж включен в стоимость билета
     */
    private boolean luggage;
    private int seatsNumber;
    private Passenger[] passengers = new Passenger[seatsNumber];

    public boolean isLuggage() {
        return luggage;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }
       /**
     * Конструктор, заполняющий все поля.
     *
     * @param travelTime  время в пути
     * @param seatsNumber количество мест
     * @param cost        стоимость билета
     * @param luggage     багаж включен в стоимость билета
     */
    public Plane(int travelTime, int seatsNumber,
                 int cost, boolean luggage) {

        super(travelTime, seatsNumber, cost);
        this.luggage = luggage;
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
    @Override
    public String toString() {
        return "Plane{" +
                "SeatsNumber=" + getSeatsNumber() +
                ", luggage=" + isLuggage() +
                ", passengers=" + Arrays.toString(passengers) +
                ", cost=" + getCost() +
                '}';
    }
}