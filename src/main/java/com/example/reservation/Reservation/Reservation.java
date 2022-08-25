package com.example.reservation.Reservation;

import com.example.reservation.schedule.Schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation {
    private String ticketNum;
    private int scheduleNum;
    private String planeName;
    private String ticketDate;
    private int ticketPrice;
    private int passCount;
    private String userId;
    private Schedule schedule;

}
