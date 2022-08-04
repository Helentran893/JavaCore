import java.time.Month;
import java.time.LocalDate;
import java.io.Console;

public class Day05Homework {
    public static void main (String[] args){
        Employee[] emList = new Employee[5];
        emList[0]= new Employee("NV01", 
                                "A", 
                                LocalDate.of(1993,Month.AUGUST,4), 
                                GioiTinh.nu, 
                                100);

        emList[0]= new Employee("NV02", 
                                "B", 
                                LocalDate.of(1993,Month.AUGUST,5), 
                                GioiTinh.nam, 
                                100);

        emList[0]= new Employee("NV03", 
                                "C", 
                                LocalDate.of(1993,Month.AUGUST,6), 
                                GioiTinh.nu, 
                                200);

        emList[0]= new Employee("NV01", 
                                "D", 
                                LocalDate.of(1993,Month.AUGUST,7), 
                                GioiTinh.nu, 
                                300);

        emList[0]= new Employee("NV01", 
                                "A", 
                                LocalDate.of(1993,Month.AUGUST,8), 
                                GioiTinh.nu, 
                                300);
    for (Employee em : emList) {
        System.out.println(em.ten);
    }
}
}
/// Employee.java
import java.time.LocalDate;

// enum GioiTinh{
//     nam,
//     nu,
// };

// // Khai báo class nhiên viên (Employee) gồm các thông tin :
// // id (String, bắt đầu là NV, ví dụ: NV01, NV02)
// // tên (String)
// // ngày sinh (LocalDate)
// // giới tính (Sử dụng enum)
// // lương tháng (double)

// public class Employee {
//     public String id;
//     public String ten;
//     public LocalDate ngaySinh;
//     public GioiTinh gioiTinh; 
//     public double luongThang;

//     public Employee(String id, String ten, LocalDate ngaySinh, GioiTinh gioiTinh, double luongThang) {
//     this.id = id;
//     this.ten = ten;
//     this.ngaySinh = ngaySinh;
//     this.gioiTinh = gioiTinh;
//     this.luongThang = luongThang;
//     }
// }

