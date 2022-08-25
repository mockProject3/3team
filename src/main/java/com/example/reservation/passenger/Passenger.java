package com.example.reservation.passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

    private int passNum;
    private String passName;
    private String passTel;
    private int ticketNum;
    private int scheduleNum;



}
