package com.hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class HotelReservationSystem {

    private static ArrayList<Hotel> hotelList = new ArrayList<>();

    public static void addHotel(String name, int price) {
        Hotel temporary = new Hotel(name, price);
        hotelList.add(temporary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***********Welcome to Hotel Reservation************");

        for(int i=1; i<=3;i++) {
            System.out.println("Enter the hotel name : ");
            String hotelName = sc.next();
            System.out.println("Enter the Rates : ");
            int rates = sc.nextInt();

            Hotel list = new Hotel(hotelName , rates);
            hotelList.add(list);
        }
        System.out.println("\n\n### List of Hotels ###\n"+hotelList);
    }
}