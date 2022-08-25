package com.example.reservation.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

@Service
public class ReservationServiceImpl implements ReservationService{
    @Autowired
    ReservationMapper reservationMapper;

   /* @Override
    public ArrayList<Reservation> insert(String[] names, String[] tels) {

        for(int i = 0; i < names.length; i++){
            Random random = new Random();
            int num = random.nextInt();
            reservationMapper.insert(num,names,tels);
        }
        return ;
    }*/

    @Override
    public int insert(int scheduleNum, String planeName,String userId) {
        Random random = new Random();
        int ticketNum = random.nextInt(2147483);

        LocalDateTime now = LocalDateTime.now();         // 현재 날짜/시간 출력
        String ticketDate = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss"));

        reservationMapper.insert(ticketNum,scheduleNum, planeName, ticketDate, userId);
        return ticketNum;
    }

    @Override
    public Reservation selectByTicketNum(int ticketNum) {
        return reservationMapper.selectByTicketNum(ticketNum);
    }

    @Override
    public ArrayList<Reservation> selectByUserId(String userId) {
        return reservationMapper.selectByUserId(userId);
    }

}
