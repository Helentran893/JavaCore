import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter name of Manager: ");
        Scanner scanner = new Scanner(System.in);
        String nameOfManager = scanner.nextLine();
        System.out.println("Enter name of Teacher: ");
        String nameOfTeacher = scanner.nextLine();


        Student student1 = new Student("No.1","Nguyen Van A",18,"A");
        Student student2 = new Student("No.2","Nguyen Van B",19,"B");
        Student student3 = new Student("No.3","Nguyen Van C",19,"A");
        Student student4 = new Student("No.4","Nguyen Van D",18,"C");
        Student student5 = new Student("No.5","Nguyen Van E",20,"B");

        ArrayList<Student> students = new ArrayList<>();
        students.add(0,student1);
        students.add(1,student2);
        students.add(2,student3);
        students.add(3,student4);
        students.add(4,student5);

        Session session = new Session("Java",students);

        System.out.println("Techmaster:"+"\n"+"Name of Manager: "+nameOfManager+"\n"+"Name of Teacher: "+nameOfTeacher+"\n"+session.toString());

        System.out.println("Thực hiện thêm học viên vào lớp hiện tại");
        Student studentNew = new Student("No.6","Nguyen Van F", 21,"B");
        students.add(5,studentNew);
        System.out.println(students.toString());

        System.out.println("Thực hiện cập nhật thông tin học lực của 1b học viên dựa vào Id");
        student2.classificationOnId(student2.getId());
        studentNew.classificationOnId(studentNew.getId());
        System.out.println(students.toString());

        System.out.println("Có 1 bạn xin nghỉ học, hãy giúp thầy xóa bạn đó khỏi lớp học");
        students.remove(3);
        System.out.println(students.toString());

        }

    }

