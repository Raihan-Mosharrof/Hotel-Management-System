package com.otu.springboothotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.otu.springboothotel.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
