package com.example.Reto_3.controller;

import com.example.Reto_3.entities.Reservation;
import com.example.Reto_3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(faltaapi"/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping(faltaapi"/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
    @PostMapping(faltaapi"/save")
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }
}
