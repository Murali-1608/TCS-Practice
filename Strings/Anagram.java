package Strings;
import java.util.*;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","".toLowerCase());

        int len1 = str1.length();
        int len2 = str2.length();

        if(len1 != len2)
        {
            System.out.print("Null");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))
        {
            System.out.print("Anagram");
        }
        else
        {
            System.out.print("Not Anagram");
        }
    }
}
