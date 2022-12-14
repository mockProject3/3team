package com.example.reservation.schedule;

import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ScheduleMapper {
    @Select("select * from schedule where departure = #{departure} and arrival = #{arrival} and departureDate = #{departureDate}")
    ArrayList<Schedule> select(String departure,  String arrival, String departureDate);

    @Select("select * from schedule where scheduleNum = #{scheduleNum}")
    Schedule selectByScheduleNum(int scheduleNum);
}
