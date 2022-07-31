import java.util.Scanner;
import java.util.*;
public class Day03Homework2Bai8 {
    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
  public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap 1 chuoi:");
    String str = scanner.nextLine();
    System.out.println("Original String : "+str);
	  System.out.println("String has all unique characters: "+is_Unique_str(str));
    scanner.close();
    }
}
