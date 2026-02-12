package com.java.oop.arrays;

public class SeatBooking {

    public static void main(String[] args) {

        boolean[][] seats = new boolean[3][3];

        seats[1][2] = true; // Book seat

        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] ? "Booked " : "Empty ");
            }
            System.out.println();
        }
    }
}

