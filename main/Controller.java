package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

public class Controller {
    
    private ArrayList<Equipment> equipment;
    private ArrayList<Space> spaces;
    private HashMap<Integer, SpaceRental> spaceRentals;
    private HashMap<Integer, EquipmentRental> equipmentRentals;

    public Controller() {
        equipment = new ArrayList<Equipment>();
        spaces = new ArrayList<Space>();
        spaceRentals = new HashMap<>();
        equipmentRentals = new HashMap<>();
    }

    public int rentSpace(int spaceId, Date time, String musicianName) {
        return -1;
    }

    public int rentEquipment(int equipId, Date time, String musicianName) {
        return -1;
    }

    public SpaceRental getSpaceRental(int rentalId) {
        return spaceRentals.get(rentalId);
    }

    public void viewSpaceSched() {

    }

    public void viewEquipSched() {

    }

    public int addSpace(String description) {
        return -1;
    }

    public int addEquipment(String description) {
        return -1;
    }

    public void cancelSpace(int rentalId) {
        
    }

    public void cancelEquip(int rentalId) {

    }
    
}