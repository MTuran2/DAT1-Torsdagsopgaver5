package Task3and4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void countLampsInBuilding() {
            Room r1 = new Room(3, 3, 5);
            Room r2 = new Room(2, 2, 3);
            Room r3 = new Room(5, 8, 8);
            Room r4 = new Room(1, 2, 2);
            Room r5 = new Room(8, 15, 6);

            ArrayList<Room> rooms = new ArrayList<Room>();

            rooms.add(r1);
            rooms.add(r2);
            rooms.add(r3);
            rooms.add(r4);
            rooms.add(r5);

            Building b1 = new Building(rooms, 3, 6, false);

            assertEquals(30,Main.countLampsInBuilding(b1));
    }

    @Test
    void isNormal() {
            Room r1 = new Room(3, 3, 5);
            Room r2 = new Room(2, 2, 3);
            Room r3 = new Room(5, 8, 8);
            Room r4 = new Room(1, 2, 2);
            Room r5 = new Room(8, 15, 6);

            ArrayList<Room> rooms = new ArrayList<Room>();

            rooms.add(r1);
            rooms.add(r2);
            rooms.add(r3);
            rooms.add(r4);
            rooms.add(r5);

            Building b1 = new Building(rooms, 3, 6, false);
            assertEquals(false,Main.isNormal(b1));
        }
}