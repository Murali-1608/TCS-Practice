package Strings;

import java.util.*;

public class Reverse_Words_01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your String: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] != " ")
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
