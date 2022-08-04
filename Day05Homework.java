import java.time.Month;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
import java.util.*;


public class Day05Homework {
    public static void main (String[] args){
        // Employee[] emList = new Employee[5];
        // emList[0]= new Employee("NV01", 
        //                         "A", 
        //                         LocalDate.of(1990,Month.AUGUST,4), 
        //                         GioiTinh.nu, 
        //                         100);

        // emList[1]= new Employee("NV02", 
        //                         "B", 
        //                         LocalDate.of(1991,Month.AUGUST,5), 
        //                         GioiTinh.nam, 
        //                         100);

        // emList[2]= new Employee("NV03", 
        //                         "C", 
        //                         LocalDate.of(1992,Month.AUGUST,6), 
        //                         GioiTinh.nu, 
        //                         200);

        // emList[3]= new Employee("NV04", 
        //                         "D", 
        //                         LocalDate.of(1993,Month.AUGUST,7), 
        //                         GioiTinh.nu, 
        //                         300);

        // emList[4]= new Employee("NV05", 
        //                         "A", 
        //                         LocalDate.of(1994,Month.AUGUST,8), 
        //                         GioiTinh.nam, 
        //                         300);

    // for (Employee em : emList) {
    //     System.out.println(em.ten);
    // }

    // // Tìm nhân viên theo id ( tìm chính xác)
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Nhap id nhan vien:");
    // String findid = scanner.nextLine();
    

    // for (Employee em : emList) {
    //     if (em.findId(findid)) {
    //         System.out.println("Nhan vien co ma " + findid);
    //     }
    // }

    // // Tìm nhân viên theo tên ( tìm theo từ khoá, ví dụ: Nguyễn Văn A 
    // // -> nhập A hoặc Văn => đều tìm ra được)
    // System.out.println("Nhap tu khoa ten nhan vien");
    // String keyword = scanner.nextLine();
    
    
    // for (int index = 0; index < emList.length; index++) {
    //     Employee em = emList[index];
    //     if (em.hasKeyword(keyword)) {
    //         System.out.println("ten: " + em.ten);        
    //     }        
    // }

    // // Đếm số nhân viên nam, nữ
    // int countnam = 0;
    
    // for (int index = 0; index < emList.length; index++) {
    //     Employee em = emList[index];
    //     if (em.demGioiTinh(GioiTinh.nam)) {
    //         countnam++;
    // }
    //     }
    // System.out.println("So nhan vien nam la: "+ countnam);

    // int countnu = 0;

    // for (int index = 0; index < emList.length; index++) {
    //     Employee em = emList[index];
    //     if (em.demGioiTinh(GioiTinh.nu)) {
    //         countnu++;
    // }
    //     }
    // System.out.println("So nhan vien nu la: "+ countnu);

    // Liệt kê các nhân viên trên 30 tuổi
    // System.out.println("Nhung nhan vien tren 30 tuoi:");
    // for (Employee em : emList) {
    //     Period period = Period.between(em.ngaySinh, LocalDate.now());
    //     int yearsDiff = Math.abs(period.getYears());
    //     if(yearsDiff>30){
    //         System.out.println(em.id + ": " + yearsDiff);
    //     }
    // }
    // Nhập từ bàn phím tháng bất kỳ trong năm; 
    // kiểm tra xem trong tháng đó có những nhân viên nào có ngày sinh nhật
    // System.out.println("Nhap thang trong nam");
    // Scanner scanner = new Scanner(System.in);
    // int thangSinhNhat = scanner.nextInt();
    // scanner.close();
    // for (int index = 0; index < emList.length; index++) {
    //         Employee em = emList[index];
    //         if (em.ThangSinhNhat(thangSinhNhat)) {
    //             System.out.println("ten: " + em.ten + "ngaysinh: " + em.ngaySinh);        
    //         }        
    //     }

    // In ra top 3 người có lương tháng cao nhất
    //         }        
    //     }


