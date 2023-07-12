package data.defaultplaces;
     
import com.model.Place;
//import data.controller.PlacesData;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DefaultPlaces {

    public static List defaultListPlaces() {
        
        Place MuseodelOro = new Place("Museo del Oro","bogota", "cundinamarca", 436,1);
        Place LagunadeGuatavita = new Place("Laguna de Guatavita","Guatavita", "cundinamarca", 387,2);
        Place CatedralSalZipaquira = new Place("Catedral de Sal de Zipaquirá","Zipaquira", "cundinamarca", 361,3);
        Place MuseoElFosil = new Place("Museo El Fosil", "Villa de Leyva","boyaca", 258,4);
        Place ParqueAventuraLaChorrera = new Place("Parque Aventura La Chorrera", "Choachi","cundinamarca", 471,5);
        //5
        Place Desiertodelatatacoa = new Place("Desierto de la tatacoa","Villavieja", "Huila", 649,6);
        Place MiradorCañónRíoSuárez = new Place("Mirador Cañón del Río Suárez","Barichara", "santander", 121,7);
        Place LasGachas = new Place("Las Gachas", "guadalupe","santander", 172,8);
        Place LagoTota = new Place("Laguna de Tota","Tota", "boyaca", 371,9);
        Place ParqueChingaza = new Place("Parque Nacional Natural Chingaza","la calera", "cundinamarca", 540,10);
        //10
        Place ParqueElCocuy = new Place("Parque Nacional Natural el Cocuy", "el cocuy","boyaca", 263,11);
        /*Destino Santamarta = new Destino("Santa marta",, "magdalena", 540);
        Destino Santamarta = new Destino("Santa marta",, "magdalena", 540);
        Destino Giron = new Destino("Giron", "santander",, 10);
        Destino Santamarta = new Destino("Santa marta",, "magdalena", 540);
        Destino Santamarta = new Destino("Santa marta",, "magdalena", 540);*/
        
        Place[] defaultItems={MuseodelOro,LagunadeGuatavita,CatedralSalZipaquira,MuseoElFosil,ParqueAventuraLaChorrera,Desiertodelatatacoa,MiradorCañónRíoSuárez,LasGachas,LagoTota,ParqueChingaza,ParqueElCocuy};
        
        List<Place> defaultListPlaces= Arrays.asList(defaultItems);
        Comparator<Place> comparadorMultiple = Comparator.comparing(Place::getDepartamento).thenComparing(Comparator.comparing(Place::getNamePlace));
        
        return defaultListPlaces.stream().sorted(comparadorMultiple).collect(Collectors.toList());        
        //PlacesData.ImportDefaultLocationsList(defaultListPlace);  
    }
    
     public static Place searchPlaceDefaultPlaces(int placeID) {
         List<Place>list=defaultListPlaces();
         for (Place place : list) {
            if (place.getID() == placeID) {
                return place;
            }
        }
        return null;
    }    
}
