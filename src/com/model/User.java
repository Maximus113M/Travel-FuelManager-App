
package com.model;

import data.functions.GenericFunctions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String number;
    private String password;
    private final List<Place> mySavedPlaces= new ArrayList();
    private final List<Vehicle> myVehicles = new ArrayList(30);
    private final ArrayList<BudgetReport> budgetReports = new ArrayList();
    private final Vehicle[] defaultVehicle= new Vehicle[1];
    
    private int loginTimes=0;

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

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }
    
    //THIS FUNCTION EXPORT  PLACE LIST
     public List<Place> ExportPlacesList() {
        return mySavedPlaces;    
    }
    
    //THIS FUNCTION VALIDATE IF THE ID IS IN
    public boolean SearchDuplicatePlace(int placeID) {
        for (Place place : mySavedPlaces) {
            if (place.getID() == placeID) {
                return true;
            }
        }
        return false;
    } 
    
    public Place SearchPlaceID(int placeID) {
        for (Place destino : mySavedPlaces) {
            if (destino.getID() == placeID) {
                return destino;
            }
        }
        return null;
    }    
    
    //THIS FUNCTION ADD new Place to arrayList 
    public void AddToMySavedList(Place place) {
        mySavedPlaces.add(place);
        System.out.println("***anhadido");
    }

    //THIS CHECK if empty state
    public boolean EmptyPlaceList() {
        return mySavedPlaces.isEmpty();
    }

    //THIS FUNCTION remove a location to the list
    public void DelPlaces(int placeId) {
        for (Place place : mySavedPlaces) {
            if (place.getID()== placeId){
                System.out.println(place);
                mySavedPlaces.remove(mySavedPlaces.indexOf(place));
                System.out.println("Eliminado");
                break;
            }
        }
    }
    
    //THIS CLEAR myTouristPlaces LIST
    public void DelPlacesList() {
        mySavedPlaces.clear();
    }

    //THIS FUNCTION print Places List
    public void PrintPlaces() {
        if (!EmptyPlaceList()) {
            Comparator<Place> comparadorMultiple = Comparator.comparing(Place::getDepartamento).thenComparing(Comparator.comparing(Place::getNamePlace)).thenComparing(Comparator.comparing(Place::getDistance));
            mySavedPlaces.stream().sorted(comparadorMultiple).forEach(System.out::println);
        } 
    }

    //THIS FUNCTION is to search by name
    public void Search_byName(String namePlace) {
        boolean found = false;
        if (!EmptyPlaceList()) {
            for (Place place : mySavedPlaces) {
                if (place.getNamePlace().equalsIgnoreCase(namePlace)) {
                    System.out.println("Encontrado");
                    System.out.println(place);
                    found = true;
                }
            }
        } else {
            System.out.println("No encontrado");
        }
        
        if (!found && !EmptyPlaceList()) {
            System.out.println("***Vacio");
        }
    }
    
    public Place getPlaceByName(String namePleace){
        if (!EmptyPlaceList()) {
            for (Place place : mySavedPlaces) {
                if (place.getNamePlace().equalsIgnoreCase(namePleace)) {
                    return place;
                }
            }
        }
        System.out.println("***null");
        return null;
    }
    

    //---------------------------------------- VEHICLES ---------------------------------------------------//
    
    public List<Vehicle> ExportMyVehiclesList(){
        return myVehicles;
    }     

    //THIS FUNCTION VALIDATE IF THE ID IS IN
    public Vehicle SearchVehicleID(int vehicleID) {
        for (Vehicle vehicles : myVehicles) {
            if (vehicles.getReference() == vehicleID) {
                return vehicles;
            }
        }
        return null;
    }

    //THIS FUNCTION RETURN TRUE if the Vehicle Id is found(Is use by "GenerateVehicleID")
    public boolean DuplicateVehiculeReference(int newReference) {
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getReference() == newReference) {
                return true;
            }
        }
        return false;
    }

    //THIS GENERATE A NOT DUPLICATE ID
    public int GenerateVehicleReference() {
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
    public boolean EmptyVehiclesList() {
        return myVehicles.isEmpty();
    }

    public boolean MaximumSizeVehiclesList() {
        return myVehicles.size() > 29;
    }

    //This ADD Vehicles to arrayList 
    public void AddVehicle(Vehicle newVehicle) {
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
    public void DelVehicle(int Reference) {
        for (Vehicle vehicle : myVehicles) {
            if (vehicle.getReference() == Reference) {
                System.out.println("                " + vehicle);
                myVehicles.remove(myVehicles.indexOf(vehicle));
                break;
            }
        }
    }
    
    public void DelVehicleList() {
        myVehicles.clear();
    }

    public void PrintVehiclesList() {
        if (!EmptyVehiclesList()) {
            Comparator<Vehicle> comparadorMultiple = Comparator.comparing(Vehicle::getType).thenComparing(Comparator.comparing(Vehicle::getModel));
            myVehicles.stream().sorted(comparadorMultiple).forEach(System.out::println);
            GenericFunctions.WaitAction_Argument(3);
        } else {
            //Interface.Empty();
        }
    }

    public Vehicle getDefaultVehicle() {
        return defaultVehicle[0];
    }
    
    public void setDefaultVehicle(Vehicle vehicle) {
        defaultVehicle[0]=vehicle;
    }
    
    //---------------------------------------- Budgets ---------------------------------------------------//
    
    public ArrayList<BudgetReport> getBudgetReports() {
        return budgetReports;
    }

    public void ImportDefaultReports(List<BudgetReport> list) {
        budgetReports.addAll(list);
    }
    
    //THIS FUNCTION ADD New Reports to arrayList 
    public BudgetReport AutoCompleteReports(int vehicleId, int placeId,double fuelPrice) {
        Vehicle vehicleFound = SearchVehicleID(vehicleId);
        Place placeFound = SearchPlaceID(placeId);
        
        if (vehicleFound != null && placeFound != null) {
            Vehicle selectedVehicle = vehicleFound;
            Place selectedPlace = placeFound;
            
            //INF
            int reportId = GenerateReportID();
            String vehicleType = selectedVehicle.getType();
            String vehicleModel = selectedVehicle.getModel();
            int vehicleReference = selectedVehicle.getReference();
            String nameLocation = selectedPlace.getNamePlace();
            String nameCity = selectedPlace.getCiudad();
            double distanceLocation = selectedPlace.getDistance();
            int placeReference = selectedPlace.getID();
            double travelPrice = (selectedPlace.getDistance()/selectedVehicle.getPerformance())*fuelPrice;

            BudgetReport newReport = new BudgetReport(reportId, vehicleType, vehicleModel, vehicleReference, nameLocation, nameCity, distanceLocation, placeReference, fuelPrice, travelPrice);
            System.out.println(newReport);
            return newReport;
        }
        return null;     
    }

   
//THIS FUNCTION RETURN TRUE if the Report Id is found(Is use by "GenerateReportID")
    public boolean DuplicateReportID(double randomNumber) {
        for (BudgetReport reports : budgetReports) {
            if (reports.getReportId() == randomNumber) {
                return true;
            }
        }
        return false;
    }

    //THIS GENERATE A NOT DUPLICATE ID
    public int GenerateReportID() {
        boolean successfulId = false;
        int IdNumber = 0;
        do {
            int newIDNumber = GenericFunctions.GenerateRandomID();
            if (!DuplicateReportID(newIDNumber)) {
                IdNumber = newIDNumber;
                successfulId = true;
            }
        } while (!successfulId);

        return IdNumber;
    }

    //THIS FUNCTION ADD New Reports to arrayList 
    public void AddReports(BudgetReport report) {
        budgetReports.add(report);   
    }

    //THIS CHECK if empty state
    public boolean EmptyBudgetsList() {
        return budgetReports.isEmpty();
    }

    //THIS FUNCTION remove a Budget to the list
    public void DelReport(int id) {
        for (BudgetReport reports : budgetReports) {
            if (reports.getReportId() == id) {
                System.out.println(reports);
                budgetReports.remove(budgetReports.indexOf(reports));
                break;
            }
        }    
    }
    
    //THIS CLEAR BUDGETSLIST
     public void DelBudgetsList() {
        budgetReports.clear();
    } 

    //THIS FUNCTION print Places List
   /* public void PrintBudgestList() {
        if (!EmptyBudgetsList()) {
            Comparator<BudgetReport> comparadorMultiple = Comparator.comparing(BudgetReport::getReportId).thenComparing(BudgetReport::getVehicleType);
            budgetReports.stream().sorted(comparadorMultiple).forEach(System.out::println);
        }    
    }*/
    
    
    @Override
    public String toString() {
        return "               ► USUARIO: "+ name + "\n\n                   CORREO: " + email + "\n                   N. TELEFONO: " + number + "\n                   INICIOS DE SESION: " + loginTimes + "\n\n";
    }
    
    
    
    
    
    
    
}
