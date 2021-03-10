package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    
    private ArrayList<Equipment> equipment;
    private ArrayList<Space> spaces;
    private HashMap<Integer, Space> spaceRentals;
    private HashMap<Integer, Equipment> equipmentRentals;

    public void Controller() {
        equipment = new ArrayList<Equipment>();
    }
}