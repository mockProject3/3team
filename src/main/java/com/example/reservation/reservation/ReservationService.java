package com.example.reservation.reservation;

import java.util.ArrayList;

public interface ReservationService {

    //ArrayList<Reservation> insert(String [] names, String [] tels);
    int insert(int scheduleNum, String planeName, String userId);

    Reservation selectByTicketNum(int ticketNum);

    ArrayList<Reservation> selectByUserId(String userId);
}
