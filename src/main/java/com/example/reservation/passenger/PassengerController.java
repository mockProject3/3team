package com.example.reservation.passenger;

import com.example.reservation.reservation.ReservationService;
import com.example.reservation.schedule.Schedule;
import com.example.reservation.schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PassengerController {
    @Autowired
    ScheduleService scheduleService;

    @Autowired
    ReservationService reservationService;

    @RequestMapping("/passenger/reservePage")
    public String reservePage(@RequestParam String passengerCount, @RequestParam String scheduleNum, Model model){

        Schedule schedule = scheduleService.selecByScheduleNum(Integer.parseInt(scheduleNum));
        model.addAttribute("passengerCount",passengerCount);
        model.addAttribute("schedule",schedule);

        return "passengerReservePage";

    }

}
