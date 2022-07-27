import java.util.Scanner;

public class Day03Homework {
    public static void main (String[] args){
        //Bai 1//
        Scanner scanner = new Scanner(System.in);
        boolean isEven = false;
        do {
            System.out.println("Hay nhap 1 so bat ky: ");
            int inputNumber = scanner.nextInt();
            if (inputNumber > 0) {
                System.out.println(inputNumber*(inputNumber+1)/2);
                isEven = true;
            }
        } while(isEven == false);
        
        //Bai 2//
        int number =0;
		int count =0;
		int sum = 0;
		for(number=2;number<=100;number++)
		{
		count =0;
		for (int i = 2; i <= number/2; i++)
				{
					if(number % i == 0)
					{
						count++;
						break;
					}
				}
			if(count == 0)
				{
					sum = sum + number;
				}  
		}
		System.out.println(sum);

        //Bai 3//
        int digitSum = 0;
        int Number;
        System.out.print("Enter the number: ");  
        Number = scanner.nextInt();
        while(Number>0) {
            int lastDigit = Number % 10;
            digitSum = digitSum + lastDigit;
            Number = Number / 10;
        } 
        System.out.println("Sum of Digits: " + digitSum);
    }
}
