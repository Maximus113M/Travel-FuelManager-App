package data.functions;

//lista.stream().sorted().forEach(System.out::println);

import java.time.LocalDateTime;
//import java.util.Date;
import com.model.Day;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

//touristPlaces.stream().sorted(Comparator.comparing(Destino::getNameplace)).forEach(System.out::println);
//touristPlaces.stream().filter(Destino->!Destino.getNameplace().equalsIgnoreCase("Hola")).sorted(Comparator.comparingDouble(Destino::getDistance));
//System.out.println(cursoList);).collect(Collectors.toList())
//List<Curso>cursoList = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
public class GenericFunctions {
    
    //private Date today = new Date();
    private final static Border defaultBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(190, 190, 190));
    private static final Border errorBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(252, 0, 0));
    
    public static Border getDefaultBorder(){
        return defaultBorder;
    }
    
    public static Border getWrongBorder(){
        return errorBorder;
    }
    
    public static String dayOfWeek(){
        LocalDateTime today = LocalDateTime.now();
        String[]days={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        for(Day day: Day.values()){
           if(today.getDayOfWeek().toString().equalsIgnoreCase(day.toString())){
               int ordinal = day.ordinal();
               return days[ordinal];
           } 
        }
        return "NotData";      
    }
    
    public static String todayDate(){
        LocalDateTime today = LocalDateTime.now();
        return dayOfWeek()+", " + today.getDayOfMonth()+"/"+today.getMonthValue()+"/"+today.getYear();
    }
    
    public static String todayDateAndHour(){
        LocalDateTime today = LocalDateTime.now();
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
