package com.example.reservation.Passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

    private int passNum;
    private String passName;
    private String passTel;

    private List<Passenger> passengerList;

}
