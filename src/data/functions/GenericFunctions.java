package data.functions;

//lista.stream().sorted().forEach(System.out::println);

import java.time.LocalDateTime;

//touristPlaces.stream().sorted(Comparator.comparing(Destino::getNameplace)).forEach(System.out::println);
//touristPlaces.stream().filter(Destino->!Destino.getNameplace().equalsIgnoreCase("Hola")).sorted(Comparator.comparingDouble(Destino::getDistance));
//System.out.println(cursoList);).collect(Collectors.toList())
//List<Curso>cursoList = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
public class GenericFunctions {
    
    public static LocalDateTime today = LocalDateTime.now();
    
    public static String todayDate(){
        return today.getDayOfWeek()+", " + today.getDayOfMonth()+"/"+today.getMonthValue()+"/"+today.getYear();
    }
    
    public static String todayDateAndHour(){
        return today.getDayOfMonth()+"/"+today.getMonthValue()+"/"+today.getYear()+", "+today.getHour()+":"+today.getMinute();
    }
    
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
    
    public static String capitalizeWord(String word){
       String firstLetter=word.substring(0, 1).toUpperCase();
       String anotherLetters=word.substring(1).toLowerCase();
       return firstLetter.concat(anotherLetters);
    }
    
    public static String capitalizeSentences(String word){
        String[] splitWord = word.split(" ");
        String finalWord="";
        for (String words : splitWord) {
            String firstLetter=words.substring(0, 1).toUpperCase();
            String anotherLetters=words.substring(1).toLowerCase();
            finalWord= finalWord.concat(firstLetter.concat(anotherLetters)+" ");
        }
        return finalWord;
    }
    
    //This function verifies that keytyped is only numbers
    public static void inputOnlyNumber(java.awt.event.KeyEvent evt) {
        if (evt.getKeyChar() < 48 || evt.getKeyChar() > 57) {
            evt.consume();
        }
    }
}
