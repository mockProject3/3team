package com.example.reservation.Passenger;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface PassengerMapper {
    @Insert("insert into passenger(passNum, ticketNum, scheduleNum,passTel, passName) values (#{passNum}, #{ticketNum}, #{scheduleNum},#{passTel}, #{passName} )")
    void insert(int passNum, int ticketNum, int scheduleNum, String passTel, String passName);

    @Select("select * from passenger where ticketNum = #{ticketNum}")
    ArrayList<Passenger> selectByTicketNum(int ticketNum);
}
