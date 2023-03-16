package Task3and4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Building {
   private final ArrayList<Room> rooms;
   private int numberOfBathrooms;
   private int numberOfFloors;
   private boolean isOfficeBuilding;

    public Building(ArrayList<Room> numberOfRooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return this.isOfficeBuilding;
    }
}
