public class Main {
    public static void main(String[] args) {
    Student student = new Student();
    student.setName("Hong");
    student.setAge(30);
    student.setMarks(9);
    student.classify();
    student.display();

    Account account = new Account();
    account.setName("Hong");
    account.setAccountNumber("1234-5678-9101-1213");
    account.setEmail("thuhong.tran13081993@gmail.com");
    account.setAccountBalance(100);
    account.displayInfo();
    account.recharge(50);
    account.changeEmail("helentran@gmail.com");
    account.displayInfo();


    }
}
