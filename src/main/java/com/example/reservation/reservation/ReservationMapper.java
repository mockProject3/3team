package com.example.reservation.reservation;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface ReservationMapper {
    @Insert("insert into reservation(ticketNum, scheduleNum,planeName, ticketDate, userId ) values (#{ticketNum}, #{scheduleNum},#{planeName}, #{ticketDate}, #{userId})")
    void insert(int ticketNum, int scheduleNum, String planeName, String ticketDate,String userId);

    @Select("select * from reservation where ticketNum = #{ticketNum}")
    Reservation selectByTicketNum(int ticketNum);

    @Select("select * from reservation where userId = #{userId}")
    ArrayList<Reservation> selectByUserId(String userId);


}
