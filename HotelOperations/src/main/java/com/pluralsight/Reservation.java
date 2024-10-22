package com.pluralsight;

public class Reservation {


    private String roomType;

    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }


    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() throws Exception {
        double price = 0;
        //figure out what the price is
        if(this.roomType.equalsIgnoreCase("kingBed")){
            price = 139.0;
        }
        else if (this.roomType.equalsIgnoreCase("doubleBed")){
            price = 124.0;
        }
        else{

            throw new Exception ("INVALID ROOM TYPE");
        }

        if(this.weekend){
            /// = price + ( price * 0.10); line 42-43 show two other options to display this math of 105 more if weekend
            ///price = price * 1.1;
            price *= 1.1;
        }


        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() throws Exception {

        return this.getPrice() * numberOfNights;
    }

}
