package com.example.reservation.Passenger;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface PassengerService {
    void insert(int ticketNum, int scheduleNum, String passTel, String passName);
    ArrayList<Passenger> selectByTicketNum(int ticketNum);
}
