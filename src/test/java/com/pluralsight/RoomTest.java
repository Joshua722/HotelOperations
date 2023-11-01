package com.pluralsight;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkedIn() {
        Room avaibableRoom = new Room(2,139.00,false,false,true,false,true,true);
        assertTrue(avaibableRoom.isRoomAvailable());
        avaibableRoom.checkedIn();
        assertFalse(avaibableRoom.isRoomAvailable());

    }

    @org.junit.jupiter.api.Test
    void checkingOut() {
        Room checkedOutRoom = new Room(2,139.00,true,true,false,true,false,false);
        assertFalse(checkedOutRoom.isRoomAvailable());
        assertTrue(checkedOutRoom.isRoomOccupied());
        checkedOutRoom.checkedOut();
        assertTrue(checkedOutRoom.isRoomAvailable());
        assertFalse(checkedOutRoom.isRoomOccupied());
    }

    @org.junit.jupiter.api.Test
    void dirtyRoomCheckingOut() {
        Room dirtyRoom = new Room(2,139.00,true,true,false,true,false,false);
        assertTrue(dirtyRoom.isRoomDirty());
        dirtyRoom.cleanRoom();
        assertTrue(dirtyRoom.cleanRoom());
        dirtyRoom.checkedOut();
        assertTrue(dirtyRoom.isRoomAvailable());
        assertFalse(dirtyRoom.isRoomOccupied());
        assertFalse(dirtyRoom.isRoomDirty());
    }
}