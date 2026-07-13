package Strings;
import java.util.*;
public class non_repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++) {
            int count=0;
            for(int j=0;j<len;j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
