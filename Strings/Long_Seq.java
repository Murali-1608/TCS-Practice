package Strings;
import java.util.*;

public class Long_Seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int count = 1;
        int max = 1;

        for(int i=1;i<n;i++) {
            if(arr[i] == arr[i-1]+1) {
                count++;
            }
            else if(arr[i] != arr[i-1]) {
                count =1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
