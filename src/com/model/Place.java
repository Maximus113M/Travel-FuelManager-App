
package com.model;

//import java.util.Objects;

import data.functions.GenericFunctions;



public class Place /*implements Comparable<Destino>*/ {
   private String namePlace;
   private String ciudad;
   private String departamento;
   private double distance=0;
   private int ID=526;
   
   
    public Place(String nameplace,String ciudad,String departamento,double distance, int id) {
        this.namePlace = GenericFunctions.capitalizeSentences(nameplace);
        this.ciudad=GenericFunctions.capitalizeSentences(ciudad);
        this.distance = distance;
        this.departamento= GenericFunctions.capitalizeSentences(departamento);
        this.ID=id;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
        
    

    @Override
    public String toString() {
        return  "               ► "+namePlace + ":\n\n                   CIUDAD: " + ciudad +"\n                   DEPARTAMENTO: " + departamento + "\n                   DISTACIA: "+ distance +" (KM)"+ "\n                   ID: "+ ID +" \n \n";
    }

    /*@Override
    public int compareTo(Place o) {
        /*double byDistance = Double.compare(distance, o.distance);
        if ( byDistance != 0 ) {
            return byDistance;
        }
        
        return namePlace.compareToIgnoreCase(o.namePlace);
    }*/

    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.namePlace);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.distance) ^ (Double.doubleToLongBits(this.distance) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Place other = (Place) obj;
        if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(other.distance)) {
            return false;
        }
        return Objects.equals(this.namePlace, other.namePlace);
    }*/
    
    

  
   
   
    
}


