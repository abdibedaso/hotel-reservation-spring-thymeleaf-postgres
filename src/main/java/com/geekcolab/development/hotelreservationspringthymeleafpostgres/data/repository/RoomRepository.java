package com.geekcolab.development.hotelreservationspringthymeleafpostgres.data.repository;

import com.geekcolab.development.hotelreservationspringthymeleafpostgres.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
