package com.pluralsight;

public class Room {

    private String roomNumber;
    private String roomType;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(String roomType, String roomNumber, double price, boolean occupied, boolean dirty){
        this.roomType = roomType;
        this.roomNumber =roomNumber;
        this.price = price;
        this.isOccupied = occupied;
        this.isDirty = dirty;
    }

    public String setRoomNumber(String roomNumber) {
        return this.roomNumber;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public double getPrice(){
        return  this.price;
    }

    public boolean isDirty(){
        return this.isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable() {
        return ( !this.isDirty() && !this.isOccupied() );

    }

    public void checkIn() throws Exception {
        if (isOccupied) {
            throw new Exception("Cannot check into an occupied room.");
        }
        isOccupied = true;
        isDirty = true;
    }

    public void checkOut() throws Exception {
        if (!isOccupied) {
            throw new Exception("Cannot check out of an unoccupied room.");
        }
        isOccupied = false;
        isDirty = true;
    }

    public void cleanRoom() throws Exception {
        if (!isDirty) {
            throw new Exception("Cannot clean a room that is not dirty.");
        }
        isDirty = false;
    }
}

