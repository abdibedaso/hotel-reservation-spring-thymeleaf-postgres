package com.geekcolab.development.hotelreservationspringthymeleafpostgres.web;

import java.util.Date;
import java.util.List;

import com.geekcolab.development.hotelreservationspringthymeleafpostgres.business.domain.RoomReservation;
import com.geekcolab.development.hotelreservationspringthymeleafpostgres.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reservations")
public class RoomReservationWebServiceController {

    private final ReservationService reservationService;

    @Autowired
    public RoomReservationWebServiceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<RoomReservation> getRoomReservations(@RequestParam(name="date", required = false)String dateString){
        Date date = DateUtils.createDateFromDateString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }
}
