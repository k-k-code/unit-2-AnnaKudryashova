package ru.brunoyam.oop.models.transport;

public enum CompartmentType {
    STANDARD(false, 4, 200_000),
    SV(true, 4, 300_000),
    LUX(true, 2, 600_000);
    private final boolean hasFood;
    private final int seatsNumber;
    private final long cost;
    CompartmentType(boolean hasFood, int seatsNumber, long cost) {
        this.hasFood = hasFood;
        this.seatsNumber = seatsNumber;
        this.cost = cost;
    }
    public boolean isHasFood() {
        return hasFood;
    }
    public int getSeatsNumber() {
        return seatsNumber;
    }
    public long getCost() {
        return cost;
    }
}