package Task3and4;

import Task2.Cafe;

import java.util.ArrayList;

public class Main {
    static ArrayList<Room> rooms = new ArrayList<Room>();

    public static void main(String[] args) {
        Room r1 = new Room(3, 3, 5);
        Room r2 = new Room(2, 2, 3);
        Room r3 = new Room(5, 8, 8);

        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        Building b1 = new Building(rooms, 3, 5, false);

        // lamps in building:
        System.out.println(countLampsInBuilding(b1));
        // Is the building normal?
        System.out.println(isNormal(b1));

    }

    public static int countLampsInBuilding(Building b) {
        int count = 0;
        for (Room r : b.getRooms()) {
            count += r.getNumberOfLamps();
        }

        return count;
    }

    public static boolean isNormal(Building b) {
        if (b.getNumberOfFloors() > b.getRooms().size()) {
            System.out.println("This is an odd building");
            return false;
        }
        return true;

    }
}
