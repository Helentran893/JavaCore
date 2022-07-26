import java.util.Scanner;

public class Main03 {
public static void main (String[] args){

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Nhập cân nặng theo kg: ");
    // double Weight = scanner.nextDouble();
    // scanner.nextLine();

    // System.out.print("Nhập chiều cao theo met: ");
    // double Height = scanner.nextDouble();
    // scanner.nextLine();
    // scanner.close();

    // Double BMI = Weight/(Height*Height);

    // if(BMI<18.5){
    //     System.out.println("Thiếu cân");
    // } else if((BMI>=18.5)&(BMI<=24.9)){
    //         System.out.println("Cân đối");
    //     } else{
    //         System.out.println("Thừa cân");
    //     }
        
    // int month = 12;
    // switch (month){
    // case 1:
    //     case 3:
    //     case 5:
    //     case 7:
    //     case 8:
    //     case 10:
    //     case 12:
    //         {System.out.println("Tháng có 31 ngày");
    //         break;}
    //     case 2:{
    //         System.out.println("Tháng có 28 ngày");
    //         break;}
    //     case 4:
    //     case 6:
    //     case 9:
    //     case 11:{
    //         System.out.println("Tháng có 30 ngày");
    //         break;
    //         }
    //     }
    // }

    // for (int index = 10; index >=0; index--){
    //     System.out.println("vong lap thu" + index);
    // }

    // for (int index = 0; index < 10; index = index + 2){
    //     System.out.println("vong lap:" + index);
    // }

    // for (int index =1; index<10;index++){
    //     System.out.println("Vong lap:" + index);
    //     //hạn chế trường hợp dòng sau://
    //     index = index + 2;
    // }


    // int count = 0;
    // String text = "Toi la java coder";
    // for (int index = 0; index < text.length(); index++){
    //     //System.out.println("ky tu:" + text.charAt(index));
    // char character = text.charAt(index);
    // if(character == 'a'){
    //     System.out.println("ky tu a");
    //     count = count + 1;
    // }}

    // int index = 0;
    // String text1 = "Toi la Hong";
    // while (index < text1.length()){
    //     System.out.println("ky tu o vi tri " + index + " la " + text1.charAt(index));
    //     index++;
    // }

    // index = text1.length()-1;
    // while (index >=0) {
    //     System.out.println("index " + index + " ky tu " + text1.charAt(index));
    //     index--;
    // }

    //in ra tren man hinh cau hoi
    //Hay nhap mot so bat ky
    //neu so nhap la so chan thi in ra la ban da nhap dung
    //neu so nhap la so le thi yeu cau user nhap lai

    // Scanner scanner = new Scanner(System.in);
    // boolean isEven = false;
    // do{
    //     System.out.println("Hay nhap 1 so bat ky: ");
    //     int inputNumber = scanner.nextInt();
    //     if(inputNumber%2==0){
    //         System.out.println("Ban da nhap dung");
    //         isEven = true;
    //     }
    //     } while(isEven == false);

    //     scanner.close();

    // for (int index = 1; index < 10; index++) {
    //     System.out.println("vong lap: " + index);
    //     index = index + 2;
    // }

    // int count = 0;
    //     String text = "Toi la java coder";
    //     for (int index = 0; index < text.length(); index++) {
    //         //System.out.println("ky tu: " + text.charAt(index));
    //         char character = text.charAt(index);
    //         if (character == 'a') {
    //             System.out.println("ky tu a");
    //             count = count + 1;
    //         }
    //     }
    //     System.out.println("so ky tu a: " + count);

    Scanner scanner = new Scanner(System.in);
    boolean isEven = false;
    do {
        System.out.println("Hay nhap 1 so bat ky: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber % 2 == 0) {
            System.out.println("ban da nhap dung");
            isEven = true;
        }
    } while(isEven == false);
    scanner.close();

    }
}

   



