package com.example.reservation.Passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class PassengerServiceImpl implements PassengerService{

    @Autowired
    PassengerMapper passengerMapper;

    @Override
    public void insert(int ticketNum, int scheduleNum, String passTel, String passName) {
        Random random = new Random();
        int passNum = random.nextInt(2147483);
        passengerMapper.insert(passNum,ticketNum,scheduleNum,passTel,passName);
    }

    @Override
    public ArrayList<Passenger> selectByTicketNum(int ticketNum) {
        return passengerMapper.selectByTicketNum(ticketNum);
    }
}
