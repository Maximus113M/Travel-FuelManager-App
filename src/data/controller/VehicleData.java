package data.controller;

import com.model.Vehicle;
import data.functions.GenericFunctions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VehicleData { 

    public static List<Vehicle> addDefaultVehicle() {
        List<Vehicle> myVehicles = new ArrayList(30);
        myVehicles.add(new Vehicle("Motocicleta", "Pulsar 220", 120, 220));
        myVehicles.add(new Vehicle("Motocicleta", "Boxer 100", 200, 570));
        myVehicles.add(new Vehicle("Motocicleta", "Gs 500", 80, 320));
        myVehicles.add(new Vehicle("Motocicleta", "Z1000", 40, 675));
        return myVehicles;
    }

    // *** Methods Vehicle *** 
   /* public static List<Vehicle> ExportmyVehiclesList(){
        return myVehicles;
    } 
    public static String vehicleType(int option) {
        switch (option) {
            case 1:
                return "Carro";
            case 2:
                return "Moto";
            case 3:
                return "Camioneta";
        }
        return "N/N";
    }

    //THIS FUNCTION VALIDATE IF THE ID IS IN
    public static Vehicle SearchVehicleID(int vehicleID) {
        for (Vehicle vehicles : myVehicles) {
            if (vehicles.getReference() == vehicleID) {
                return vehicles;
            }
        }
        return null;
    }

    //THIS FUNCTION RETURN TRUE if the Vehicle Id is found(Is use by "GenerateVehicleID")
    public static boolean DuplicateVehiculeReference(double newNumber) {
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getReference() == newNumber) {
                return true;
            }
        }
        return false;
    }

    //THIS GENERATE A NOT DUPLICATE ID
    public static int GenerateVehicleReference() {
        boolean successfulId = false;
        int IdNumber = 0;
        do {
            int newIDNumber = GenericFunctions.GenerateRandomID();
            if (!DuplicateVehiculeReference(newIDNumber)) {
                IdNumber = newIDNumber;
                successfulId = true;
            }
        } while (!successfulId);

        return IdNumber;
    }

    //This check if empty state
    public static boolean EmptyVehiclesList() {
        return myVehicles.isEmpty();
    }

    public static boolean MaximumSizeVehiclesList() {
        return myVehicles.size() > 29;
    }

    //This ADD Vehicles to arrayList 
    public static void AddVehicle(Vehicle newVehicle) {
        boolean found = false;
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getType().equalsIgnoreCase(newVehicle.getType()) && vehicle.getModel().equalsIgnoreCase(newVehicle.getModel()) && vehicle.getPerformance() == newVehicle.getPerformance()) {
                found = true;
               // Interface.DuplicateObject();
            }
        }
        if (!found && !newVehicle.getModel().equalsIgnoreCase("")&&newVehicle.getPerformance()>0) {
            myVehicles.add(newVehicle);
        } else {
            //Interface.InvalidData();
        }

    }

//This function remove a Vehicle to the list
    public static void DelVehicle(int Reference) {
        boolean found = false;
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getReference() == Reference) {
                //Interface.Found();
                System.out.println("                " + vehicle);
                myVehicles.remove(myVehicles.indexOf(vehicle));
                found = true;
                break;
            }
        }
        if (!found) {
            //Interface.NotFound();
        }
    }
    
    public static void DelVehicleList() {
        myVehicles.clear();
    }

    public static void PrintVehiclesList() {
        if (!EmptyVehiclesList()) {
            Comparator<Vehicle> comparadorMultiple = Comparator.comparing(Vehicle::getType).thenComparing(Comparator.comparing(Vehicle::getModel));
            myVehicles.stream().sorted(comparadorMultiple).forEach(System.out::println);
            GenericFunctions.WaitAction_Argument(3);
        } else {
            //Interface.Empty();
        }
    }*/

    /*public static void VehiclePerformance(int position){
        for (Vehicle vehicle : myVehicles) {
           if (myVehicles.contains(myVehicles.indexOf(vehicle))){
                myVehicles.remove(myVehicles.indexOf(vehicle));
                Interface_Menus.SuccessfulAction();
                break;
            }
            Interface_Menus.NotFound(); 
        }
        double consumption= vehicle.getPerformance()*price;
    }*/
}
