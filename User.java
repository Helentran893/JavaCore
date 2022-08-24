import java.util.regex.Pattern;

public class User {
    private String userName;
    private String email;
    private String password;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    //    getter & setter
    public String getUserName() {
        return userName;
    }


    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    Check su ton tai cua Username, form email, password
    public boolean checkUsername(String userName) {
        boolean result = this.userName.equals(userName)? true: false;
        return result;
    }

    public boolean checkEmail(String email) {
        String emailPattern =
                "^[a-zA-Z][\\w-.]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        boolean result = Pattern.matches(emailPattern, email) ? true: false;
        return result;
    }

    public boolean checkPassword(String password) {
        String passwordPattern =
                "^(?=.*[A-Z])(?=.*[. , - _;]).{7,15}$";
        boolean result = Pattern.matches(passwordPattern, password) ? true: false;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean checkUserNameEqual(String userName){
        boolean result = this.userName.equals(userName)? true: false;
        return result;
    }

    public boolean checkEmailEqual(String email){
        boolean result = this.email.equals(email)? true: false;
        return result;
    }

    public boolean checkPasswordEqual(String password){
        boolean result = this.password.equals(password)? true: false;
        return result;
    }
}
