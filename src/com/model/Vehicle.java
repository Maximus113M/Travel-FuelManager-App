
package com.model;

import data.functions.GenericFunctions;

public class Vehicle {
    private String type;
    private String model;
    private double performance;
    private int reference;

    public Vehicle(String tipo, String modelo, double rendimientoCombustible,int refencia) {
        this.type= tipo;
        this.model = GenericFunctions.capitalizeSentence(modelo);
        this.performance = rendimientoCombustible;
        this.reference= refencia;
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }



    @Override
    public String toString() {
        return "                 \n" + "              ► TIPO: " + type +"\n\n"+"                 MODELO: " + model + "\n                 RENDIMIENTO(KM/GALON): " + performance + "\n"+ "                 REFERENCIA: " + reference+ "\n\n" ; 
    }
    
    
}
