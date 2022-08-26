package com.example.reservation.passenger;

import com.example.reservation.reservation.ReservationService;
import com.example.reservation.schedule.Schedule;
import com.example.reservation.schedule.ScheduleService;
import com.example.reservation.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PassengerController {
    @Autowired
    ScheduleService scheduleService;

    @Autowired
    ReservationService reservationService;

    @RequestMapping("/passenger/reservePage")
    public String reservePage(HttpServletRequest request, @RequestParam String passengerCount, @RequestParam String scheduleNum, Model model){

        Schedule schedule = scheduleService.selecByScheduleNum(Integer.parseInt(scheduleNum));
        model.addAttribute("passengerCount",passengerCount);
        model.addAttribute("schedule",schedule);
        User user = (User) request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "passengerReservePage";

    }

}
