package com.example.reservation.Reservation;

import com.example.reservation.schedule.Schedule;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface ReservationMapper {
    @Insert("insert into reservation(ticketNum, scheduleNum,planeName, ticketDate ) values (#{ticketNum}, #{scheduleNum},#{planeName}, #{ticketDate} )")
    void insert(int ticketNum, int scheduleNum, String planeName, String ticketDate);

    @Select("select * from reservation where ticketNum = #{ticketNum}")
    Reservation selectByTicketNum(int ticketNum);


}
