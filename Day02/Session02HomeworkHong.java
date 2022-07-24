
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;
import java.text.NumberFormat;
import java.util.Formatter;
import java.text.DecimalFormat;


public class Session02Homework { 
    public static void main(String[] args) {

        String letter = "Thân gửi các bạn,\nDưới đây là câu nói nổi tiếng\n\t\"A journey of a thousand miles begins with a single step\"\nNó có nghĩa là\n\t\"Hành trình ngàn dặm bắt đầu từ một bước chân\"\nChúc các bạn thành công !!!";
        System.out.println(letter);

        double distant = 0.0;
        String startTimeStr = "";
        String finishTimeStr = "";
        Scanner scanner = new Scanner(System.in);
        // nhập khoảng cách từ bàn phím, gán vào biến distant
        System.out.print("Nhập khoảng cách: ");
        distant = scanner.nextDouble();
        scanner.nextLine();
        
        // nhập thời gian bắt đầu, gán vào biên startTimeStr
        System.out.print("Nhập thời gian bắt đầu: ");
        startTimeStr = scanner.nextLine();
        
        // nhập thời gian kết thúc, gán vào biến finishTimeStr
        System.out.print("Nhập thời gian kết thúc: ");
        finishTimeStr = scanner.nextLine();

        scanner.close();
        
        // chuyển startTimeStr và finishTimeStr sang kiểu LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime startTime = LocalDateTime.parse(startTimeStr,formatter);
        LocalDateTime finishTime = LocalDateTime.parse(finishTimeStr,formatter);


        Duration duration = Duration.between(startTime, finishTime);
        // Tính và in ra thời gian chạy của bạn
        System.out.printf("Thời gian chạy %s phút\n", duration.toMinutes());
        // Tính và in ra vận tốc trung bình của bạn (km/h)
        System.out.printf("Vận tốc trung bình %s km/h\n", distant/(duration.toMinutes()/60.0));
    }
    }