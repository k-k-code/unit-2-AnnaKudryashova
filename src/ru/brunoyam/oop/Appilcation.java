package ru.brunoyam.oop;
import ru.brunoyam.oop.models.*;
import ru.brunoyam.oop.models.transport.*;
/**
 * Главный класс нашего приложения.
 */
public class Appilcation {
    /**
     * Главный класс приложения
     *
     * @param args - набор аргументов запуска приложения.
     */
    public static void main(String[] args) {

        Plane plane = new Plane(180, 100, 25000,
                true);
        plane.saleTicket(1, new Passenger("8765"));

       Bus bus = new Bus(true, 5, 48,
                50, 2500);
        bus.saleTicket(1, new Passenger("9876"));

        Ship ship = new Ship(600, 100, 25000);
        ship.saleTicket(0, new Passenger("0123"));
        ship.saleTicket(0, new Passenger("1234"));
        ship.saleTicket(0, new Passenger("2345"));
        ship.saleTicket(0, new Passenger("3456"));
        ship.saleTicket(0, new Passenger("4567"));
        ship.saleTicket(1, new Passenger("5678"));
        ship.saleTicket(2, new Passenger("6789"));

        Train train = new Train(480, 500, 120000);
        train.saleTicket(0, new Passenger("1111"));
        train.saleTicket(0, new Passenger("2222"));
        train.saleTicket(0, new Passenger("3333"));
        train.saleTicket(0, new Passenger("4444"));
        train.saleTicket(1, new Passenger("5555"));
        train.saleTicket(1, new Passenger("6666"));
        train.saleTicket(1, new Passenger("7777"));
        train.saleTicket(1, new Passenger("8888"));
        train.saleTicket(2, new Passenger("9999"));
        train.saleTicket(2, new Passenger("0000"));

        Transport[] transports = new Transport[4];
        transports[0] = bus;
        transports[1] = plane;
        transports[2] = ship;
        transports[3] = train;

        for(Transport value: transports) {
            System.out.println(value.toString());
        }
    }
}