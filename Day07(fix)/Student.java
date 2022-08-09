import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student extends User{
    Isonline onlineLearning;
    String background;

    public Student(String id, String name, Gender gender, String birthday, String email, String phoneNumber, Isonline onlineLearning, String background){
        super(id,name,gender,birthday,email,phoneNumber);
        this.onlineLearning = onlineLearning;
        this.background = background;
    }

    @Override
        public void printInfo(){
            System.out.println("Student" + id + " " + name + " " + gender + " " + birthday + " " + email + " " + phoneNumber + " "  + onlineLearning+ " "  + background);
        }
    }
