package Strings;

import java.util.*;
public class Remove_Char
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();

        String ch = sc.nextLine();
        String s = str.replace(str,ch);
    }
}
