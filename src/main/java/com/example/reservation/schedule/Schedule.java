package com.example.reservation.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Schedule {
    private int scheduleNum;
    private String planeName;
    private String departureDate;
    private String departureTime;
    private String arrivalTime;
    private String departure;
    private String arrival;


}
