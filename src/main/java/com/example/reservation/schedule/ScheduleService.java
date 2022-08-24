package com.example.reservation.schedule;

import java.util.ArrayList;

public interface ScheduleService {
    ArrayList<Schedule> select(String departure,  String arrival);
}
