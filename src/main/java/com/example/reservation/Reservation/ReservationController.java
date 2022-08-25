package com.example.reservation.Reservation;

import com.example.reservation.Passenger.Passenger;
import com.example.reservation.Passenger.PassengerService;
import com.example.reservation.schedule.Schedule;
import com.example.reservation.schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.rmi.server.RemoteRef;
import java.util.ArrayList;

@Controller
public class ReservationController {
    @Autowired
    ScheduleService scheduleService;

    @Autowired
    ReservationService reservationService;

    @Autowired
    PassengerService passengerService;

    @RequestMapping("/reservation/reserve")
    public String reserve(@RequestParam String passName, @RequestParam String passTel,@RequestParam int scheduleNum, Model model){
        //예매 테이블 데이터 우선 생성
        Schedule schedule = scheduleService.selecByScheduleNum(scheduleNum);
        int ticketNum = reservationService.insert(schedule.getScheduleNum(), schedule.getPlaneName());
        Reservation reservation = reservationService.selectByTicketNum(ticketNum);

        //예매 후 생성된 예매번호를 이용해서 승객 데이터 삽입
        ArrayList<Passenger> passengers;
        String [] names = passName.split(",");
        String [] tels = passTel.split(",");

        for (int i = 0; i < names.length; i++){
            passengerService.insert(ticketNum, scheduleNum, tels[i], names[i]);
        }
        passengers = passengerService.selectByTicketNum(ticketNum);
        model.addAttribute("reservation", reservation);
        model.addAttribute("passengers", passengers);
        model.addAttribute("schedule", schedule);

        return "reserveResult";

    }

}
