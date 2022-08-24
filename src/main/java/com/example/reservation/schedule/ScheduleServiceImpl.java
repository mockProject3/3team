package com.example.reservation.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ScheduleServiceImpl implements ScheduleService{
   @Autowired
   ScheduleMapper scheduleMapper;
    @Override
    public ArrayList<Schedule> select(String departure, String arrival,  String departureDate) {
        return scheduleMapper.select(departure,arrival,departureDate);
    }
}
