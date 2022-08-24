package com.example.reservation.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Schedule {
    private int scheduleNum;
    private String planeName;
    private String startTime;
    private String endTime;
    private String departure;
    private String arrival;

}
