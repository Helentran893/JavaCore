import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class User {
String id;
String name;
Gender gender;
LocalDate birthday;
String email;
String phoneNumber;

public User(String id, String name, Gender gender, String birthday, String email, String phoneNumber){
    this.id = id;
    this.name = name;
    this.gender = gender;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    this.birthday = LocalDate.parse(birthday,formatter);
    this.email = email;
    this.phoneNumber = phoneNumber;
}

public void printInfo(){
    System.out.println("User" + id + " " + name + " " + gender + " " + birthday + " " + email + " " + phoneNumber);
}
    
}
