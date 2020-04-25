package ru.brunoyam.oop.models.transport;

public enum CabinType {
    STANDARD(false, 4, 100_000),
    COMFORT(true, 4, 150_000),
    LUX(true, 2, 300_000);
    private final boolean hasWindow;
    private final int seatsNumber;
    private final long cost;
    CabinType(boolean hasWindow, int seatsNumber, long cost) {
        this.hasWindow = hasWindow;
        this.seatsNumber = seatsNumber;
        this.cost = cost;
    }
    public boolean isHasWindow() {
        return hasWindow;
    }
    public int getSeatsNumber() {
        return seatsNumber;
    }
    public long getCost() {
        return cost;
    }
}