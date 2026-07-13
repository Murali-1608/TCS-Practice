package Strings;
import java.util.*;
public class FirstLetter_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        int len = str.length();

        // Operations
        // 1. First Letter
        String First_s = "";
        First_s=First_s+str.charAt(0);

        // 2. Last Letter
        String Last_s = "";

        for(int i=0;i<len-1;i++) {
            if(str.charAt(i)==' ') {
                First_s=First_s+str.charAt(i+1);
            }
            else if(str.charAt(i+1)==' ') {
                Last_s = Last_s+str.charAt(i);
            }
        }
        Last_s = Last_s + str.charAt(len-1);
        System.out.println(First_s);
        System.out.println(Last_s);
    }
}
