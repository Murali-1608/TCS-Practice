package Strings;

import java.util.*;

public class Index_01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("String: "+str);

        for(int i=0;i<str.length();i++)
        {
            if(i%2 != 0)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}
