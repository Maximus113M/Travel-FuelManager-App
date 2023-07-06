package data.functions;

//lista.stream().sorted().forEach(System.out::println);
//touristPlaces.stream().sorted(Comparator.comparing(Destino::getNameplace)).forEach(System.out::println);
//touristPlaces.stream().filter(Destino->!Destino.getNameplace().equalsIgnoreCase("Hola")).sorted(Comparator.comparingDouble(Destino::getDistance));
//System.out.println(cursoList);).collect(Collectors.toList())
//List<Curso>cursoList = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
public class GenericFunctions {

    public static void WaitAction_Argument(double seconds) {
        int time = (int) seconds * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            System.out.println("...      ...      ...");
        }
    }

    //default WaitAction function, wait for 4 seconds
    public static void WaitAction() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            System.out.println("...      ...      ...");
        }
    }
    
    //Return random number
    public static int GenerateRandomID() {
    int randomNumber =(int) (Math.random() * 1000) + 1;    
    return randomNumber;
    }

    
}
