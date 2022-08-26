package com.example.reservation.reservation;

import com.example.reservation.passenger.Passenger;
import com.example.reservation.passenger.PassengerService;
import com.example.reservation.user.User;
import com.example.reservation.schedule.Schedule;
import com.example.reservation.schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
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
    public String reserve(HttpServletRequest request, @RequestParam String passName, @RequestParam String passTel, @RequestParam int scheduleNum, Model model){


        User user = (User) request.getSession().getAttribute("user");

        //예매 테이블 데이터 우선 생성
        Schedule schedule = scheduleService.selecByScheduleNum(scheduleNum);
        int ticketNum = reservationService.insert(schedule.getScheduleNum(), schedule.getPlaneName(),user.getUserId());
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
        model.addAttribute("user",user);
        return "reserveResult";

    }
    @RequestMapping("/reservation/list")
    public String reservationList(HttpServletRequest request, Model model){
        ArrayList<Reservation> reservations;
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        String userId= user.getUserId();
        reservations = reservationService.selectByUserId(userId);
        for (int i = 0; i < reservations.size(); i++){
            Schedule schedule = scheduleService.selecByScheduleNum(reservations.get(i).getScheduleNum());
            reservations.get(i).setSchedule(schedule);
        }
        model.addAttribute("reservations", reservations);
        return  "reservationList";
    }
    @RequestMapping("/TST2")
    public String TE(Model model){

        return  "index";
    }
    @RequestMapping("/reservation/detail")
    public String reservationDetail(HttpServletRequest request,@RequestParam int ticketNum, Model model){
        Reservation reservation = reservationService.selectByTicketNum(ticketNum);
        ArrayList<Passenger> passengers = passengerService.selectByTicketNum(ticketNum);
        Schedule schedule = scheduleService.selecByScheduleNum(reservation.getScheduleNum());
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        model.addAttribute("reservation", reservation);
        model.addAttribute("passengers", passengers);
        model.addAttribute("schedule", schedule);

        return "reserveResult";
    }


}
