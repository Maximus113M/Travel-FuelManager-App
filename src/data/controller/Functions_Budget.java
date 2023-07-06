package data.controller;

import java.util.ArrayList;
import java.util.Comparator;
import com.model.Vehicle;
import com.model.Place;
import com.model.BudgetReport;
import java.util.List;

public class Functions_Budget {

    //FUNCTIONS...
    private static final ArrayList<BudgetReport> budgetReports = new ArrayList();

    public static ArrayList<BudgetReport> getBudgetReports() {
        return budgetReports;
    }

    public static void ImportDefaultReports(List<BudgetReport> list) {
        budgetReports.addAll(list);
    }
    /*
    //THIS FUNCTION ADD New Reports to arrayList 
    public static BudgetReport AutoCompleteReports(int vehicleId, int placeId,double fuelPrice) {
        Vehicle vehicleFound = Functions_Vehicle.SearchVehicleID(vehicleId);
        Destino placeFound = Functions_Places.SearchPlaceID(placeId);
        
        if (vehicleFound != null && placeFound != null) {
            Vehicle selectedVehicle = vehicleFound;
            Destino selectedDestino = placeFound;
            
            //INF
            int reportId = GenerateReportID();
            String vehicleType = selectedVehicle.getType();
            String vehicleModel = selectedVehicle.getModel();
            int vehicleReference = selectedVehicle.getReference();
            String nameLocation = selectedDestino.getNameplace();
            String nameCity = selectedDestino.getCiudad();
            double distanceLocation = selectedDestino.getDistance();
            int placeReference = selectedDestino.getID();
            double travelPrice = (selectedDestino.getDistance()/selectedVehicle.getPerformance())*fuelPrice;

            BudgetReport newReport = new BudgetReport(reportId, vehicleType, vehicleModel, vehicleReference, nameLocation, nameCity, distanceLocation, placeReference, fuelPrice, travelPrice);
            Interface.SuccessfulAction2();
            System.out.println(newReport);
            Interface.SaveOrNot();
            return newReport;
        } else {
            Interface.InvalidData();
            Interface.FailedAction2();
            return null;
        }  
    }

   
//THIS FUNCTION RETURN TRUE if the Report Id is found(Is use by "GenerateReportID")
    public static boolean DuplicateReportID(double randomNumber) {
        for (BudgetReport reports : budgetReports) {
            if (reports.getReportId() == randomNumber) {
                return true;
            }
        }
        return false;
    }

    //THIS GENERATE A NOT DUPLICATE ID
    public static int GenerateReportID() {
        boolean successfulId = false;
        int IdNumber = 0;
        do {
            int newIDNumber = Functions.GenerateRandomID();
            if (!DuplicateReportID(newIDNumber)) {
                IdNumber = newIDNumber;
                successfulId = true;
            }
        } while (!successfulId);

        return IdNumber;
    }

    //THIS FUNCTION ADD New Reports to arrayList 
    public static void AddReports(BudgetReport report) {
        budgetReports.add(report);
        Interface.SaveAction();     
    }

    //THIS CHECK if empty state
    public static boolean EmptyBudgetsList() {
        return budgetReports.isEmpty();
    }

    //THIS FUNCTION remove a Budget to the list
    public static void DelReport(int id) {
        boolean found = false;
        for (BudgetReport reports : budgetReports) {
            if (reports.getReportId() == id) {
                Interface.Found();
                System.out.println(reports);
                budgetReports.remove(budgetReports.indexOf(reports));
                found = true;
                Interface.SuccessfulAction();
                break;
            }
        }
        if (!found) {
            Interface.NotFound();
        }
    }
    
    //THIS CLEAR BUDGETSLIST
     public static void DelBudgetsList() {
        budgetReports.clear();
        Interface.LineBreak();
        Interface.DelAction();
        Interface.Loading();
    } 

    //THIS FUNCTION print Places List
    public static void PrintBudgestList() {
        if (!EmptyBudgetsList()) {
            Comparator<BudgetReport> comparadorMultiple = Comparator.comparing(BudgetReport::getReportId).thenComparing(BudgetReport::getVehicleType);
            budgetReports.stream().sorted(comparadorMultiple).forEach(System.out::println);
            Functions.WaitAction_Argument(4);
        } else {
            Interface.Empty();
        }
    }*/

}
