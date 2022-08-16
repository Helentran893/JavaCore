import java.sql.SQLOutput;

public class Student implements Iclassification {
    private String name;
    private double age;
    private double marks;
    private String classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public void classify() {
        if (marks >= 8) {
            this.classification = "A";
        }
        else if ((marks > 6.5) & (marks < 8)) {
            this.classification = "B";
        }
        else{
            this.classification = "C";
        }
    }

    @Override
    public void display() {
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks+" Classification: "+classification);
    }
}
