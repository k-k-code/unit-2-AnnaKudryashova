package ru.brunoyam.oop;

import ru.brunoyam.oop.models.transport.*;

/**
 * Главный класс нашего приложения.
 */
public class Appilcation {
      /**
     * Главный класс приложения
     * @param args - набор аргументов запуска приложения.
     */
    public static void main(String[] args) {
        Plane superJet100 = new Plane(180, 100, 25000,
                true, null);
        Cabin shipCabin = new Cabin(1440, 200, 15000,
                null, 4, "business", null);
        Compartment trainCompartment = new Compartment(2880, 100,
                20000, null, 4, "economy", null);
        Bus cityBus = new Bus(true, 5, 48,
                50, 2500, null);

        Transport[] transportArray = new Transport[]{superJet100, shipCabin, trainCompartment, cityBus};
        Passenger passenger1 = new Passenger("Ivan", "Ivanov", "Ivanovich", "0000 111111");
        Passenger passenger2 = new Passenger("Petr", "Petrov", "Petrovich", "0000 222222");
        Passenger passenger3 = new Passenger("Fedor", "Fedorov", "Fedorovich", "0000 333333");
        Passenger passenger4 = new Passenger("Kirill", "Kirillov", "Kirillovich", "0000 444444");
        Passenger passenger5 = new Passenger("Marina", "Marinova", "Ivanova", "0000 555555");

        System.out.println("Список пассажиров: " + "\n" + passenger1.getFullName() + "\n" + passenger2.getFullName()
                + "\n" +passenger3.getFullName() + "\n" +passenger4.getFullName() + "\n" +passenger5.getFullName());
        System.out.println("Список транспортных средств с пассажирами "
                + "\n" + "train: " + trainCompartment.toString()
                + "\n" + "plane: " + superJet100.toString()
                + "\n" + "ship: " + shipCabin.toString()
                + "\n" + "bus: " + cityBus.toString());
    }
}
