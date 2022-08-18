public class Student {
    private String id;
    private String name;
    private int age;
    private String classfication;

    public Student(String id, String name, int age, String classfication) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classfication = classfication;
    }

    public void setClassfication(String classfication) {
        this.classfication = classfication;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student" + " Id " + id + '\n'+
                "Name: " + name + '\n'+
                "Age: " + age + '\n'+
                "Classfication: " + classfication + '\n'+ '\n';
        }

    public void classificationOnId (String id){
        if ((id == "No.1") || (id =="No.2") || (id == "No.3")) {
            classfication ="A";
        }
        else if ( (id == "No.4") || (id == "No.5")) {
            classfication="B";
        }
        else{
            classfication="C";
        }
    }

}