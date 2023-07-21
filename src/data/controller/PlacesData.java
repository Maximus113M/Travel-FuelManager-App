package data.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import com.model.Place;
import java.util.HashMap;



//lista.stream().sorted().forEach(System.out::println);
//touristPlaces.stream().sorted(Comparator.comparing(Destino::getNameplace)).forEach(System.out::println);
//touristPlaces.stream().filter(Destino->!Destino.getNameplace().equalsIgnoreCase("Hola")).sorted(Comparator.comparingDouble(Destino::getDistance));
//System.out.println(cursoList);).collect(Collectors.toList())
//List<Curso>cursoList = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
public class PlacesData {

    private static HashMap<String, List<String>> cities= new HashMap<>();
    
   public static void fillCities(){
        List<String>amazonasCities= Arrays.asList("Leticia", "Puerto Nariño", "Puerto Leguízamo", "Puerto Asís", "La Chorrera", "El Encanto", "La Pedrera", "Puerto Caicedo", "San Miguel", "Puerto Guzmán");
        cities.put("Amazonas",amazonasCities );       
        List<String>antioquiaCities= Arrays.asList("Medellín", "Bello", "Itagüí", "Envigado", "Sabaneta", "Caldas", "Copacabana", "Giradota", "Rionegro", "El Carmen de Viboral", "El Santuario", "Guarne", "San Vicente Ferrer", "Guarne", "San Vicente Ferrer", "Marinilla");
        cities.put("Antioquia",antioquiaCities );
        List<String>araucaCities= Arrays.asList("Arauca", "Aramita", "Arauquita", "Cravo Norte", "Fortul", "Puerto Rondón", "Saravena", "Tame");
        cities.put("Arauca",araucaCities );
        List<String>atlánticoCities= Arrays.asList("Barranquilla", "Soledad", "Malambo", "Galapa", "Puerto Colombia", "Sabanalarga", "Baranoa", "Palmar de Varela", "Piojó", "Usiacurí");
        cities.put("Atlántico",atlánticoCities );
        List<String>bolivarCities= Arrays.asList("Cartagena de Indias", "Magangué", "Mompóx", "Turbaco", "San Jacinto", "El Carmen de Bolívar", "Sincelejo", "San Juan de Nepomuceno", "Montería", "Soledad");
        cities.put("Bolívar",bolivarCities );
        List<String>boyacáCities= Arrays.asList("Tunja", "Duitama", "Sogamoso", "Zipaquirá", "Paipa", "Chivata", "Villa de Leyva", "Ráquira", "Santa Rosa de Viterbo", "La Mesa de Los Santos");
        cities.put("Boyacá",boyacáCities );
        List<String>caldasCities= Arrays.asList("Manizales", "Chinchiná", "Aranzazu", "Aguadas", "Marmato", "La Dorada", "Neira", "Villamaría", "Anserma", "Pácora");
        cities.put("Caldas",caldasCities );
        List<String>caquetáCities= Arrays.asList("Florencia", "Cartagena del Chairá", "Curillo", "El Doncello", "El Paujil", "La Montañita", "Morelia", "Puerto Rico", "San Vicente del Caguán", "Solano");
        cities.put("Caquetá",caquetáCities );
        List<String>casanareCities= Arrays.asList("Yopal", "Aguazul", "Tauramena", "Trinidad", "Villanueva", "Paz de Ariporo", "Hato Corozal", "Maní", "Monterrey", "Nunchía");
        cities.put("Casanare",casanareCities );
        List<String>caucaCities= Arrays.asList("Popayán", "Cajibío", "Caloto", "Almaguer", "Guapi", "El Tambo", "Corinto", "Balboa", "Bolívar", "Buenos Aires", "La Vega", "Morales", "Guachené", "Puerto Tejada", "Totoró", "Toribio", "Puracé", "Inza", "Suarez", "Mercaderas", "Timbío", "Silvia", "Caldono", "Miranda", "Piendamó", "Santander de Quilichao", "Jambaló", "Páez", "La Sierra", "Sotará", "Timbiqui", "Villa Rica", "Padilla", "Patía", "Rosas", "San Sebastián", "Micay", "Santa Rosa", "Sucre", "Piamonte", "Florencia", "Argelia", "El Bordo, Argelia");
        cities.put("Cauca",caucaCities );
        List<String>cesarCities= Arrays.asList("Valledupar", "Agustín Codazzi", "Aguachica", "Bosconia", "Curumaní", "Gamarra", "La Paz", "Manaure", "Pailitas", "Pelaya", "San Martín", "San Diego", "San Alberto", "San Juan del Cesar", "Tamalameque");
        cities.put("Cesar",cesarCities );
        List<String> chocóCities= Arrays.asList("Quibdó", "Condoto", "Medio Baudó", "Juradó", "Unguía", "Tadó", "Bahía Solano", "Bahía de Portete", "Novita");
        cities.put("Chocó",chocóCities );
        List<String> córdobaCities= Arrays.asList("Montería", "Ciénaga de Oro", "Planeta Rica", "Córdoba", "Lorica", "San Pelayo", "Ayapel", "Moñitos", "San Bernardo del Viento", "Momil");
        cities.put("Córdoba",córdobaCities );
        List<String> cundinamarcaCities= Arrays.asList("Bogotá", "Zipaquirá", "Facatativá", "Soacha", "Cajicá", "Girardot", "Tocancipá", "Chía", "Mosquera", "Funza");
        cities.put("Cundinamarca",cundinamarcaCities );
        List<String> guainíaCities= Arrays.asList("Inírida", "Cacahual", "La Guadalupe", "Morichal Nuevo", "Pana Pana", "Puerto Colombia");
        cities.put("Guainía",guainíaCities );
        List<String> guaviareCities= Arrays.asList("San José del Guaviare", "Calamar", "El Retorno", "Miraflores");
        cities.put("Guaviare",guaviareCities );
        List<String> huilaCities= Arrays.asList("Neiva", "La Plata", "Garzón", "Aipe", "Gigante", "Tello", "Isnos", "Santa María", "Pitalito", "Oporapa");
        cities.put("Huila",huilaCities );
        List<String> laGuajiraCities= Arrays.asList("Riohacha", "Maicao", "Uribia", "Manaure", "El Molino", "Barrancas", "Hatonuevo", "La Jagua del Pilar", "Dibulla", "Albania", "San Juan del Cesar", "Fonseca", "Distracción", "Villanueva", "Urumita");
        cities.put("La Guajira",laGuajiraCities );
        List<String> magdalenaCities= Arrays.asList("Santa Marta", "Ciénaga", "Palonegro", "El Banco", "Sabana de Torres", "Galerazamba", "Aracataca", "Fundacion", "Barrancabermeja", "Magangue");
        cities.put("Magdalena",magdalenaCities );
        List<String> metaCities= Arrays.asList("Villavicencio", "Acacías", "Barranca de Upía", "Castilla la Nueva", "Cochabamba", "El Calvario", "Guamal", "La Macarena", "Puerto López", "Uribe");
        cities.put("Meta",metaCities );
        List<String> nariñoCities= Arrays.asList("Pasto", "Ipiales", "Tuquerres", "La Unión", "Sandoná", "Leiva", "Iles", "Cumbal", "Chachagüí", "Guachucal");
        cities.put("Nariño",nariñoCities );
        List<String> nortedeSantanderCities= Arrays.asList("Cúcuta", "Ocaña", "Pamplona", "Los Patios", "Villa del Rosario");
        cities.put("Norte de Santander",nortedeSantanderCities);
        List<String> putumayoCities= Arrays.asList("Mocoa", "Puerto Asís", "Puerto Caicedo", "Puerto Guzmán", "Orito", "San Miguel", "Valle del Guamuéz", "Colón", "Sibundoy", "San Francisco");
        cities.put("Putumayo",putumayoCities);
        List<String> quindíoCities= Arrays.asList("Armenia", "Calarcá", "Quimbaya", "Montenegro", "Pijao", "Génova", "La Tebaida", "Filandia", "Circasia", "Córdoba", "Salento");
        cities.put("Quindío",quindíoCities);
        List<String> risaraldaCities= Arrays.asList("Pereira", "Dosquebradas", "Santa Rosa de Cabal", "Marsella", "Apía", "Balboa", "Belén de Umbría", "Guática", "La Celia", "La Virginia", "Quinchía", "Santuario", "Mistrató", "Pueblo Rico");
        cities.put("Risaralda",risaraldaCities);
        List<String> sanAndrésyProvidenciaCities= Arrays.asList("San Andrés", "Providencia", "Santa Catalina");
        cities.put("San Andrés y Providencia",sanAndrésyProvidenciaCities);
        List<String> santanderCities= Arrays.asList("Bucaramanga", "San Gil", "Floridablanca", "Piedecuesta", "Barrancabermeja");
        cities.put("Santander",santanderCities);
        List<String> sucreCities= Arrays.asList("Sincelejo", "Corozal", "San Marcos", "Tolú", "Caimito", "La Unión", "San Onofre", "Buenavista", "Santiago de Tolú", "Majagual");
        cities.put("Sucre",sucreCities);
        List<String> tolimaCities= Arrays.asList("Ibagué", "Espinal", "Melgar", "Honda", "Mariquita", "Líbano", "Alvarado", "Purificación", "Chaparral", "Girardot", "Flandes");
        cities.put("Tolima",tolimaCities);
        List<String> valledelCaucaCities= Arrays.asList("Cali", "Yumbo", "Palmira", "Cartago", "Buga", "Fusagasugá", "Dolores", "Guacarí", "Jamundí", "La Cumbre", "La Unión", "Piendamó", "Río Claro", "San Pedro", "Toro", "Trujillo", " Tuluá");
        cities.put("Valle del Cauca",valledelCaucaCities);
        List<String> vaupésCities= Arrays.asList("Mitú", "Pacoa", "Papunahua", "Yavaraté", "Carurú", "Taraira", "Acaricuara", "Villa Fátima");
        cities.put("Vaupés",vaupésCities);
        List<String> vichadaCities= Arrays.asList("Puerto Carreño", "La Primavera", "Cumaríbo", "Santa Rosalía", "San José de Ocúñe");
        cities.put("Vichada",vichadaCities);
    }
    
   public static HashMap getHashCities(){
        return cities;
   }
   
   public static List<String> getListCities(String ciudad){
        return cities.get(ciudad);
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //THIS CHECK if empty state
   /* public static boolean EmptyPlaceList() {
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
