package com.model;

import java.util.Locale;

public class BudgetReport {
    
    private int reportId;
    private String vehicleType;
    private String vehicleModel;
    private int vehicleId;
    private String namePlace;
    private int placeId;
    private double distance;
    private String nameCity;
    private double fuelPrice; //Maybe change double to int
    private double travelPrice;

    public BudgetReport(int reportId, String vehicleType, String vehicleModel, int vehicleId, String namePlace,String nameCity, double distance,int placeId, double fuelPrice, double travelPrice) {
        this.reportId = reportId;
        this.vehicleType = vehicleType.toUpperCase(Locale.ITALY);//Investigate
        this.vehicleModel = vehicleModel.toUpperCase();
        this.vehicleId = vehicleId;
        this.namePlace = namePlace.toUpperCase();
        this.nameCity= nameCity.toUpperCase();
        this.distance = distance;
        this.placeId = placeId;
        this.fuelPrice = fuelPrice;
        this.travelPrice= travelPrice;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(double travelPrice) {
        this.travelPrice = travelPrice;
    }
    
   
   

    @Override
    public String toString() {
        return "               ► " + "NUMERO DE REPORTE: " + reportId + "\n\n                   TIPO DE VEHÍCULO: " + vehicleType + "\n                   MODELO: " + vehicleModel + "\n                   REFERENCIA DE VEHÍCULO: " + vehicleId + "\n                   DESTINO TURISTICO: " + namePlace + "\n                   ID DEL DESTINO: " + 
                placeId + "\n                   CIUDAD: " + nameCity + "\n                   DISTACIA DEL DESTINO: " + distance + "\n                   VALOR DEL COMBUSTIBLE: " + fuelPrice + "\n                   VALOR ESTIMADO DE VIAJE: " + (int)travelPrice +"\n\n";
    }
    
    
    
    
}
