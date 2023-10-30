package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double roomPrice;
    private boolean roomOccupied;
    private boolean roomDirty;
    private boolean roomAvailable;

    public Room(int numberOfBeds, double roomPrice, boolean roomOccupied, boolean roomDirty, boolean roomAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.roomOccupied = roomOccupied;
        this.roomDirty = roomDirty;
        this.roomAvailable = roomAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isRoomOccupied() {
        return roomOccupied;
    }

    public void setRoomOccupied(boolean roomOccupied) {
        this.roomOccupied = roomOccupied;
    }

    public boolean isRoomDirty() {
        return roomDirty;
    }

    public void setRoomDirty(boolean roomDirty) {
        this.roomDirty = roomDirty;
    }

    public boolean isRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(boolean roomAvailable) {
        this.roomAvailable = roomAvailable;
    }
}
