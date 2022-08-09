import java.util.*;
import java.localDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HomeworkDay07{
public static void main (String[] args){

    Teacher[] teacherGroup = new Teacher[2];
    
    teacherGroup[0] = new Teacher("No 1", 
                                "Helen", 
                                Gender.FEMALE, 
                                "01/02/2000", 
                                "thuhong.tran13081993@gmail.com", 
                                "0338622142", 
                                5, 
                                "Java Developer");

    teacherGroup[1] = new Teacher("No 2", 
                                "Leo", 
                                Gender.MALE, 
                                "02/03/1888", 
                                "hieu.tran23091993@gmail.com", 
                                "0338622144", 
                                4, 
                                "Backend Developer");

    Student[] studentGroup = new Student[6];
    
    studentGroup[0] = new Student("ST01",
                                "Nguyen Van A",
                                Gender.MALE,
                                "03/03/1876",
                                "A2010@gmail.com",
                                "0123456789",
                                Isonline.ONLINE,
                                "Student");

    studentGroup[1] = new Student("ST02",
                                "Nguyen Van B",
                                Gender.MALE,
                                "04/02/2000",
                                "A2011@gmail.com",
                                "0123456788",
                                Isonline.OFFLINE,
                                "Student");

    studentGroup[2] = new Student("ST03",
                                "Nguyen Thu C",
                                Gender.FEMALE,
                                "05/01/2002",
                                "A2012@gmail.com",
                                "0123456787",
                                Isonline.OFFLINE,
                                "Worker");
    
    studentGroup[3] = new Student("ST04",
                                "Nguyen Thu D",
                                Gender.FEMALE,
                                "05/01/2003",
                                "A2008@gmail.com",
                                "0123456786",
                                Isonline.OFFLINE,
                                "Worker");

    studentGroup[4] = new Student("ST05",
                                "Nguyen Thu E",
                                Gender.FEMALE,
                                "05/01/2004",
                                "A2007@gmail.com",
                                "0123456785",
                                Isonline.ONLINE,
                                "Worker");

    studentGroup[5] = new Student("ST06",
                                "Nguyen Van F",
                                Gender.MALE,
                                "05/01/2005",
                                "A2006@gmail.com",
                                "0123456784",
                                Isonline.OFFLINE,
                                "Worker");


    for(Student st: studentGroup){
        st.printInfo();
    }
}
}
