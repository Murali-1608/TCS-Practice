package Strings;

import java.util.*;
public class Reverse_Strings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();

        for(int i=len-1 ;i>=0;i--)
        {
            String s = (str.charAt(i)+"");
            System.out.print(s);
        }
    }
}
