package com.pluralsight;
import java.util.Scanner;

public class mainRoom {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create Room
            Room room = new Room("king",
                    "202",
                    134.00,
                    false,
                    false);



            // Check In Room
            try {
                room.checkIn();
                System.out.println("Room checked in.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Clean Room
            try {
                room.cleanRoom();
                System.out.println("Room cleaned.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Check Out Room
            try {
                room.checkOut();
                System.out.println("Room checked out.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}