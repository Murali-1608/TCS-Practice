package Strings;

import java.util.*;

public class LowerCase_01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("Enter your String: "+str);
        int Lowercount=0;
        int UpperCount=0;

        // Operation
        //char[] arr = str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                Lowercount++;
            }
        }

        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                UpperCount++;
            }
        }
        System.out.println("Lower Count Answer: "+Lowercount);
        System.out.println("Upper Count Answer: "+UpperCount);
    }
}
