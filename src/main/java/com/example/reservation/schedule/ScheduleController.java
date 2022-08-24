package com.example.reservation.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;

    @RequestMapping("/schedule/page")
    public String schedulePage(Model model){
        return "schedulePage";
    }

    @RequestMapping("/schedule/search")
    public String reservationPage(@RequestParam String departure, @RequestParam String arrival, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") String departureDate, @RequestParam String passengerCount, Model model){
        ArrayList<Schedule> scheduleArrayList = scheduleService.select(departure,arrival,departureDate);
        model.addAttribute("schedules",scheduleArrayList);
        model.addAttribute("arrival", arrival);
        model.addAttribute("departure", departure);
        model.addAttribute("departureDate", departureDate);
        model.addAttribute("passengerCount", passengerCount);

        return "scheduleList";
    }



}
