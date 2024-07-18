package com.otu.springboothotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otu.springboothotel.model.Room;
import com.otu.springboothotel.repository.RoomRepository;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(int id) {
        return roomRepository.findById(id).orElse(null);
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(int id, Room updatedRoom) {
        if (roomRepository.existsById(id)) {
            updatedRoom.setId(id);
            return roomRepository.save(updatedRoom);
        }
        return null;
    }

    public void deleteRoom(int id) {
        roomRepository.deleteById(id);
    }

}
