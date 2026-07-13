package Strings;
import java.util.*;
public class Words_COUNT_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int Wcount = 0;
        int Scount = 0;
        String LargeString=" ";
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != " ") {
                Wcount++;
            }
        }
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' ') {
                Scount++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i].length() > LargeString.length()) {
                LargeString=arr[i];
            }
        }
        System.out.println("No.Of String: "+Wcount);
        System.out.println("No.of Space: "+Scount);
        System.out.println("Largest Word: "+LargeString);
    }
}
