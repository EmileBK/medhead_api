package com.medhead.medhead.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medhead.medhead.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    
}
