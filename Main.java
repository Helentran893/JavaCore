import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        static Scanner scanner = new Scanner(System.in);

        // SuccessfulLogin
        //Thay đổi username
        private static void changeUserName(ArrayList<User> users) {
            System.out.println("Enter username hien tai");
            String userNameOld = scanner.nextLine();
            for (User us : users) {
                if (us.checkUserNameEqual(userNameOld)) {
                    System.out.println("Enter userName mới");
                    String userNamenew = scanner.nextLine();
                    us.setUserName(userNamenew);
                    System.out.println(users.toString());
                    break;
                }
            }
        }


        //Thay đổi email
        private static void changeEmail(ArrayList<User> users) {
            System.out.println("Enter email hien tai");
            String emailOld = scanner.nextLine();
            for (User us : users) {
                if (us.checkEmailEqual(emailOld)) {
                    System.out.println("Enter email mới");
                    String emailnew = scanner.nextLine();
                    us.setEmail(emailnew);
                    System.out.println(users.toString());
                    break;
                }
            }
        }

        //Thay đổi mật khẩu
        private static void changePassword(ArrayList<User> users) {
            System.out.println("Enter password hien tai");
            String passwordOld = scanner.nextLine();
            for (User us : users) {
                if (us.checkPasswordEqual(passwordOld)) {
                    System.out.println("Enter password mới");
                    String passwordnew = scanner.nextLine();
                    us.setUserName(passwordnew);
                    System.out.println(users.toString());
                    break;
                }
            }
        }

        //Đăng xuất
        public static void logOut(){
            System.out.println("1 - Log in");
            System.out.println("2 - Register");
            System.out.println("Press 1 - Log in/Press 2 - Register");
        }


        private static void successfulLogIn(ArrayList<User> users, String userName) {
            System.out.println("Chao mung<" + userName +">");

            boolean isQuit = false;
            while (true) {
                System.out.println("1 - Thay đổi username");
                System.out.println("2 - Thay đổi email");
                System.out.println("3 - Thay đổi mật khẩu");
                System.out.println("4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)");
                System.out.println("0 - Thoát chương trình");

                System.out.println("nhap so menu: ");
                int key = Integer.parseInt(scanner.nextLine());//chong troi lenh
                switch (key) {
                    case 1://Thay đổi username
                        changeUserName(users);
                        break;
                    case 2://Thay đổi email
                        changeEmail(users);
                        break;
                    case 3://Thay đổi mật khẩu
                        changePassword(users);
                        break;
                    case 4://Đăng xuất
                        logOut();
                        break;
                    case 0://quit
                        isQuit = true;
                        System.out.println("Thoát chương trình");
                        break;
                    default:
                        break;
                }
            }
        }


    // unsuccessfulLogIn
    private static void reLogIn(ArrayList<User> users) {
        System.out.println("Enter username");
        String userName = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        for (User us : users) {
            if ((us.checkUsername(userName) == true) && (us.checkPassword(password) == true)) {
                successfulLogIn(users, userName);
            }
        }
    }

    private static void forgotPassword(ArrayList<User> users){
        System.out.println("Enter email");
        String email = scanner.nextLine();
        for(User us: users){
            if(us.checkEmail(email) == true){
                String newPassword = scanner.nextLine();
                us.setPassword(newPassword);
            }
            else{
                System.out.println("Account not exist");
            }
        }
    }


    private static void unsuccessfulLogIn(ArrayList<User> users) {
            int key = Integer.parseInt(scanner.nextLine());//chong troi lenh
            switch (key) {
                case 1://Nhap sai Username
                    System.out.println("Kiểm tra lại username");
                    reLogIn(users);
                    break;
                case 2://Nhap sai Password
                    switch (key) {
                        case 1://reLogin
                            reLogIn(users);
                            break;
                        case 2://forgotPassword
                            forgotPassword(users);
                            break;
                        default:
                            break;
            }
        }
    }

    //Login
    private static void login(ArrayList<User> users) {
        System.out.println("Enter username");
        String userName =  scanner.nextLine();
        System.out.println("Enter password");
        String password =  scanner.nextLine();
        for (User us : users) {
            if ((us.checkUsername(userName) == true) && (us.checkPassword(password) == true)) {
                successfulLogIn(users, userName);
            } else {
                unsuccessfulLogIn(users);
            }
        }
    }

    //Register
    private static void register(ArrayList<User> users) {
        System.out.println("Enter username");
        String userName = scanner.nextLine();
        System.out.println("Enter email");
        String email = scanner.nextLine();
        System.out.println("Enter password");
        String password =  scanner.nextLine();
        for (User us : users) {
            if ((us.checkEmail(email) == true) && (us.checkPassword(password) == true)) {
                users.add(new User(userName, email, password));
            }
            System.out.println(users.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Helen", "helen.tran13081993@gmail.com", "Helentran_123"));
//        users.add(new User("Hong", "thuhong.tran13081993@gmail.com", "Hongtran_123"));
//        users.add(new User("Huong", "thuhuong.tran13081993@gmail.com", "Huongtran_123"));


        System.out.println("1 - Log in");
        System.out.println("2 - Register");
        System.out.println("Press 1 - Log in/Press 2 - Register");
        int key = Integer.parseInt(scanner.nextLine());//chong troi lenh
        switch (key) {
            case 1://log in
                login(users);
                break;
            case 2://register
                register(users);
                break;
            default:
                break;

        }
    }
//        scanner.close();
}
