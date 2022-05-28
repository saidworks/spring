package com.saidworks.travelgo.repos;

import com.saidworks.travelgo.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
