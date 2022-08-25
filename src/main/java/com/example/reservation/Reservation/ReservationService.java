package com.example.reservation.Reservation;

import com.example.reservation.schedule.Schedule;

import java.util.ArrayList;

public interface ReservationService {

    //ArrayList<Reservation> insert(String [] names, String [] tels);
    int insert(int scheduleNum, String planeName);

    Reservation selectByTicketNum(int ticketNum);
}