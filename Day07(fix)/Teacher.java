import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Teacher extends User {
    int yearOfExperiences;
    String speciality;

public Teacher(String id, String name, Gender gender, String birthday, String email, String phoneNumber, int yearOfExperiences, String speciality){
    
    super(id,name,gender,birthday, email, phoneNumber);
    this.birthday = LocalDate.parse(birthday,formatter);
    this.yearOfExperiences = yearOfExperiences;
    this.speciality = speciality;
}

@Override
        public void printInfo(){
            System.out.println("Teacher" + id + " " + name + " " + gender + " " + birthday + " " + email + " " + phoneNumber + " "  + yearsOfExperience+ " "  + speciality);
        }
}
