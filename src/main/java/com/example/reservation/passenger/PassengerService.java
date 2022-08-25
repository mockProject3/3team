package com.example.reservation.passenger;

import java.util.ArrayList;


public interface PassengerService {
    void insert(int ticketNum, int scheduleNum, String passTel, String passName);
    ArrayList<Passenger> selectByTicketNum(int ticketNum);
}
