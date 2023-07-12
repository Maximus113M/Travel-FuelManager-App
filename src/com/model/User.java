package com.model;

import data.defaultplaces.DefaultPlaces;
import data.functions.GenericFunctions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class User {

    private String name;
    private String email;
    private String number;
    private String password;
    private final List<Place> mySavedPlaces = new ArrayList();
    private final List<Vehicle> myVehicles = new ArrayList(30);
    private final ArrayList<BudgetReport> budgetReports = new ArrayList();
    private Vehicle defaultVehicle = null;
    private double fuelPrice = 12000;

    private int loginTimes = 0;

    public User(String name, String email, String number, String password) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    //THIS FUNCTION EXPORT MY PLACE LIST
    public List<Place> exportMyPlacesList() {
        return mySavedPlaces;
    }

    //THIS FUNCTION VALIDATE IF THE ID IS IN
    public boolean searchDuplicatePlace(int placeID) {
        for (Place place : mySavedPlaces) {
            if (place.getID() == placeID) {
                return true;
            }
        }
        return false;
    }

    //This functions get a place from list index
    public Place searchPlaceID(int placeID) {
        Place placeDefaultPlaces = DefaultPlaces.searchPlaceDefaultPlaces(placeID);
        if (placeDefaultPlaces != null) {
            return placeDefaultPlaces;
        } else {
            for (Place place : mySavedPlaces) {
                if (place.getID() == placeID) {
                    return place;
                }
            }
        }
        return null;
    }

    //THIS FUNCTION ADD new Place to arrayList 
    public void addToMySavedList(Place place) {
        mySavedPlaces.add(place);
        System.out.println("***anhadido");
    }

    //THIS CHECK if empty state
    public boolean emptyPlaceList() {
        return mySavedPlaces.isEmpty();
    }

    //THIS FUNCTION remove a location to the list
    public void delPlaces(int placeId) {
        for (Place place : mySavedPlaces) {
            if (place.getID() == placeId) {
                System.out.println(place);
                mySavedPlaces.remove(mySavedPlaces.indexOf(place));
                System.out.println("Eliminado");
                break;
            }
        }
    }

    //THIS CLEAR myTouristPlaces LIST
    public void delPlacesList() {
        mySavedPlaces.clear();
    }

    //THIS FUNCTION print Places List
    public void printPlaces() {
        if (!emptyPlaceList()) {
            Comparator<Place> comparadorMultiple = Comparator.comparing(Place::getDepartamento).thenComparing(Comparator.comparing(Place::getNamePlace)).thenComparing(Comparator.comparing(Place::getDistance));
            mySavedPlaces.stream().sorted(comparadorMultiple).forEach(System.out::println);
        }
    }

    public Place searchIndex(int index) {
        if (!emptyPlaceList()) {
            return mySavedPlaces.get(index);
        }
        return null;
    }

    //THIS FUNCTION is to search by name
    public Place getPlaceByName(String namePleace) {
        if (!emptyPlaceList()) {
            for (Place place : mySavedPlaces) {
                if (place.getNamePlace().equalsIgnoreCase(namePleace)) {
                    return place;
                }
            }
        }
        return null;
    }

    //---------------------------------------- VEHICLES ---------------------------------------------------//
    public List<Vehicle> exportMyVehiclesList() {
        return myVehicles;
    }

    //THIS FUNCTION VALIDATE IF THE ID IS IN
    public Vehicle searchVehicleID(int vehicleID) {
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getReference() == vehicleID) {
                return vehicle;
            }
        }
        return null;
    }

    //THIS FUNCTION RETURN TRUE if the Vehicle Id is found(Is use by "GenerateVehicleID")
    public boolean duplicateVehiculeReference(int newReference) {
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getReference() == newReference) {
                return true;
            }
        }
        return false;
    }

    //THIS GENERATE A NOT DUPLICATE ID
    public int generateVehicleReference() {
        boolean successfulId = false;
        int IdNumber = 0;
        do {
            int newIDNumber = GenericFunctions.GenerateRandomID();
            if (!duplicateVehiculeReference(newIDNumber)) {
                IdNumber = newIDNumber;
                successfulId = true;
            }
        } while (!successfulId);

        return IdNumber;
    }

    //This check if empty state
    public boolean emptyVehiclesList() {
        return myVehicles.isEmpty();
    }

    public boolean maximumSizeVehiclesList() {
        return myVehicles.size() > 29;
    }

    //This ADD Vehicles to arrayList 
    public void addVehicle(Vehicle newVehicle) {
        boolean found = false;
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getType().equalsIgnoreCase(newVehicle.getType()) && vehicle.getModel().equalsIgnoreCase(newVehicle.getModel()) && vehicle.getPerformance() == newVehicle.getPerformance()) {
                found = true;
                // Interface.DuplicateObject();
            }
        }
        if (!found && !newVehicle.getModel().equalsIgnoreCase("") && newVehicle.getPerformance() > 0) {
            myVehicles.add(newVehicle);
        } else {
            //Interface.InvalidData();
        }

    }

//This function remove a Vehicle to the list
    public void delVehicle(int Reference) {
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getReference() == Reference) {
                System.out.println("                " + vehicle);
                myVehicles.remove(myVehicles.indexOf(vehicle));
                break;
            }
        }
    }

    public void delVehicleList() {
        myVehicles.clear();
    }

    public void printVehiclesList() {
        if (!emptyVehiclesList()) {
            Comparator<Vehicle> comparadorMultiple = Comparator.comparing(Vehicle::getType).thenComparing(Comparator.comparing(Vehicle::getModel));
            myVehicles.stream().sorted(comparadorMultiple).forEach(System.out::println);
            GenericFunctions.WaitAction_Argument(3);
        } else {
            //Interface.Empty();
        }
    }

    public Vehicle getDefaultVehicle() {
        return defaultVehicle;
    }

    public void setDefaultVehicle(Vehicle vehicle) {
        defaultVehicle = vehicle;
    }

    //---------------------------------------- Budgets ---------------------------------------------------//
    public List<BudgetReport> getBudgetReports() {
        return budgetReports;
    }

    public void importDefaultReports(List<BudgetReport> list) {
        budgetReports.addAll(list);
    }

    //THIS FUNCTION ADD New Reports to arrayList 
    public BudgetReport autoCompleteReports(String reportName, int vehicleId, Place place, double fuelPrice) {
        Vehicle vehicleFound = searchVehicleID(vehicleId);

        if (vehicleFound != null && place != null) {
            Vehicle selectedVehicle = vehicleFound;
            Place selectedPlace = place;

            //INF
            int reportId = generateReportID();
            String reportNames= GenericFunctions.capitalizeWords(reportName);
            String vehicleType = selectedVehicle.getType();
            String vehicleModel = selectedVehicle.getModel();
            int vehicleReference = selectedVehicle.getReference();
            String nameLocation = selectedPlace.getNamePlace();
            String nameCity = selectedPlace.getCiudad();
            String statePlace=selectedPlace.getDepartamento();
            double distanceLocation = selectedPlace.getDistance();
            int placeReference = selectedPlace.getID();
            double travelPrice = (selectedPlace.getDistance() / selectedVehicle.getPerformance()) * fuelPrice;
            

            BudgetReport newReport = new BudgetReport(reportId,reportNames ,vehicleType, vehicleModel, vehicleReference, nameLocation, nameCity, statePlace,distanceLocation, placeReference, fuelPrice, travelPrice);
            System.out.println(newReport);
            return newReport;
        }
        return null;
    }

//THIS FUNCTION RETURN TRUE if the Report Id is found(Is use by "generateReportID")
    public boolean duplicateReportID(double randomNumber) {
        if (!emptyBudgetsList()) {
            for (BudgetReport reports : budgetReports) {
                if (reports.getReportId() == randomNumber) {
                    return true;
                }
            }
        }
        return false;
    }

    //THIS GENERATE A NOT DUPLICATE ID uses by autoCompleteReport
    public int generateReportID() {
        boolean successfulId = false;
        int IdNumber = 0;
        do {
            int newIDNumber = GenericFunctions.GenerateRandomID();
            if (!duplicateReportID(newIDNumber)) {
                IdNumber = newIDNumber;
                successfulId = true;
            }
        } while (!successfulId);

        return IdNumber;
    }

    //THIS FUNCTION ADD New Reports to arrayList 
    public void addReports(BudgetReport report) {
        budgetReports.add(report);
    }

    //THIS CHECK if empty state
    public boolean emptyBudgetsList() {
        return budgetReports.isEmpty();
    }

    //THIS FUNCTION remove a Budget to the list
    public void delReport(int id) {
        for (BudgetReport reports : budgetReports) {
            if (reports.getReportId() == id) {
                System.out.println(reports);
                budgetReports.remove(budgetReports.indexOf(reports));
                break;
            }
        }
    }

    //THIS CLEAR BUDGETSLIST
    public void delBudgetsList() {
        budgetReports.clear();
    }

    //THIS FUNCTION print Places List
    /* public void PrintBudgestList() {
        if (!emptyBudgetsList()) {
            Comparator<BudgetReport> comparadorMultiple = Comparator.comparing(BudgetReport::getReportId).thenComparing(BudgetReport::getVehicleType);
            budgetReports.stream().sorted(comparadorMultiple).forEach(System.out::println);
        }    
    }*/
    @Override
    public String toString() {
        return "               ► USUARIO: " + name + "\n\n                   CORREO: " + email + "\n                   N. TELEFONO: " + number + "\n                   INICIOS DE SESION: " + loginTimes + "\n\n";
    }

}
