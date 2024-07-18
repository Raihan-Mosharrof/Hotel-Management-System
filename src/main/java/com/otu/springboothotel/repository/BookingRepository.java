package com.otu.springboothotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.otu.springboothotel.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
