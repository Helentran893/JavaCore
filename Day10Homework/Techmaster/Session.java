import java.util.ArrayList;

public class Session {
    private String subject;
    private ArrayList<Student> students;

    public Session(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Session " + '\n' +
                "Subject: " + subject + '\n' +
                "Students: " + '\n' +
                students + '\n'+ '\n';
    }


}
