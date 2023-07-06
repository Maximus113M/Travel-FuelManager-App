package data.controller;

import java.util.ArrayList;
import java.util.Comparator;
import com.model.Place;
import data.defaultplaces.DefaultPlaces;
import java.util.List;

//lista.stream().sorted().forEach(System.out::println);
//touristPlaces.stream().sorted(Comparator.comparing(Destino::getNameplace)).forEach(System.out::println);
//touristPlaces.stream().filter(Destino->!Destino.getNameplace().equalsIgnoreCase("Hola")).sorted(Comparator.comparingDouble(Destino::getDistance));
//System.out.println(cursoList);).collect(Collectors.toList())
//List<Curso>cursoList = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
public class PlacesData {

    private static List<Place> myTouristPlaces = new ArrayList();

    //THIS FUNCTION IMPORT DEFAULT PLACES
    public static void ImportDefaultPlacesList(List<Place> list) {
        myTouristPlaces.addAll(list);
    }
    //*** FUNCTIONS WAS IMPORT TO USER***
    
    //THIS FUNCTION EXPORT  PLACE LIST
    /* public static List<Place> ExportPlacesList() {
        return myTouristPlaces;    
    }
    
    //THIS FUNCTION VALIDATE IF THE ID IS IN
    public static boolean SearchDuplicatePlace(int placeID) {
        List<Place>defaultPlacesList= myTouristPlaces;
        for (Place destino : defaultPlacesList) {
            if (destino.getID() == placeID) {
                return true;
            }
        }
        return false;
    } 
    
    //THIS FUNCTION ADD new Place to arrayList 
    public static void AddPlaceToSavesList(Place destino) {
        myTouristPlaces.add(destino);
        
    }

    //THIS FUNCTION ADD new Place to arrayList 
    public static void AddNewPlace(Place destino) {
        if (!destino.getNamePlace().equals("") && !destino.getCiudad().equals("") && !destino.getDepartamento().equals("") && destino.getDistance() > 0) {
            myTouristPlaces.add(destino);
        }else{
            System.out.println("No anhadido");
        }
    }

    //THIS CHECK if empty state
    public static boolean EmptyPlaceList() {
        return myTouristPlaces.isEmpty();
    }

    //THIS FUNCTION remove a location to the list
    public static void DelPlaces(String search) {
        boolean found = false;
        for (Place destino : myTouristPlaces) {
            if (destino.getNamePlace().equalsIgnoreCase(search)) {
                //Interface.Found();
                System.out.println(destino);
                myTouristPlaces.remove(myTouristPlaces.indexOf(destino));
                found = true;
                //Interface.SuccessfulAction();
                break;
            }
        }
        if (!found) {
            //Interface.NotFound();
        }

    }
    
    //THIS CLEAR myTouristPlaces LIST
    public static void DelPlacesList() {
        myTouristPlaces.clear();
    }

    //THIS FUNCTION print Places List
    public static void PrintPlaces() {
        if (!EmptyPlaceList()) {
            Comparator<Place> comparadorMultiple = Comparator.comparing(Place::getDepartamento).thenComparing(Comparator.comparing(Place::getNamePlace)).thenComparing(Comparator.comparing(Place::getDistance));
            myTouristPlaces.stream().sorted(comparadorMultiple).forEach(System.out::println);
        } else {
            //nterface.Empty();
        }
    }

    //THIS FUNCTION is to search by name
    public static void Search_byName(String namePlace) {
        boolean found = false;
        if (!EmptyPlaceList()) {
            for (Place destino : myTouristPlaces) {
                if (destino.getNamePlace().equalsIgnoreCase(namePlace)) {
                    System.out.println(" ");
                    //Interface.Found();

                    System.out.println(destino);
                    found = true;
                }
            }
        } else {
            //Interface.Empty();
        }
        
        if (!found && !EmptyPlaceList()) {
            //Interface.NotFound();
        }
    }
    
    public static Place getPlaceByName(String namePleace){
        if (!EmptyPlaceList()) {
            for (Place destino : myTouristPlaces) {
                if (destino.getNamePlace().equalsIgnoreCase(namePleace)) {
                    return destino;
                }
            }
        }
        return null;
    }*/
    //THIS FUNCTION VALIDATE IF THE ID IS IN
    public static Place SearchPlaceID(int placeID, List<Place> dataList) {
        for (Place destino : dataList) {
            if (destino.getID() == placeID) {
                return destino;
            }
        }
        return null;
    }
    
    //THIS CHECK if empty state
    public static boolean EmptyPlaceList() {
        return myTouristPlaces.isEmpty();
    }

    //THIS FUCTION is to search by distance
    public static void Search_distance(Double distanceLocation) {
        boolean found = false;
        boolean defaultFound = false;
        ArrayList<Place> locationsNames = new ArrayList();
        if (EmptyPlaceList()) {
            //Interface.Empty();

        } else {
            //Searching
            for (Place destino : myTouristPlaces) {
                if (distanceLocation == destino.getDistance()) {
                    //Interface.Found();
                    System.out.println(destino);
                    locationsNames.add(destino);
                    found = true;
                }
            }
            if (found) {
                //
            } else {
                System.err.println("          • • • ¡No hay coincidencias! • • •");
            }

            System.out.println("                        Mostrando           ");
            System.out.println("               Ubicaciones cercanas(50 KM) ");
            //This part print close locations and print without items found
            for (Place destino : myTouristPlaces) {
                if (destino.getDistance() > distanceLocation - 50 && destino.getDistance() < distanceLocation + 50) {
                    if (found) {
                        for (Place locationFound : locationsNames) {
                            if (destino.getNamePlace().equalsIgnoreCase(locationFound.getNamePlace()) && destino.getDistance() == locationFound.getDistance()) {
                            } else {
                                System.out.println(destino);
                                found = true;
                                defaultFound = true;
                            }
                        }
                    } else {
                        System.out.println(destino);
                        defaultFound = true;
                    }

                }
            }

            if (defaultFound) {
                //
            }
        }

        if (!found && !defaultFound) {
            //Interface.NotFound();
        }
    }

    //THIS FUNCTION IS PAUSED BY NOW=IS NOT USE
    /* public static void AddManyLocations(Destino place1, Destino place2, Destino place3, Destino place4, Destino place5) {
        ArrayList<Destino> intputNewLocations = new ArrayList<>(Arrays.asList(place1, place2, place3, place4, place5));
        myTouristPlaces.addAll(intputNewLocations);
    }*/
    //THIS FUNCTION edit a location to the list but need more atributes to be util.
    /* public static int EditLocation(String search) {
        for (Destino destino : myTouristPlaces) {
            if (destino.getNameplace().equalsIgnoreCase(search)) {
                System.out.println(" Ubicacion encontrada ");

                return myTouristPlaces.indexOf(destino);
            } else {
                System.out.println(" Ubicacion no encontrada ");
            }

        }
        return -1;
    }*/
}
