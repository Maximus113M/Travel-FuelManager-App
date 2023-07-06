package data.controller;

import com.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserData {

    private static final ArrayList<User> usersList = new ArrayList();
    private static final List<User> activeUser= new ArrayList(1);

    public static User getActiveUser() {
        return activeUser.get(0);
    }

    public static void setActiveUser(User user) {
        activeUser.add(0, user);
    }
   
    
    public static ArrayList<User> getUsers() {
        return usersList;
    }
    

    public static void AddAdmin() {
        User Admin = new User("Camilo", "camilo@", "3144777990", "123");
        usersList.add(Admin);
    }
    
    public static User ActiveUser(String email) {
        for (User user : usersList) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    } 

    public static void LogInTimes(User user) {
        int times = user.getLoginTimes();
        times++;
        user.setLoginTimes(times);

    }

    //THIS FUNCTION CHECK IF userList IS EMPTY
    public static boolean EmptyUserList() {
        return usersList.isEmpty();
    }

    //THIS FUNCTION RETURN TRUE if the email is found(Is use by "AddUser")
    public static boolean DuplicateUser(String newUserEmail) {
        for (User user : usersList) {
            if (user.getEmail().equalsIgnoreCase(newUserEmail)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean validateName(String name) {
        return name.length() > 1 && !name.contains("  ");
    }
    
    public static boolean validateEmail(String email) {
        return email.length() > 4 && !email.contains(" ") && email.contains("@");
    }  

    public static boolean validatePassword(String password, String repeatPassword ) {
        return password.length() > 4 && !password.contains(" ") && password.equals(repeatPassword);
    }
    
    public static boolean validateNumber(String number) {
        return number.length() == 10 && number.startsWith("3") ;    
    }

    //THIS FUNCTION add new users
    public static boolean AddUser(String name, String email, String password, String repeatPassword, String number) {
        if (!DuplicateUser(email)) {
            if (validateName(name) && validateEmail(email) && validatePassword(password, repeatPassword) && validateNumber(number)){
                User user= new User(name, email, number, password);
                usersList.add(user);
                System.out.println("\n USUARIO CREADO \n");
                return true;
            } else{
                System.out.println("\n USUARIO NO CREADO \n");
            }
        }else{
                System.out.println("\n USUARIO YA CREADO \n");
            } 
        return false;
    }

    //THIS FUNCTION remove users to the list
    public static void DelUser(String search) {
        boolean found = false;
        for (User user : usersList) {
            if (user.getName().equalsIgnoreCase(search)) {
                usersList.remove(usersList.indexOf(user));
                found = true;
                //TODO
                break;
            }
        }
        if (!found) {
            //TODO
        }
    }

    public static boolean validateUser(String userEmail, String userPassword) {
        for (User user : usersList) {
            if (user.getEmail().equalsIgnoreCase(userEmail) && user.getPassword().equals(userPassword)) {
                System.out.println("\n              ✔ ☺ CREDENCIALES VALIDAS ☻ ✔    \n");
                return true;
            }
        }
        System.out.println("\n         ✘ • • • CREDENCIALES INVALIDAS • • • ✘    \n");
        return false;
    }
    
    
    //THIS FUNCTION print UserList
   /* public static void PrintUserList() {
        if (!EmptyUserList()) {
            Comparator<User> comparadorMultiple = Comparator.comparing(User::getName).thenComparing(Comparator.comparing(User::getLastName));
            usersList.stream().sorted(comparadorMultiple).forEach(System.out::println);
            Functions.WaitAction_Argument(6);
        } else {
            Interface.Empty();
        }
    }

    */

}
