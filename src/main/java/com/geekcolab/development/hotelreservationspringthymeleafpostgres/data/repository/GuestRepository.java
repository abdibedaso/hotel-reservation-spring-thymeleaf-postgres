package com.geekcolab.development.hotelreservationspringthymeleafpostgres.data.repository;

import com.geekcolab.development.hotelreservationspringthymeleafpostgres.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
